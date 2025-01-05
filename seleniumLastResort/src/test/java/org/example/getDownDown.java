package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class getDownDown {
    public static final String TEST_PAGE = "https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html";
    WebDriver driver = new ChromeDriver();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    @BeforeTest
    public void bfT(){
        driver.manage().window().maximize();
    }
    @AfterTest
    public void afT(){
        driver.quit();
    }

    @Test
    public void getDownLoL() throws InterruptedException {
        driver.get(TEST_PAGE);

            //Select index 2
        Select selectIndex2 = new Select(driver.findElement(By.xpath("//select[contains(@id, 'dropdowm-menu-1')]")));
        selectIndex2.selectByIndex(2);
        Thread.sleep(5000);

            //Select index 3
        Select selectIndex3 = new Select(driver.findElement(By.xpath("//select[contains(@id, 'dropdowm-menu-1')]")));
        selectIndex3.selectByIndex(3);
        Thread.sleep(3000);
    }

}
