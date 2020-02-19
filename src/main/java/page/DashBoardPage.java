package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DashBoardPage {
	
	
	WebDriver driver;

	public DashBoardPage(WebDriver Driver) {
     this.driver = Driver;
	}

	@FindBy(how = How.XPATH, using = "//h2[contains(text(),'Dashboard ')]")
	WebElement DASHBOARD_TITLE;
	
	
	
	
	
	
	
}
