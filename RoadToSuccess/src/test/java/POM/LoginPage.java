package POM;

import net.bytebuddy.asm.Advice;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.io.File;

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
//    @FindBy(xpath = "//i[contains(@class,'far fa-plus-square fa-lg')]")
//    private WebElement newPost;
//    @FindBy(xpath = "/html/body/app-root/div[2]/app-profile/div/div[1]/app-profile-section/div/div/div[2]/div/div[1]/i")
//    private WebElement editProfile;
//    @FindBy(xpath = "//i[contains(@class,'fas fa-sign-out-alt fa-lg')]")
//    private WebElement signOutButton;
//    @FindBy(xpath = "//label[contains(@class,'btn-all btn btn-primary active')]")
//    private WebElement allPostProfilePage;

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
    public void openProfile(){
        wait.until(ExpectedConditions.visibilityOf(navBarProfile));
        boolean profileButtonPresent = navBarProfile.isDisplayed();
        Assert.assertTrue(profileButtonPresent, "Profile button is not present!");
        navBarProfile.click();
    }
    public void ChangeProfilePicture(String path) {
        wait.until(ExpectedConditions.visibilityOf(profilePicture));
        boolean profilePictureElementPresent = profilePicture.isDisplayed();
        Assert.assertTrue(profilePictureElementPresent, "Profile picture element not found!");
        profilePicture.click();
        profilePicture.sendKeys(path);

    }
}

