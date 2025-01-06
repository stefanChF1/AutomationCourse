package test;

import POM.LoginPage;
import org.testng.annotations.Test;

public class CreatingPost extends gui.base.BaseTest {

    @Test
    public void UploadingPictureTest(){
        LoginPage loginPageMethods = new LoginPage(super.driver,log);

        driver.get(LOGIN_URL);
        loginPageMethods.enterUserName("MainAdminUser");
        loginPageMethods.enterPass("Admin123");
        loginPageMethods.clickRememberMe();
        loginPageMethods.clickSignIn();
        loginPageMethods.openProfile();

    }

}
