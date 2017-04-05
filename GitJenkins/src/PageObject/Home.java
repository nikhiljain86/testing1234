package PageObject;

import java.util.ResourceBundle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home {
	
	private WebDriver driver;
	private ResourceBundle br;
	
	public Home(WebDriver driver, ResourceBundle br){
		this.driver=driver;
		this.br=br;
		
	}
	
	public void emailbox(String email){
		
		driver.findElement(By.xpath(br.getString("email"))).sendKeys(email);
		
	}

	
	public void passwordbox(String password){
		
		driver.findElement(By.xpath(br.getString("password"))).sendKeys(password);
		
		
	}
	
	public void loginbutton(){
		
		driver.findElement(By.xpath(br.getString("loginbutton"))).click();
	}
	
	public void firstname(){
		
		
	}
	
	public void lastname(){
		
		
	}
	
	public void mobilenumber(){
		
		
	}
	
	public void reentermobile(){
		
		
	}
	
	public void newpassword(){
		
		
	}
	
	public void birthday(){
		
		
	}
	
	public void gender(){
		
		
	}
	
	public void createaccountbutton(){
		
		
	}
}
