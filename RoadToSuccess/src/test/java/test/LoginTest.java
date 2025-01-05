package test;

import POM.BasePage;
import POM.LoginPage;
import org.testng.annotations.Test;

import java.io.File;

public class LoginTest extends gui.base.BaseTest {

    @Test
    public void signInWithValidCredentials() throws InterruptedException {
        LoginPage loginPageMethods = new LoginPage(super.driver,log);

        driver.get("http://training.skillo-bg.com:4300/users/login");
        loginPageMethods.enterUserName("MainAdminUser");
        loginPageMethods.enterPass("Admin123");
        loginPageMethods.clickRememberMe();
        loginPageMethods.clickSignIn();
//        loginPageMethods.openProfile();
//        loginPageMethods.ChangeProfilePicture("/Users/stefanstoyanov/Desktop/phonepicutres-TA.webp");

        Thread.sleep(5000);
    }
}
