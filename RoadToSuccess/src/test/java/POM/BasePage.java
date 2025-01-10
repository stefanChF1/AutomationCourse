package POM;



import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class BasePage {

    Logger log;
    WebDriver driver;
    WebDriverWait wait;

    public BasePage(WebDriver driver,Logger log) {
        this.driver = driver;
        this.log = log;
        wait = new WebDriverWait(driver,Duration.ofSeconds(5));
    }

    public void navigateTo(String pageURLPath) {
        String BASE_PAGE = "http://training.skillo-bg.com:4300";
        String currentURL = BASE_PAGE + pageURLPath;
         driver.get(currentURL);
    }
}
