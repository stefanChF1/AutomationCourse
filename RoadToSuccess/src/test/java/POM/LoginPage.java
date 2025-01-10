package POM;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class LoginPage extends BasePage {

    @FindBy(id = "defaultLoginFormUsername")
    private WebElement inputUsername;
    @FindBy(id = "defaultLoginFormPassword")
    private WebElement inputPassword;
    @FindBy(xpath = "/html/body/app-root/div[2]/app-login/div/div/form/div/input")
    private WebElement rememberMe;
    @FindBy(id = "sign-in-button")
    private WebElement signIn;
    @FindBy(id = "nav-link-profile")
    private WebElement navBarProfile;
    @FindBy(xpath = "//img[contains(@alt,'Profile Picture')]")
    private WebElement profilePicture;
    @FindBy(css = "div.toast-message")
    private WebElement popUpMsg;

    public LoginPage(WebDriver driver, Logger log) {
        super(driver, log);
        PageFactory.initElements(driver, this);

    }

    public void enterUserName(String userName) {
        wait.until(ExpectedConditions.visibilityOf(inputUsername));
        boolean usrFieldPresent = inputUsername.isDisplayed();
        Assert.assertTrue(usrFieldPresent, "Field is not present!");
        inputUsername.sendKeys(userName);
    }

    public void enterPass(String pass) {
        wait.until(ExpectedConditions.visibilityOf(inputPassword));
        boolean passFieldPresent = inputPassword.isDisplayed();
        Assert.assertTrue(passFieldPresent, "Field is not present!");
        inputPassword.sendKeys(pass);
    }

    public void clickRememberMe() {
        rememberMe.click();
        Boolean rememberMeSelected = wait.until
                (ExpectedConditions.elementSelectionStateToBe(rememberMe, true));
        Assert.assertTrue(rememberMeSelected, "Remember me is not selected!");
    }

    public void clickSignIn() {
        wait.until(ExpectedConditions.visibilityOf(signIn));
        boolean signInButtonPresent = signIn.isDisplayed();
        Assert.assertTrue(signInButtonPresent, "Button not found");
        signIn.click();
    }
    public void popUpMsgSuccess() {
        wait.until(ExpectedConditions.visibilityOf(popUpMsg));
        Assert.assertEquals(popUpMsg.getText(), "Successful login!");
    }
    public void popUpMsgFail(){
        wait.until(ExpectedConditions.visibilityOf(popUpMsg));
        Assert.assertEquals(popUpMsg.getText(), "Wrong username or password!");
    }
    public void popUpMsgLogout(){
        wait.until(ExpectedConditions.visibilityOf(popUpMsg));
        Assert.assertEquals(popUpMsg.getText(), "Successful logout!");

    }
    public void popUpMsgSuccessfulReg(){
        wait.until(ExpectedConditions.visibilityOf(popUpMsg));
        Assert.assertEquals(popUpMsg.getText(), "Successful register!");
    }
    public void openProfile(){
        wait.until(ExpectedConditions.visibilityOf(navBarProfile));
        boolean profileButtonPresent = navBarProfile.isDisplayed();
        Assert.assertTrue(profileButtonPresent, "Profile button is not present!");
        navBarProfile.click();

    }
}

