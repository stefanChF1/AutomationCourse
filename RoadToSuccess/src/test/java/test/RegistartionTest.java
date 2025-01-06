package test;

import POM.RegistrationPage;
import org.testng.annotations.Test;

public class RegistartionTest extends gui.base.BaseTest {

    @Test
    public void successfulRegistration(){
        RegistrationPage regPageMethods = new RegistrationPage(super.driver,log);

        driver.get(REGISTRATION_URL);
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
