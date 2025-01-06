package test;

import POM.LoginPage;
import org.testng.annotations.Test;

public class LoginInvalidPassword extends gui.base.BaseTest {

    @Test
    public void LoginWithInvalidPassword(){
        LoginPage loginPageMethods = new LoginPage(super.driver,log);

        driver.get(LOGIN_URL);
        loginPageMethods.enterUserName("MainAdminUser");
        loginPageMethods.enterPass("123Admin");
        loginPageMethods.clickRememberMe();
        loginPageMethods.clickSignIn();
        loginPageMethods.popUpMsgFail();

    }
}
