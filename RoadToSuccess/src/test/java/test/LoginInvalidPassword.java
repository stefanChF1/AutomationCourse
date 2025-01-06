package test;

import POM.LoginPage;
import org.testng.annotations.Test;

public class LoginInvalidPassword extends gui.base.BaseTest {

            //This test is designed to validate the security protocols
    @Test
    public void LoginWithInvalidPassword(){
        LoginPage loginPageMethods = new LoginPage(super.driver,log);

        driver.get(LOGIN_URL);
            //Enter valid username
        loginPageMethods.enterUserName("MainAdminUser");
            //Enter invalid password
        loginPageMethods.enterPass("123Admin");
        loginPageMethods.clickRememberMe();
        loginPageMethods.clickSignIn();
            //Assert popup message
        loginPageMethods.popUpMsgFail();

    }
}
