import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class firstSelTest {

    @Test
    public void firstTestSel() throws InterruptedException {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        Thread.sleep(4444);

        driver.get("https://www.google.bg/");

        Thread.sleep(4444);
    }
}
