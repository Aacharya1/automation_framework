package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver Driver) {
   this.driver = Driver;
	}

	// Library of elements
	// WebElement USERNAME_FIELD_ELEMENT = driver.findElement(By.id("accg"));
	// By PASSWORD_FIELD_LOCATOR = By.id("bbb");

	@FindBy(how = How.ID, using = "username")
	WebElement USERNAME_FIELD;

	
	@FindBy(how = How.ID, using = "password")
	WebElement PASSWORD_FIELD;
	
	@FindBy(how = How.NAME, using = "login")
	WebElement SUBMIT_FIELD;
	
	
	//METHODS TO INTERACT WITH THE ELEMENT
	public void enterUsername(String userName){
		USERNAME_FIELD.sendKeys(userName);
	}
	
	
	public void enterPassword(String password){
		PASSWORD_FIELD.sendKeys(password);
	}
	public void clickOnSignInButton(){
		SUBMIT_FIELD.click();
	}
	
	
	
	
	
	
	
	
	
	
}
