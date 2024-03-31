package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class SnachbotfunctionalPage {

	public SnachbotfunctionalPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy (xpath = "//a [@id = \"hs-eu-confirmation-button\"]")
	public WebElement cookiesAcceptButton;
	
	@FindBy (xpath = "//a [. = 'Accept'] ")
	public WebElement acceptButton;
	
	@FindBy (id = "sntch_button")
	public WebElement snachButton;
	
	@FindBy (xpath = "//div[@id='sntch_close']")
	public WebElement snachBoxClose;
	
	@FindBy (id = "chat_input")
	public WebElement chatBox;
	
	@FindBy (xpath = "//input[@id=\"twotabsearchtextbox\"]")
	public WebElement searchBoxAmazon;
	
	@FindBy (xpath = "//p[.='There’s lots I can show you but first please let me know your name.']")
	public WebElement snachboxMessage;
	
	@FindBy (xpath = "//p[.='Hi FirstName! Good to chat to you. Did I get your name right?']")
	public WebElement returnMessage;
	
	@FindBy (xpath = "//p [.=\"Great! Here's what I can chat about with you:\"]")
	public WebElement returnInformationalMessage;
	
	@FindBy (xpath = "//span[.='send']")
	public WebElement sendMessageButton;
	
	@FindBy (xpath = "//span[.='Yes']")
	public WebElement yesButton;
}
