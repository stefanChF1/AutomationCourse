package POM;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class RegistrationPage extends BasePage {

    @FindBy(xpath = "//input[contains(@formcontrolname, 'username')]")
        private WebElement regUserInputUsername;
    @FindBy(xpath = "//input[contains(@formcontrolname, 'email')]")
        private WebElement regUserInputEmail;
    @FindBy(xpath = "//input[contains(@formcontrolname, 'birthDate')]")
        private WebElement regUserInputDOB;
    @FindBy(xpath = "//input[contains(@formcontrolname, 'password')]")
        private WebElement regUserInputPass;
    @FindBy(xpath = "//input[contains(@formcontrolname, 'confirmPassword')]")
        private WebElement regUserInputCnfPass;
    @FindBy(xpath = "//textarea[contains(@formcontrolname, 'publicInfo')]")
        private WebElement regUserInputPublicName;
    @FindBy(xpath = "//button[contains(@id, 'sign-in-button')]")
        private WebElement regUserRegisterButton;

    int number = (int) (Math.random() * 100);

    public RegistrationPage(WebDriver driver, Logger log) {
        super(driver,log);
        PageFactory.initElements(driver, this);
    }

    public void regUserEnterUsername(){
        wait.until(ExpectedConditions.visibilityOf(regUserInputUsername));
        boolean regUserInputPresent = regUserInputUsername.isDisplayed();
        Assert.assertTrue(regUserInputPresent, "Username field not present!");
        regUserInputUsername.sendKeys("MrLova" + number);
    }

    public void regUserEnterEmail(){
        wait.until(ExpectedConditions.visibilityOf(regUserInputEmail));
        boolean regUserInputEmailPresent = regUserInputEmail.isDisplayed();
        Assert.assertTrue(regUserInputEmailPresent, "Email field not present!");
        regUserInputEmail.sendKeys(number + "aA@gmail.com");
    }

    public void regUserEnterDOB(){
        wait.until(ExpectedConditions.visibilityOf(regUserInputDOB));
        boolean regUserInputDOBPresent = regUserInputDOB.isDisplayed();
        Assert.assertTrue(regUserInputDOBPresent, "DOB field not present!");
        regUserInputDOB.sendKeys("10.10.2020");
    }

    public void regUserEnterPass(){
        wait.until(ExpectedConditions.visibilityOf(regUserInputPass));
        boolean regUserInputPassPresent = regUserInputPass.isDisplayed();
        Assert.assertTrue(regUserInputPassPresent, "Pass field not present!");
        regUserInputPass.sendKeys("YouWishYouKnew1");
    }

    public void regUserEnterCnfPass(){
        wait.until(ExpectedConditions.visibilityOf(regUserInputCnfPass));
        boolean regUserCnfPassPresent = regUserInputCnfPass.isDisplayed();
        Assert.assertTrue(regUserCnfPassPresent, "Confirm pass field not present!");
        regUserInputCnfPass.sendKeys("YouWishYouKnew1");
    }

    public void regUserEnterPublicName(){
        wait.until(ExpectedConditions.visibilityOf(regUserInputPublicName));
        boolean regUserInputPublicNamePresent = regUserInputPublicName.isDisplayed();
        Assert.assertTrue(regUserInputPublicNamePresent, "Public name field not present!");
        regUserInputPublicName.sendKeys("Chefo");
    }

    public void regUserRegisterButtonClick(){
        wait.until(ExpectedConditions.elementToBeClickable(regUserRegisterButton));
        boolean regUserRegistrationButtonPresent = regUserRegisterButton.isDisplayed();
        Assert.assertTrue(regUserRegistrationButtonPresent, "Register button not present!");
        regUserRegisterButton.click();

    }
}
