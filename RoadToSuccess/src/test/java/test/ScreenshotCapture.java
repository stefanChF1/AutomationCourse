package test;


import POM.LoginPage;
import org.testng.annotations.Test;

public class ScreenshotCapture extends gui.base.BaseTest {

    //This test is designed to fail and trigger the screenshot function

    @Test
    public void screenshotCapture() {
        LoginPage loginPageMethods = new LoginPage(super.driver, log);

        driver.get(LOGIN_URL);
            //Enter valid credentials
        loginPageMethods.enterUserName("MainAdminUser");
        loginPageMethods.enterPass("Admin123");
        loginPageMethods.clickRememberMe();
        loginPageMethods.clickSignIn();

            //Fail step - checking the popup message
        loginPageMethods.popUpMsgFail();
    }
}
