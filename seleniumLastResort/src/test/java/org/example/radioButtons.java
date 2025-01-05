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

public class radioButtons {
    public static final String TEST_PAGE = "https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html";
    static WebDriver driver = new ChromeDriver();
    static WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    @BeforeTest
    public void bfTest(){
        driver.manage().window().maximize();
    }
    @AfterTest
    public void afTest(){
        driver.quit();
    }

    @Test
    public void radioTest() throws InterruptedException {
        driver.get(TEST_PAGE);
        WebElement greenButton = wait.until(ExpectedConditions.elementToBeClickable
                (By.xpath("//input[contains(@value, 'green')]")));
        boolean greenButtonPresent = greenButton.isDisplayed();
        Assert.assertTrue(greenButtonPresent, "Element not found!");
        greenButton.click();
        Thread.sleep(5000);
        Boolean greenIsClicked = wait.until(ExpectedConditions.elementSelectionStateToBe
                (By.xpath("//input[contains(@value, 'green')]"), true));
        Assert.assertTrue(greenIsClicked, "Green is not clicked!");

        WebElement blueButton = wait.until(ExpectedConditions.elementToBeClickable
                (By.xpath("//input[contains(@value, 'blue')]")));
        boolean blueButtonPresent = blueButton.isDisplayed();
        Assert.assertTrue(blueButtonPresent, "Element not found!");
        blueButton.click();
        Boolean blueIsClicked = wait.until(ExpectedConditions.elementSelectionStateToBe
                (By.xpath("//input[contains(@value, 'blue')]"), true));
        Assert.assertTrue(blueIsClicked, "Blue not clicked!");
        Boolean greenNoLongerSelected = wait.until(ExpectedConditions.elementSelectionStateToBe
                (By.xpath("//input[contains(@value, 'green')]"), false));
        Assert.assertFalse(greenNoLongerSelected, "Green is still selected!");
    }
}
