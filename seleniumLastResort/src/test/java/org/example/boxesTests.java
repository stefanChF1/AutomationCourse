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

public class boxesTests {

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
    public static void checkBoxes(){
        driver.get(TEST_PAGE);

            //Assert correct Page
        String expected_URL = "https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html";
        Assert.assertEquals(TEST_PAGE, expected_URL);
        System.out.println("You are at the correct page, carry on!");

            //Checkbox 1 selection
        WebElement checkBox1 = wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("//input[contains(@value, 'option-1')]")));
        checkBox1.click();
            //Check box2
        Boolean checkBox1IsSelected = wait.until(ExpectedConditions.elementSelectionStateToBe
                (By.xpath("//input[contains(@value, 'option-1')]"),true));
        Assert.assertTrue(checkBox1IsSelected, "Box 1 is not selected!");

            //Checkbox 2 selection
        WebElement checkBox2 = wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("//input[contains(@value, 'option-2')]")));
        checkBox2.click();
            //Check box2
        Boolean checkBox2IsSelected = wait.until(ExpectedConditions.elementSelectionStateToBe
                (By.xpath("//input[contains(@value, 'option-2')]"), true));

        Assert.assertTrue(checkBox2IsSelected, "Box 2 is not selected!");

            //Checkbox 3 selection
        WebElement checkBox3 = wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("//input[contains(@value, 'option-2')]")));
        Boolean checkbox3IsSelected = wait.until(ExpectedConditions.elementSelectionStateToBe(checkBox3, true));
        Assert.assertTrue(checkbox3IsSelected, "Box is not selected!");

            //Omg its checked
        if (checkbox3IsSelected == true){
            System.out.println("Checkbox is selected! What now?");
        }
    }

}
