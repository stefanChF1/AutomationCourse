package org.example;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class assertLoginPage {

    public static final String LOGIN_URL = "http://training.skillo-bg.com:4300/users/login";
    WebDriver driver1 = new ChromeDriver();

    @Test
    public void signInText(){
        WebElement signInText = driver1.findElement(By.xpath("//p[contains(@class, 'h4 mb-4')]"));
        boolean signInTextIsPresent = signInText.isDisplayed();
        Assert.assertTrue(true, "Element not found!");
        String expectedSignInText = "Sign in";
        String actualSignInText = signInText.getText();
        Assert.assertEquals(actualSignInText, expectedSignInText);
    }


}
