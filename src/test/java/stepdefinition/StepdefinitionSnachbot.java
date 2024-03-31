package stepdefinition;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.FacebookRegisterPage;
import pages.SnachbotfunctionalPage;
import utilities.ConfigReader;
import utilities.Driver;

public class StepdefinitionSnachbot {
	
	SnachbotfunctionalPage sb = new SnachbotfunctionalPage();

	FacebookRegisterPage fp = new FacebookRegisterPage();


	@Given("User has facebook url")
	public void user_has_facebook_url() {
		Driver.getDriver().get(ConfigReader.getProperty("url_prod"));

	}
	@When("user clicks create new account")
	public void user_clicks_create_new_account() {
		Driver.getDriver().findElement(fp.getUserName()).sendKeys("3472484276");
	}

	@Then("user sees the sign up page")
	public void user_sees_the_sign_up_page() {
		Driver.getDriver().findElement(fp.getPass()).sendKeys("TAe1234");
	}

}