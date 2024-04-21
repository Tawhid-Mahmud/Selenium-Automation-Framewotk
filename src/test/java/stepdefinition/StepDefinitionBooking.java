package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.bytebuddy.implementation.bytecode.Throw;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class StepDefinitionBooking {
    @Given("User has the url")
    public void user_has_the_url() {
        Driver.getDriver().get(ConfigReader.getProperty("url_test"));
    }
    @When("User clicks on the Flight button from the nev bar")
    public void user_clicks_on_the_flight_button_from_the_nev_bar() {
        Driver.getDriver().findElement(By.xpath("//button[@aria-label='Dismiss sign-in info.']")).click();
        Driver.getDriver().findElement(By.id("flights")).click();
    }
    @Then("User clicks the round trip option")
    public void user_clicks_the_round_trip_option() {
        Driver.getDriver().findElement(By.xpath("//*[text() = 'Round trip']")).click();
    }





    @Given("User has the field to click where from option")
    public void user_has_the_field_to_click_where_from_option() {
        Driver.getDriver().findElement(By.xpath("//button[@data-ui-name='input_location_from_segment_0']")).click();

    }
    @When("user types {string} in the input field")
    public void user_types_in_the_input_field(String string) {
        Driver.getDriver().findElement(By.xpath("//*[@placeholder='Airport or city']")).sendKeys("new");
    }
    @Then("user choose the third option {string}")
    public void user_choose_the_third_option(String string) {
        Driver.getDriver().findElement(By.xpath("//*[@data-ui-name='locations_list_item'][3]")).click();
    }




    @Given("User has the where to field to click")
    public void user_has_the_where_to_field_to_click() {
        Driver.getDriver().findElement(By.xpath("//*[text()='Where to?']")).click();
    }
    @When("user can type {string} in the input field")
    public void user_can_type_in_the_input_field(String string) {
        Driver.getDriver().findElement(By.xpath("//input[@placeholder='Airport or city']")).sendKeys("bangla");
    }
    @Then("user can choose the first option")
    public void user_can_choose_the_first_option() {
        Driver.getDriver().findElement(By.xpath("//*[@data-ui-name='locations_list_item'][1]")).click();
    }


    @Given("User has the option to click on the date field")
    public void user_has_the_option_to_click_on_the_date_field() {
        Driver.getDriver().findElement(By.xpath("//button[@placeholder='Depart – Return'] ")).click();
    }
    @When("user clicks on the date field, calendar shows up")
    public void user_clicks_on_the_date_field_calendar_shows_up() {
        if(Driver.getDriver().findElement(By.xpath("//*[@data-ui-name='calendar_body']")).isDisplayed()){
            System.out.println("Calendar visible");
        }
        else {
            System.out.println("Calendar is not visible");
        }

    }
    @Then("user can choose the departure date and return date")
    public void user_can_choose_the_departure_date_and_return_date() {
        Driver.getDriver().findElement(By.xpath("//button[@class='Actionable-module__root___b-k2d Button-module__root___e++Sn Button-module__root--variant-tertiary___Kr0Bm Button-module__root--icon-only___I42HC Button-module__root--size-large___hx5kG Button-module__root--variant-tertiary-neutral___A5bWt Calendar-module__control___igb9X Calendar-module__control--prev___0Q1vL']")).click();
        Driver.getDriver().findElement(By.xpath("//*[@data-date='2024-04-30']")).click();
        Driver.getDriver().findElement(By.xpath("//*[@data-date='2024-05-25']")).click();

    }
    @Then("user can can click the search button")
    public void user_can_can_click_the_search_button() {
        Driver.getDriver().findElement(By.xpath("//button[@data-ui-name='button_search_submit']")).click();
    }




    @Given("user can see multiple flight options")
    public void user_can_see_multiple_flight_options() {
        //Driver.getDriver().manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        //System.out.println("Time out worked");

        if(Driver.getDriver().findElement(By.xpath("//button[@data-testid='search_tabs_BEST']")).isDisplayed()){
            System.out.println("Results are visible");
        } else {
            System.out.println("No results");
        }
    }
    @When("user can click on the {string} button")
    public void user_can_click_on_the_button(String string) {

        //Driver.getDriver().manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        WebElement element = Driver.getDriver().findElement(By.xpath("//*[@data-testid='search_tabs_CHEAPEST']"));
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(element).click().build().perform();

        //Driver.getDriver().findElement(By.xpath("//*[@data-testid='search_tabs_CHEAPEST']")).click();
        System.out.println("it worked");



        //new WebDriverWait(getWebDriver(), 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-testid='search_tabs_CHEAPEST']"))).click();

    }
    @Then("from the first option user can click {string} button")
    public void from_the_first_option_user_can_click_button(String string) {
        Driver.getDriver().findElement(By.xpath("//button[@aria-label='View details ']")).click();
    }
    @Then("click the {string} button")
    public void click_the_button(String string) {
        Driver.getDriver().findElement(By.xpath("//*[text()='Select']")).click();
    }



}
