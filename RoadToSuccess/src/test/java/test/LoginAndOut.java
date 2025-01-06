package test;

import POM.LoginPage;
import POM.ProfilePage;
import org.testng.annotations.Test;

public class LoginAndOut extends gui.base.BaseTest {

        //This test is designed to validate the logout function

    @Test
    public void loginAndOut(){
        LoginPage loginPageMethods = new LoginPage(super.driver, log);

        driver.get(LOGIN_URL);
            //Enter valid credentials
        loginPageMethods.enterUserName("MainAdminUser");
        loginPageMethods.enterPass("Admin123");
        loginPageMethods.clickRememberMe();
        loginPageMethods.clickSignIn();
            //Assert successful login
        loginPageMethods.popUpMsgSuccess();

            //Calling method from another POM
        ProfilePage profilePageMethods = new ProfilePage(super.driver, log);
        profilePageMethods.signOut();

            //Assertion with popup message
        loginPageMethods.popUpMsgLogout();
    }
}
