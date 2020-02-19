package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DashBoardPage;
import page.LoginPage;
import util.BrowserFactory;

public class LoginTest {
	WebDriver driver;
	
	
	
	@Test
		public void validUserShouldBeAbleToLogin(){
		driver= BrowserFactory.startBrowser();
		
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.enterUsername("techfiosdemo@gmail.com");
		loginPage.enterPassword("abc123");
		loginPage.clickOnSignInButton();
		DashBoardPage dashboardPage = PageFactory.initElements(driver, DashBoardPage.class);
		
		
	}

}
