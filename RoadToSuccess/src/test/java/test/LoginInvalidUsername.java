package test;

import POM.LoginPage;
import org.testng.annotations.Test;

public class LoginInvalidUsername extends gui.base.BaseTest {

    @Test
    public void loginWithInvalidUsername(){
        LoginPage loginPageMethods = new LoginPage(super.driver,log);

        driver.get(LOGIN_URL);
        loginPageMethods.enterUserName("UserAdminMain");
        loginPageMethods.enterPass("Admin123");
        loginPageMethods.clickRememberMe();
        loginPageMethods.clickSignIn();
        loginPageMethods.popUpMsgFail();
    }
}
