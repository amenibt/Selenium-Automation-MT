package stepDefinitions;

import java.io.IOException;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.gherkin.model.Scenario;
import com.mongodb.MapReduceCommand.OutputType;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import managers.PageObjectManager;

import pageObjects.HomePage;

public class HomePageSteps {
	WebDriver driver;
	HomePage homePage;
	PageObjectManager pageObjectManager;

	@Given("^user is on login Page$")
	public void user_is_on_login_Page() throws Throwable {

		pageObjectManager = new PageObjectManager(driver);
		driver = pageObjectManager.getDriver();
		homePage = pageObjectManager.getHomePage();
		homePage.navigateTo_HomePage();
	}

	@When("^the user put username and password$")
	public void the_user_put_username_and_password() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("helooooooooo");
		homePage.enter_Username();
		homePage.enter_Password();
	}
//
//	@When("^press on the login button$")
//	public void press_on_the_login_button() throws Throwable {
//
//	}
//
//	@Then("^a success message appears$")
//	public void a_success_message_appears() throws Throwable {
//		// Write code here that turns the phrase above into concrete actions

	// }

}
