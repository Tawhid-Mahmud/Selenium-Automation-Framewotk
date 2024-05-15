package pages;

import org.checkerframework.checker.formatter.qual.Format;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import stepdefinition.SteodefinitionFacebook;
import utilities.Driver;

import java.time.DateTimeException;
import java.time.format.DateTimeFormatter;

public class BookingStaysPage {

    @FindBy (id = "stays")
    private WebElement staysButton;
    @FindBy (xpath = "//button[@aria-label='Dismiss sign-in info.']")
    private WebElement dismissSign;
    @FindBy (xpath = "//input[@name = 'ss']")
    private WebElement WhereToButton;
    @FindBy (xpath = "//*[@class= 'be14df8bfb'][1]")
    private WebElement dropDownOption;
    @FindBy (xpath = ("//button[@data-testid = 'occupancy-config']"))
    private WebElement occupancySearchBox;
    @FindBy (xpath = "//*[text() = 'Done']")
    private WebElement doneButton;

    @FindBy (xpath = "//*[text() = 'Search']")
    private WebElement searchButton;


    public WebDriver driver;
    public BookingStaysPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this); //this was the problem
    }

    public void dimissPopUp(){
        System.out.println("pop up is here");
        dismissSign.click();
    }

    public void staysButton(){
        System.out.println("Stay button is here");
        staysButton.click();
    }

    public void whereAreYouGoingField(){
        System.out.println("Testign to see if we here ");
        WhereToButton.click();
    }
    public void enterDestination(String input){
        WhereToButton.sendKeys("New York");
        dropDownOption.click();
    }

    public void enterCheckInDate(String inputDateOne)  {
        WebElement checkInDate = Driver.getDriver().findElement(By.xpath("//*[@data-date= '"+inputDateOne+"']"));
        checkInDate.click();
    }

    public void enterCheckOutDate(String inputDateTwo){
        WebElement checkOutDate = Driver.getDriver().findElement(By.xpath("//*[@data-date= '"+inputDateTwo+"']"));

    }
    public void enterOccupancy(){
        occupancySearchBox.click();
    }

    public void clickOnDoneButton(){
        doneButton.click();
    }

    public void clickOnSerachButton(){
        searchButton.click();
    }

}
