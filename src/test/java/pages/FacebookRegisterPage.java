package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FacebookRegisterPage {

    @FindBy(id = "email")
    private By userName;

    @FindBy(id = "pass")
    private By pass;

    @FindBy(name = "login")
    private By login;

    public FacebookRegisterPage() {
    }

    public FacebookRegisterPage(By userName, By pass, By login) {
        this.userName = userName;
        this.pass = pass;
        this.login = login;
    }

    public By getUserName() {
        return userName;
    }

    public void setUserName(By userName) {
        this.userName = userName;
    }

    public By getPass() {
        return pass;
    }

    public void setPass(By pass) {
        this.pass = pass;
    }

    public By getLogin() {
        return login;
    }

    public void setLogin(By login) {
        this.login = login;
    }
}
