package gui.base;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.HashMap;
import java.util.Map;

public class BrowserDriverFactory {

    private ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
    private String browser;
    private Logger log;

    public BrowserDriverFactory(String browser, Logger log) {
        this.browser = browser.toLowerCase();
        this.log = log;
    }

    public WebDriver createDriver() {
        // Create driver
        log.info("Create driver: " + browser);

        switch (browser) {
            case "chrome":
                driver.set(new ChromeDriver(configChromeOptions()));
                break;

            case "firefox":
                driver.set(new FirefoxDriver());
                break;

            default:
                System.out.println("Do not know how to start: " + browser + ", starting chrome.");

                driver.set(new ChromeDriver());
                break;
        }

        return driver.get();
    }

    private ChromeOptions configChromeOptions() {
        Map<String, Object> prefs = new HashMap<>();

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setExperimentalOption("prefs", prefs);
        return chromeOptions;
    }
}