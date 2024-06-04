package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import helpers.CreateSession;
import org.openqa.selenium.WebDriver;
import pages.Homepage;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * This class contains methods to perform action on home page.
 *
 */
public class HomePageSteps {

	Homepage homepage;
	WebDriver driver ;


	public HomePageSteps() throws IOException{
		driver = CreateSession.getWebDriver();
		homepage = new Homepage(driver);
	}


	@Given("^the user can open \"([^\"]*)\"$")
	public void theUserCanOpen(String url) throws Throwable {
		homepage.get(url);
	}

	@When("^the user sees page \"([^\"]*)\"$")
	public void theUserSeesPage(String pageName) throws Throwable {
		homepage.waitForPageToLoad(pageName);
	}



}
