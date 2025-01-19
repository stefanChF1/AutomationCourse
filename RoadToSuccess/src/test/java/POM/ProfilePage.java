package POM;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.io.File;
import java.util.List;



public class ProfilePage extends BasePage {

    @FindBy(xpath = "//img[contains(@alt,'Profile Picture')]")
    private WebElement profilePicture;
    @FindBy(xpath = "//i[contains(@class,'far fa-plus-square fa-lg')]")
    private WebElement createNewPost;
    @FindBy(xpath = "/html/body/app-root/div[2]/app-profile/div/div[1]/app-profile-section/div/div/div[2]/div/div[1]/i")
    private WebElement editProfile;
    @FindBy(xpath = "//i[contains(@class,'fas fa-sign-out-alt fa-lg')]")
    private WebElement signOutButton;
    @FindBy(xpath = "//label[contains(@class,'btn-all btn btn-primary active')]")
    private WebElement allPostProfilePage;
    @FindBy(xpath = "//input[@id='upload-img']")
    private WebElement inputProfilePicture;
    @FindBy(xpath = "//label[contains(@class, 'delete-ask')]")
    private WebElement deleteThisPost;
    @FindBy(xpath = "/html/body/ngb-modal-window/div/div/app-post-modal/div/div[2]/div[4]/div/div/div/div[4]/div/div/button[1]")
    private WebElement deleteThisPostYes;


    public ProfilePage(WebDriver driver, Logger log) {
        super(driver, log);
        PageFactory.initElements(driver, this);
    }

    public void changeProfilePicture(File file) throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOf(profilePicture));
        boolean profilePictureElementPresent = profilePicture.isDisplayed();
        Assert.assertTrue(profilePictureElementPresent, "Profile picture element not found!");

        WebElement oldPic = profilePicture;
        String oldPhotoSource = oldPic.getAttribute("src");
        System.out.println("Old photo src: " + oldPhotoSource);
        inputProfilePicture.sendKeys(file.getAbsolutePath());
        Assert.assertTrue(profilePictureElementPresent, "Profile picture element not found!");
        WebElement popUp = driver.findElement(By.cssSelector("div.toast-message"));
        wait.until(ExpectedConditions.visibilityOf(popUp));
        //IK thread sleep sucks, but nothing else worked!
        Thread.sleep(5000);
        super.driver.navigate().refresh();

        wait.until(ExpectedConditions.visibilityOf(profilePicture));
        WebElement newPic = profilePicture;
        String newPhotoSource = newPic.getAttribute("src");
        System.out.println("New photo src: " + newPhotoSource);

        //Assert profile picture had changed
        Assert.assertNotEquals(oldPhotoSource, newPhotoSource, "The sources are same but should not be!");
    }

    public void signOut() {
        wait.until(ExpectedConditions.visibilityOf(signOutButton));
        boolean signOutButtonPresent = signOutButton.isDisplayed();
        Assert.assertTrue(signOutButtonPresent, "SignOut element not found!");
        signOutButton.click();

    }

    public void openPost(int index) {
        List<WebElement> posts = driver.findElements(By.cssSelector("app-post.app-post"));
        if (index >= 0 && index < posts.size()) {
            WebElement post = posts.get(index);
            wait.until(ExpectedConditions.visibilityOf(post));
            post.click();
        } else {
            throw new IndexOutOfBoundsException("Invalid post with index: " + index);
        }
    }
    public void deleteOpenedPost(){
        wait.until(ExpectedConditions.elementToBeClickable(deleteThisPost));
        deleteThisPost.click();

    }
    public void setDeleteThisPostYes(){
        wait.until(ExpectedConditions.elementToBeClickable(deleteThisPostYes));
        deleteThisPostYes.click();
    }
}
