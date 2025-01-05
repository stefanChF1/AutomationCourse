package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class homeWorkLec14 {



    @Test
    public void openUrl() throws InterruptedException {

        //Locators with single '
        System.setProperty("webdriver.chrome.driver", "/Users/stefanstoyanov/Documents/Git/SkilloHomework/AutomationCourse/seleniumTest/src/test/Resources/chromedriver");
        ChromeDriver driver = new ChromeDriver();

        driver.get("http://training.skillo-bg.com:4300/posts/all");

        Thread.sleep(2000);

        WebElement loginButton = driver.findElement(By.xpath("//a[contains(@id, 'nav-link-login')]"));
        loginButton.click();

        Thread.sleep(2000);

        // Wait for the username field and interact
        WebElement username = driver.findElement(By.xpath("//input[contains(@id, 'defaultLoginFormUsername')]"));
        username.click();
        username.sendKeys("Stef");

        WebElement password = driver.findElement(By.xpath("//input[contains(@id, 'defaultLoginFormPassword')]"));
        password.click();
        password.sendKeys("youWishYouKnew");

        WebElement signIn = driver.findElement(By.xpath("//button[contains(@id, sign-in-button)]"));
        signIn.click();

        if (!(driver == null)) {
            driver.quit();
        }

        driver.quit();
    }

}
