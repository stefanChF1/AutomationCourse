package test;

import POM.LoginPage;
import org.testng.annotations.Test;

public class CreatingPost extends gui.base.BaseTest {
            //This test is designed to validate the Create a post function
    @Test
    public void UploadingPictureTest(){
        LoginPage loginPageMethods = new LoginPage(super.driver,log);

        driver.get(LOGIN_URL);
            //Login with valid credentials
        loginPageMethods.enterUserName("MainAdminUser");
        loginPageMethods.enterPass("Admin123");
        loginPageMethods.clickRememberMe();
        loginPageMethods.clickSignIn();
            //Navigate to profile page
        loginPageMethods.openProfile();

    }

}
