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

public class loginTestValid {

    public static final String BASE_URL = "http://training.skillo-bg.com:4300/users/login";
    WebDriver driver = new ChromeDriver();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    @BeforeTest
    public void bfTest(){
        driver.manage().window().maximize();
    }
    @AfterTest
    public void afTest(){
        driver.quit();
    }
    @Test
    public void successfulLogin() throws InterruptedException {
        driver.get(BASE_URL);

            //Web page assertion
        WebElement signInSignField = wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("//p[contains(@class, 'h4 mb-4')]")));
        boolean signInPresent = signInSignField.isDisplayed();
        Assert.assertTrue(signInPresent, "Element not found!");
        String expectedSignInText = "Sign in";
        String actualSignInText = signInSignField.getText();
        Assert.assertEquals(actualSignInText, expectedSignInText);

            //Enter username
        WebElement userOrEmail = wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("//input[contains(@id, 'defaultLoginFormUsername')]")));
        boolean userOrEmailPresent = userOrEmail.isDisplayed();
        Assert.assertTrue(userOrEmailPresent, "Element not found!");
        String usr1 = "MainAdminUser";
        userOrEmail.sendKeys(usr1);

            //Enter password
        WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("//input[contains(@id, 'defaultLoginFormPassword')]")));
        boolean passwordFieldPresent = passwordField.isDisplayed();
        Assert.assertTrue(passwordFieldPresent, "Element not found!");
        String pass = "Admin123";
        passwordField.sendKeys(pass);

            //Remember me
        WebElement rememberMe = wait.until(ExpectedConditions.elementToBeClickable
                (By.xpath("//input[contains(@class, 'remember-me-button')]")));
        boolean rememberMePresent = rememberMe.isEnabled();
        Assert.assertTrue(rememberMePresent, "You will not be remembered!");
        rememberMe.click();

            //Logging in
        WebElement logIn = wait.until(ExpectedConditions.elementToBeClickable
                (By.xpath("//button[contains(@id, 'sign-in-button')]")));
        String expectedLogInButton = "Sign in";
        String actualLogInButton = logIn.getText();
        Assert.assertEquals(actualLogInButton, expectedLogInButton);
        logIn.click();

            //First assert user is logged in
        WebElement logOut = wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("//i[contains(@class, 'fa-sign-out-alt')]")));
        boolean logOutButtonPresent = logOut.isDisplayed();
        Assert.assertTrue(logOutButtonPresent, "You are not logged in!");

            //The CHECK
        WebElement usrProfile = wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("//a[contains(@id, 'nav-link-profile')]")));
        boolean usrProfilePresent = usrProfile.isDisplayed();
        Assert.assertTrue(usrProfilePresent, "You are not logged in!");
        usrProfile.click();
        WebElement profileUsername = wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("//div[contains(@class, 'profile-user-settings')]")));
        String expectedVisibleUsername = "MainAdminUser";
        String actualVisibleUsername = profileUsername.getText();
        Assert.assertEquals(actualVisibleUsername, expectedVisibleUsername);


    }

}
