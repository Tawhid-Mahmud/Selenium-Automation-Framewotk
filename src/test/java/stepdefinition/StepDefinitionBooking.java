package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.ConfigReader;
import utilities.Driver;

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
        Driver.getDriver().findElement(By.xpath("//*[@data-date='2024-05-15']")).click();
        Driver.getDriver().findElement(By.xpath("//*[@data-date='2024-05-25']")).click();

    }
    @Then("user can can click the search button")
    public void user_can_can_click_the_search_button() {
        Driver.getDriver().findElement(By.xpath("//button[@data-ui-name='button_search_submit']")).click();
    }




    @Given("user can see multiple flight options")
    public void user_can_see_multiple_flight_options() {
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


    }
    @Then("from the first option user can click {string} button")
    public void from_the_first_option_user_can_click_button(String string) {
        Driver.getDriver().findElement(By.xpath("//button[@aria-label='View details ']")).click();
    }
    @Then("click the {string} button")
    public void click_the_button(String string) {
        WebElement dropDown =  Driver.getDriver().findElement(By.xpath("//*[text()='Select']"));
        dropDown.click();

    }



    @Given("user navigated to the choose your fare page")
    public void user_navigated_to_the_choose_your_fare_page() {
        if(Driver.getDriver().findElement(By.xpath("//*[text() = 'Choose your fare']")).isDisplayed()){
            System.out.println("Choose your fare page is visible");
        } else {
            System.out.println("Page is not visible");
        }

    }
    @When("user confirms trip summary")
    public void user_confirms_trip_summary() {
        Boolean tripType = Driver.getDriver().findElement(By.xpath("//*[text()='Round trip']")).isDisplayed();
        Boolean traveler = Driver.getDriver().findElement(By.xpath("//*[text()='1 traveler']")).isDisplayed();
        Boolean departureDate = Driver.getDriver().findElement(By.xpath("//*[contains(text(), 'Tue, May 15') ] ")).isDisplayed();
        Boolean arrivalDate = Driver.getDriver().findElement(By.xpath("//*[text() = 'Sat, May 25']")).isDisplayed();
        if(traveler & traveler & departureDate & arrivalDate){
            System.out.println("Trip summary is good");
        } else {
            System.out.println("Something is wrong");
        }

    }
    @Then("test is done")
    public void test_is_done() {
        System.out.println("Test is complete for booking flights");
    }
}
