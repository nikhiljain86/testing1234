package TestCase;

import org.testng.annotations.Test;

import Base.Base;
import PageObject.Home;

public class TC_001 extends Base {
	
	@Test
	public void logintest(){
		Home h = new Home(driver, br);
		System.out.println("i am test case 1");
		h.emailbox("nikhil123");
		h.passwordbox("nikhil123");
		h.loginbutton();
		
	}
	
	

}
