package stepdefinition;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.eo.Se;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.FacebookRegisterPage;
import pages.SnachbotfunctionalPage;
import utilities.ConfigReader;
import utilities.Driver;

public class SteodefinitionFacebook {
    //SnachbotfunctionalPage sb = new SnachbotfunctionalPage();

    FacebookRegisterPage fb = new FacebookRegisterPage();

    //opens the url
    @Given("User has facebook url")
    public void user_has_facebook_url() {
        Driver.getDriver().get(ConfigReader.getProperty("url_prod"));

    }
    @When("user clicks create new account")
    public void user_clicks_create_new_account() {
        //Driver.getDriver().findElement(fp.getUserName()).sendKeys("3472484276");
        Driver.getDriver().findElement(By.xpath("//*[text() = 'Create new account']")).click();
    }

    @Then("user sees the sign up page")
    public void user_sees_the_sign_up_page() {

        Driver.getDriver().findElement(By.name("firstname")).sendKeys("Tawhid");
        Driver.getDriver().findElement(By.name("lastname")).sendKeys("Shuvo");
        Driver.getDriver().findElement(By.name("reg_email__")).sendKeys("tawhidmahmud447@gmail.com");
        Driver.getDriver().findElement(By.name("reg_passwd__")).sendKeys("Test123@");


        Select month = new Select(Driver.getDriver().findElement(By.id("month")));
        month.selectByValue("12");
        Select day = new Select(Driver.getDriver().findElement(By.id("day")));
        day.selectByValue("12");
        Select year = new Select(Driver.getDriver().findElement(By.id("year")));
        year.selectByValue("1998");

        WebElement radio1 = Driver.getDriver().findElement(By.xpath("//*[text() = 'Male']"));
        radio1.click();

        Driver.getDriver().findElement(By.name("reg_email_confirmation__")).sendKeys("tawhidmahmud447@gmail.com");

        Driver.getDriver().findElement(By.xpath("//button[text() = 'Sign Up']")).click();
        //Driver.getDriver().findElement(By.xpath("//*[text() = 'Do you already have a Facebook account?']")).notify();
    }




/*
    @Given("user is in sign up page")
    public void user_is_in_sign_up_page() {

    }
    @When("user fills first name, last name, mobile number, password, date of birth, and gender")
    public void user_fills_first_name_last_name_mobile_number_password_date_of_birth_and_gender() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("user can click the sign up page")
    public void user_can_click_the_sign_up_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("create an account successfully")
    public void create_an_account_successfully() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

*/

}
