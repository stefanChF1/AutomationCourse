package test;

import POM.LoginPage;
import POM.NewPostPage;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.io.File;

public class CreatingPost extends gui.base.BaseTest {

    //This test is designed to validate the Create a post function
    @Test
    public void UploadingPictureTest() throws InterruptedException {


        LoginPage loginPageMethods = new LoginPage(super.driver,log);

        driver.get(LOGIN_URL);
            //Login with valid credentials
        loginPageMethods.enterUserName("MainAdminUser");
        loginPageMethods.enterPass("Admin123");
        loginPageMethods.clickRememberMe();
        loginPageMethods.clickSignIn();
            //Navigate to profile page
        loginPageMethods.openProfile();
            //Creating post

        NewPostPage newPostPageMethods = new NewPostPage(super.driver,log);
            //Choose which picture you want to post
        newPostPageMethods.createPost(leoCheers);
            //Write your caption below
        newPostPageMethods.addCaption("Cheers to the wicked!");
        Thread.sleep(5000);

    }
}
