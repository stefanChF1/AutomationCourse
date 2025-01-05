package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class registrationTest {

    public static final String BASE_URL = "http://training.skillo-bg.com:4300/users/register";
    WebDriver driver = new ChromeDriver();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    int number = (int) (Math.random() * 100);

    @BeforeTest
    public void befTest() {
        driver.manage().window().maximize();
    }

    @AfterTest
    public void aftTest() {
        driver.quit();
    }

    @Test(priority = 1)
    public void checkAllFields() throws InterruptedException {
        driver.get(BASE_URL);
        WebElement usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("//input[contains(@formcontrolname, 'username')]")));
        boolean usernameFieldPresent = usernameField.isDisplayed();
        Assert.assertTrue(usernameFieldPresent, "Element not found!");
        String user = "MrLovaLova";
        usernameField.sendKeys(user + number);

//
//    @Test(priority = 2)
//    public void emailField() {
//        driver.get(BASE_URL);
        WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("//input[contains(@formcontrolname, 'email')]")));
        boolean emailFieldPresent = emailField.isDisplayed();
        Assert.assertTrue(emailFieldPresent, "Element not found!");
        String email = "MrL@gmail.com";
        emailField.sendKeys(number + email);


//    @Test(priority = 3)
//    public void dateField() {
//        driver.get(BASE_URL);
        WebElement dateField = wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("//input[contains(@formcontrolname, 'birthDate')]")));
        boolean dateFieldPresent = dateField.isDisplayed();
        Assert.assertTrue(dateFieldPresent, "Element not found!");
        String birthDate = "10-10-1990";
        dateField.sendKeys(birthDate);


//    @Test(priority = 4)
//    public void passwordField() throws InterruptedException {
//        driver.get(BASE_URL);
        WebElement passField = wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("//input[contains(@formcontrolname, 'password')]")));
        boolean passFieldPresent = passField.isDisplayed();
        Assert.assertTrue(passFieldPresent, "Element not found!");
        String password = "1YouWishYouKnew";
        passField.sendKeys(password);



//    @Test(priority = 5)
//    public void cnfPassField() throws InterruptedException {
//        driver.get(BASE_URL);
        WebElement cnfPassField = wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("//input[contains(@formcontrolname, 'confirmPassword')]")));
        boolean cnfPassFieldPresent = cnfPassField.isDisplayed();
        Assert.assertTrue(cnfPassFieldPresent, "Element not found!");
        String cnfPass = "1YouWishYouKnew";
        cnfPassField.sendKeys(cnfPass);



//    @Test(priority = 6)
//    public void publicName() {
        WebElement publicName = wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("//textarea[contains(@formcontrolname, 'publicInfo')]")));
        boolean publicNamePresent = publicName.isDisplayed();
        Assert.assertTrue(publicNamePresent, "Element not found!");
        String publicNickName = "Imbalancer";
        publicName.sendKeys(publicNickName + number);


//    @Test(priority = 7)
//    public void registerButton() throws InterruptedException
        WebElement registerButton = wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("//button[contains(@id, 'sign-in-button')]")));
        boolean regButtonPresent = registerButton.isDisplayed();
        Assert.assertTrue(regButtonPresent, "Element not found!");
        registerButton.click();

        Thread.sleep(50000);
    }

}
