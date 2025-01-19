package test;

import POM.LoginPage;
import POM.ProfilePage;
import org.testng.annotations.Test;

import javax.swing.plaf.TableHeaderUI;

public class DeletePost extends gui.base.BaseTest {

    @Test
    public void deletePost() throws InterruptedException {


        LoginPage loginPageMethods = new LoginPage(driver, log);

        driver.get(LOGIN_URL);
        //Login with valid credentials
        loginPageMethods.enterUserName("MainAdminUser");
        loginPageMethods.enterPass("Admin123");
        loginPageMethods.clickRememberMe();
        loginPageMethods.clickSignIn();
        //Navigate to profile page
        loginPageMethods.openProfile();
        //Creating post

        ProfilePage profilePageMethods = new ProfilePage(driver, log);
        profilePageMethods.openPost(1);
        profilePageMethods.deleteOpenedPost();
        profilePageMethods.setDeleteThisPostYes();
        loginPageMethods.popUpMsgPostDeleted();
        Thread.sleep(5000);
    }
}
