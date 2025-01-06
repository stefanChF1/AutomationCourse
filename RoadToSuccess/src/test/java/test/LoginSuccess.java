package test;

import POM.LoginPage;
import org.testng.annotations.Test;

public class LoginSuccess extends gui.base.BaseTest {

            //This test is designed to validate the login function
    @Test
    public void signInWithValidCredentials() {
        LoginPage loginPageMethods = new LoginPage(super.driver,log);

        driver.get(LOGIN_URL);
            //Enter valid credentials
        loginPageMethods.enterUserName("MainAdminUser");
        loginPageMethods.enterPass("Admin123");
        loginPageMethods.clickRememberMe();
        loginPageMethods.clickSignIn();
            //Assert popup msg
        loginPageMethods.popUpMsgSuccess();
            //Assert by opening the user profile
        loginPageMethods.openProfile();

    }
}
