package POM;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.io.File;


public class NewPostPage extends BasePage {

    @FindBy (id = "nav-link-new-post")
    private WebElement createNewPostNavBar;
    @FindBy (css = ".file[type='file']")
    private WebElement inputNewPostPicture;
    @FindBy (name = "caption")
    private WebElement addCaption;
    @FindBy (id = "create-post")
    private WebElement createPost;


    public NewPostPage(WebDriver driver, Logger log) {
        super(driver, log);
        PageFactory.initElements(driver, this);
    }

    public void createPost(File file) {
        wait.until(ExpectedConditions.visibilityOf(createNewPostNavBar));
        createNewPostNavBar.click();
        inputNewPostPicture.sendKeys(file.getAbsolutePath());
    }

    public void addCaption(String caption) {
        addCaption.sendKeys(caption);
        wait.until(ExpectedConditions.elementToBeClickable(createPost));
        createPost.click();

    }
}
