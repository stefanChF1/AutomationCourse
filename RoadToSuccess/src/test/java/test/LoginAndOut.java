package test;

import POM.LoginPage;
import POM.ProfilePage;
import org.testng.annotations.Test;

public class LoginAndOut extends gui.base.BaseTest {

    @Test
    public void loginAndOut(){
        LoginPage loginPageMethods = new LoginPage(super.driver, log);

        driver.get(LOGIN_URL);
        loginPageMethods.enterUserName("MainAdminUser");
        loginPageMethods.enterPass("Admin123");
        loginPageMethods.clickRememberMe();
        loginPageMethods.clickSignIn();
        loginPageMethods.popUpMsgSuccess();

        ProfilePage profilePageMethods = new ProfilePage(super.driver, log);
        profilePageMethods.signOut();

        loginPageMethods.popUpMsgLogout();
    }
}
