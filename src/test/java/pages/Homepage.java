package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import helpers.CommonMethods;

/**
 * This class has web elements of homepage which are used by HomePageSteps
 */
public class Homepage extends CommonMethods {

	
	public Homepage(WebDriver driver) throws IOException {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	//sample locators
	public By sampleButton = By.xpath("addyourXpath");

	
	
	
	
	
	
	
}
