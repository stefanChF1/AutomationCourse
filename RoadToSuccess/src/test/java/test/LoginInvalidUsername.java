package test;

import POM.LoginPage;
import org.testng.annotations.Test;

public class LoginInvalidUsername extends gui.base.BaseTest {
            //This test is designed to validate the security protocols
    @Test
    public void loginWithInvalidUsername(){
        LoginPage loginPageMethods = new LoginPage(super.driver,log);

        driver.get(LOGIN_URL);
            //Enter invalid username
        loginPageMethods.enterUserName("UserAdminMain");
            //Enter valid password
        loginPageMethods.enterPass("Admin123");
        loginPageMethods.clickRememberMe();
        loginPageMethods.clickSignIn();
            //Assert popup message
        loginPageMethods.popUpMsgFail();
    }
}
