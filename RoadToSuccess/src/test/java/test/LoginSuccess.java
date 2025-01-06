package test;

import POM.LoginPage;
import org.testng.annotations.Test;

public class LoginSuccess extends gui.base.BaseTest {

    @Test
    public void signInWithValidCredentials() {
        LoginPage loginPageMethods = new LoginPage(super.driver,log);

        driver.get(LOGIN_URL);
        loginPageMethods.enterUserName("MainAdminUser");
        loginPageMethods.enterPass("Admin123");
        loginPageMethods.clickRememberMe();
        loginPageMethods.clickSignIn();
        loginPageMethods.popUpMsgSuccess();


    }
}
