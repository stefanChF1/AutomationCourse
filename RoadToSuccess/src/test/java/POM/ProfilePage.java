package POM;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.io.File;

public class ProfilePage extends BasePage{

    @FindBy (xpath = "//img[contains(@alt,'Profile Picture')]" )
        private WebElement profilePicture;
    @FindBy (xpath = "//i[contains(@class,'far fa-plus-square fa-lg')]")
        private WebElement newPost;
    @FindBy (xpath = "/html/body/app-root/div[2]/app-profile/div/div[1]/app-profile-section/div/div/div[2]/div/div[1]/i")
        private WebElement editProfile;
    @FindBy (xpath = "//i[contains(@class,'fas fa-sign-out-alt fa-lg')]")
        private WebElement signOutButton;
    @FindBy (xpath = "//label[contains(@class,'btn-all btn btn-primary active')]")
        private WebElement allPostProfilePage;

    public ProfilePage(WebDriver driver, Logger log) {
        super(driver, log);
        PageFactory.initElements(driver, this);
    }
    public void changeProfilePicture(File file){
        wait.until(ExpectedConditions.visibilityOf(profilePicture));
        boolean profilePictureElementPresent = profilePicture.isDisplayed();
        Assert.assertTrue(profilePictureElementPresent, "Profile picture element not found!");
        profilePicture.click();
        profilePicture.sendKeys(file.getAbsolutePath());
    }
    public void signOut(){
        wait.until(ExpectedConditions.visibilityOf(signOutButton));
        boolean signOutButtonPresent = signOutButton.isDisplayed();
        Assert.assertTrue(signOutButtonPresent, "SignOut element not found!");
        signOutButton.click();
    }
    public void popUpMsgSignOut(){

    }
}
