package org.global;

import org.junit.*;
import org.openqa.selenium.WebElement;

public class BrowserTesting extends BaseClass {
	public static BaseClass b = new BaseClass();
	public static LoginPage l = new LoginPage();

	@BeforeClass
	public static void BrowserLaunch() {

		try {
			b.getDriver(b.excelRead(1, 5));
			
			System.out.println("Browser Launched Successfully");
		} catch (Exception e) {
			System.out.println("Browser Not launched" + e.getMessage());
		}
	}

	@Before
	public void UrlLaunch() {
		try {
			b.getUrl(b.excelRead(1, 3));
			
			System.out.println("Url Launched successfully");
		} catch (Exception e) {
			System.out.println("Url Not launched" + e.getMessage());
		}
	}

	@Test
	public void EnterCrendials() {
 
		 try {
			 l = new LoginPage();
			 WebElement username = l.getUsername();
			 username.sendKeys("Revathi@123");
			 WebElement password = l.getPassword();
			 password.sendKeys("Rev123");
			 
			 System.out.println("Credentials are Entered Successfully");
		} catch (Exception e) {
			System.out.println("Credentials are Not Entered" + e.getMessage());
		}
		
	}

	@After
	public void LoginButtonClick() {

		try {
			l = new LoginPage();
			WebElement Login = l.getLogin();
			Login.click();	
			System.out.println("Login Button Clicked Successfully");
		} catch (Exception e) {
			System.out.println("Login Button Not Clicked" + e.getMessage());
		}
		
	}

	@AfterClass
	public static void tc05() {
		
		System.out.println("Test5");
	}

}


