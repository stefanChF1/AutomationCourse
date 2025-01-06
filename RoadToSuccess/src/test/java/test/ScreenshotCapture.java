package test;

import POM.BasePage;
import POM.HomePage;
import POM.LoginPage;
import org.testng.annotations.Test;

public class ScreenshotCapture extends gui.base.BaseTest {

    @Test
    public void screenshotCapture() {
        LoginPage loginPageMethods = new LoginPage(super.driver, log);

        driver.get(LOGIN_URL);
        loginPageMethods.enterUserName("MainAdminUser");
        loginPageMethods.enterPass("Admin123");
        loginPageMethods.clickRememberMe();
        loginPageMethods.clickSignIn();
        loginPageMethods.popUpMsgFail();
    }
}
