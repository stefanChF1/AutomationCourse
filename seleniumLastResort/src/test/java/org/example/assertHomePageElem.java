package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.Duration;


public class assertHomePageElem {
    public static final String BASE_URL = "http://training.skillo-bg.com:4300/posts/all";
    public static final String PAGE_TITLE = "ISkillo";
    WebDriver driver = new ChromeDriver();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));


    @Test(priority = 1)
    public void buttonsAssertions() {
        driver.get(BASE_URL);
        System.out.println("You are at the Home page!");
        //Check if we are at the right page
        String actualHomePage = driver.getTitle();
        Assert.assertEquals(actualHomePage, PAGE_TITLE);
    }

    @Test(priority = 2)
    public void assertButtonHome() {
        driver.get(BASE_URL);
        //Check if Home button is present and correct
        WebElement basePageButtonHome = driver.findElement(By.xpath("//a[contains(@id,'nav-link-home')]"));
        boolean isPresentHome = basePageButtonHome.isDisplayed();
        Assert.assertTrue(isPresentHome, "Element not found!");
        String expectedHomeButtonName = "Home";
        String actualHomeButtonName = basePageButtonHome.getText();
        Assert.assertEquals(actualHomeButtonName, expectedHomeButtonName);
    }

    @Test(priority = 3)
    public void assertButtonLogin() {
        driver.get(BASE_URL);
        //Check if Login button is present and correct
        WebElement basePageButtonLogin = driver.findElement(By.xpath("//li/a[contains(@href,'/users/login')]"));
        boolean isPresentLogin = basePageButtonLogin.isDisplayed();
        Assert.assertTrue(isPresentLogin, "Element not found!");
        String expectLoginButtonName = "Login";
        String actualLoginButtonName = basePageButtonLogin.getText();
        Assert.assertEquals(actualLoginButtonName, expectLoginButtonName);
        driver.quit();
    }
}




