package test;


import POM.LoginPage;
import POM.ProfilePage;
import org.testng.annotations.Test;

import java.io.File;

public class ChangingProfilePictureTest extends gui.base.BaseTest {

    @Test
    public void ChangeProfilePicture() throws InterruptedException {
        File crazyPicture = new File("/src/test/resources/upload/Crazy.jpeg");
        File profilePictureMV = new File("/src/test/resources/upload/Profile.jpeg");

        LoginPage LoginPage = new LoginPage(super.driver, log);
        driver.get("http://training.skillo-bg.com:4300/users/login");
        LoginPage.enterUserName("MainAdminUser");
        LoginPage.enterPass("Admin123");
        LoginPage.clickSignIn();
        LoginPage.openProfile();

        ProfilePage ProfilePage = new ProfilePage(driver, log);
        ProfilePage.ChangeProfilePicture(crazyPicture);

    }
}
