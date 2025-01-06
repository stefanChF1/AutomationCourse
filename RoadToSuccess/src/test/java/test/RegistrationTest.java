package test;

import POM.LoginPage;
import POM.RegistrationPage;
import org.testng.annotations.Test;

public class RegistrationTest extends gui.base.BaseTest {

        //This test is designed with a random number generator

    @Test
    public void successfulRegistration() throws InterruptedException {
        RegistrationPage regPageMethods = new RegistrationPage(super.driver,log);

        driver.get(REGISTRATION_URL);
        log.info("Starting REGISTRATION test");
            //username input
        regPageMethods.regUserEnterUsername();
            //email input
        regPageMethods.regUserEnterEmail();
            //date of birth input
        regPageMethods.regUserEnterDOB();
            //password input
        regPageMethods.regUserEnterPass();
            //confirm password
        regPageMethods.regUserEnterCnfPass();
            //enter public displayed name
        regPageMethods.regUserEnterPublicName();
            //finish registration
        regPageMethods.regUserRegisterButtonClick();
            //popup Msg for successful registration
        LoginPage loginPageMethods = new LoginPage(super.driver, log);
        loginPageMethods.popUpMsgSuccessfulReg();

    }
}
