package test;


import POM.LoginPage;
import POM.ProfilePage;
import org.testng.annotations.Test;

public class ChangingProfilePictureTest extends gui.base.BaseTest {

    @Test
    public void ChangeProfilePicture() throws InterruptedException {

        LoginPage LoginPage = new LoginPage(super.driver, log);
        driver.get("http://training.skillo-bg.com:4300/users/login");
        LoginPage.enterUserName("MainAdminUser");
        LoginPage.enterPass("Admin123");
        LoginPage.clickSignIn();
        LoginPage.openProfile();

        ProfilePage ProfilePage = new ProfilePage(driver, log);
        ProfilePage.ChangeProfilePicture("/Users/stefanstoyanov/Documents/Git/SkilloHomework/AutomationCourse/RoadToSuccess/src/test/resources/upload/Crazy.jpeg");

    }
}
