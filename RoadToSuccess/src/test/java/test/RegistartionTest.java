package test;

import POM.RegistrationPage;
import org.testng.annotations.Test;

public class RegistartionTest extends gui.base.BaseTest {

    @Test
    public void successfulRegistration() throws InterruptedException {
        RegistrationPage regPageMethods;
        regPageMethods = new RegistrationPage(driver,log);

        driver.get("http://training.skillo-bg.com:4300/users/register");
        log.info("Starting REGISTRATION test");
        regPageMethods.regUserEnterUsername();
        regPageMethods.regUserEnterEmail();
        regPageMethods.regUserEnterDOB();
        regPageMethods.regUserEnterPass();
        regPageMethods.regUserEnterCnfPass();
        regPageMethods.regUserEnterPublicName();
        regPageMethods.regUserRegisterButtonClick();

    }

}
