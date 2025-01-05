package test;

import POM.LoginPage;
import org.testng.annotations.Test;

public class UploadingPicture extends gui.base.BaseTest {

    @Test
    public void UploadingPictureTest(){
        LoginPage loginPageMethods = new LoginPage(super.driver,log);

        driver.get("http://training.skillo-bg.com:4300/users/login");
        loginPageMethods.enterUserName("MainAdminUser");
        loginPageMethods.enterPass("Admin123");
        loginPageMethods.clickRememberMe();
        loginPageMethods.clickSignIn();

    }

}
