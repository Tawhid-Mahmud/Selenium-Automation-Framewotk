package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import pages.BookingStaysPage;
import utilities.ConfigReader;
import utilities.Driver;

public class StepdefinitionBookingStaysPage {
    //Create an instance of the BookingStaysPage
    BookingStaysPage BStays = new BookingStaysPage(Driver.getDriver());
    @Given("User has the booking.com url")
    public void user_has_the_booking_com_url() {
        Driver.getDriver().get(ConfigReader.getProperty("booking_url"));
    }
    @When("User click on the Stays button")
    public void user_click_on_the_stays_button() {
        BStays.dimissPopUp();
        //BStays.staysButton();

    }
    @When("Enters New York on the Where are you going? section")
    public void enters_new_york_on_the_where_are_you_going_section() {
        BStays.whereAreYouGoingField();
        BStays.enterDestination("New York");
    }
    @When("Enters May {int} for check-in date")
    public void enters_may_for_check_in_date(Integer int1) {
        String checkInDate = "2024-05-15";

        BStays.enterCheckInDate(checkInDate);
    }
    @When("Enters May {int} for check-out date")
    public void enters_may_for_check_out_date(Integer int1) {
        String checkOutDate = "2024-05-20";
        BStays.enterCheckInDate(checkOutDate);
    }
    @When("Two Adults and One room for occupancy box")
    public void two_adults_and_one_room_for_occupancy_box() {
        BStays.enterOccupancy();
        BStays.clickOnDoneButton();
    }
    @Then("Click the search button")
    public void click_the_search_button() {
        BStays.clickOnSerachButton();
    }

}
