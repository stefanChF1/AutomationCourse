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

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

public class lastResort {
    WebDriver driver = new ChromeDriver();
    WebDriverWait wait = new WebDriverWait(driver,  Duration.ofSeconds(10));

    @BeforeTest
    public void befTest(){
        driver.manage().window().maximize();
    }

    @AfterTest
    public void aftTest(){
        driver.quit();
    }

    @Test
    public void loginButton() throws InterruptedException {

        driver.get("http://training.skillo-bg.com:4300/posts/all");

        WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(@id, 'nav-link-login')]")));
        loginButton.click();


        WebElement username = wait.until(visibilityOfElementLocated(By.xpath("//input[contains(@id, 'defaultLoginFormUsername')]")));
        String USER = "Stef";
        username.sendKeys(USER);

        WebElement password = wait.until(visibilityOfElementLocated(By.xpath("//input[contains(@id, 'defaultLoginFormPassword')]")));
        String PASS = "YouWishYouKnew";
        password.sendKeys(PASS);


        WebElement signIn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(@id, 'sign-in-button')]")));
        signIn.click();

        //("//div(contains[@class, 'toast-message ng-star-inserted'])"));
        WebElement errorMsg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.toast-message")));
        String expectedErrorMsg = "Wrong username or password!";
        String actualErrorMsg = errorMsg.getText();
        Assert.assertEquals(actualErrorMsg, expectedErrorMsg);

    }
}
