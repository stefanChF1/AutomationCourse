package POM;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

        //home page locators
    @FindBy (id = "nav-link-home")
    private WebElement navBarHomeButton;
    @FindBy (id = "nav-link-login")
    private WebElement navBarLoginButton;
    @FindBy (id = "nav-link-profile")
    private WebElement navBarProfileButton;
    @FindBy (xpath = "//i[contains(@class,'fas fa-sign-out-alt fa-lg')]/..")
    private WebElement navBarLogOutButton;


    public HomePage(WebDriver driver, Logger log) {
        super(driver, log);
        PageFactory.initElements(driver, this);
    }

    private void navigateToHomePage(){

    }
}
