package Base;

import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {
	
	public WebDriver driver;
	public ResourceBundle br;
	public Actions a;
	
	
	@BeforeMethod
	public void base(){
		br=ResourceBundle.getBundle("objectrepository");
		if (br.getString("browser").equalsIgnoreCase("firefox")){
			
			driver= new FirefoxDriver();
		}
		else if(br.getString("browser").equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
			driver= new ChromeDriver();
		}else{
			System.setProperty("webdriver.chrome.driver","./Driver/IEDriverServer.exe");
		}
		driver.get(br.getString("baseurl"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
		a = new Actions(driver);
	}
	
	@AfterMethod
	public void end(){
		
		driver.close();
	}
	

}
