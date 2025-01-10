package test;


import POM.LoginPage;
import POM.ProfilePage;
import org.testng.annotations.Test;

import java.io.File;
import java.net.URISyntaxException;

public class ChangingProfilePictureTest extends gui.base.BaseTest {

    //This test is designed to change the user's profile picture
    @Test
    public void ChangeProfilePicture() throws InterruptedException, URISyntaxException {

        LoginPage loginPageMethods = new LoginPage(super.driver, log);
        driver.get(LOGIN_URL);
            //Entering valid credentials and navigating to profile
        loginPageMethods.enterUserName("MainAdminUser");
        loginPageMethods.enterPass("Admin123");
        loginPageMethods.clickSignIn();
        loginPageMethods.openProfile();

            //Calling upload method from another POM
        ProfilePage profilePageMethods = new ProfilePage(super.driver, log);
        profilePageMethods.changeProfilePicture(crazyPicture);
    }
}

