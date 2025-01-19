package gui.base;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class BaseTest {
                //URLs
    public static final String LOGIN_URL = "http://training.skillo-bg.com:4300/users/login";
    public static final String HOME_URL = "http://training.skillo-bg.com:4300/posts/all";
    public static final String REGISTRATION_URL = "http://training.skillo-bg.com:4300/users/register";
                //Directories
    protected static final String TEST_RESOURCES_DIR = "src/test/resources/";
    protected static final String DOWNLOAD_DIR = TEST_RESOURCES_DIR.concat("download/");
    protected static final String SCREENSHOTS_DIR = TEST_RESOURCES_DIR.concat("screenshots/");
    protected static final String REPORTS_DIR = TEST_RESOURCES_DIR.concat("reports/");
    protected static final String UPLOAD_DIR = TEST_RESOURCES_DIR.concat("upload/");
                //Pictures
    protected static final File leoHehe = new File(System.getProperty("user.dir") + "/src/test/resources/upload/LeoHehe.jpg" );
    protected static final File leoCheers = new File(System.getProperty("user.dir") + "/src/test/resources/upload/LeoCheers.jpg" );
    protected static final File profilePictureCrazy = new File(System.getProperty("user.dir") + "/src/test/resources/upload/Crazy.jpg");
    protected static final File profilePictureMV = new File(System.getProperty("user.dir")+ "/src/test/resources/upload/Profile.jpeg");

    protected WebDriver driver;
    protected Logger log;

    @BeforeSuite
    protected final void setupTestSuite() throws IOException {
        cleanDirectory(REPORTS_DIR);
        cleanDirectory(SCREENSHOTS_DIR);
        //We are using only chrome so there is a setup only for chrome
    }

    @Parameters({ "browser" })
    @BeforeMethod(alwaysRun = true)
    public void setUp(@Optional("chrome") String browser,  Method method) {
        String tafName = "GUI TAF";

        log = LogManager.getLogger(tafName);
        log.info(" ==== TEST CASE NAME : "+ method.getName() +" ====");
        gui.base.BrowserDriverFactory factory = new gui.base.BrowserDriverFactory(browser, log);
        driver = factory.createDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown(ITestResult testResult) throws IOException {
        takeScreenshot(testResult);
        log.info("Close driver");
        driver.quit();
    }

    @AfterSuite
    public void cleanFiles() throws IOException {
        cleanDirectory(DOWNLOAD_DIR);
    };

    private void takeScreenshot(ITestResult testResult) throws IOException {
        if (ITestResult.FAILURE == testResult.getStatus()) {
            TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
            File screenshot = takesScreenshot.getScreenshotAs(OutputType.FILE);
            String testName = testResult.getName();

            FileUtils.copyFile(screenshot, new File(SCREENSHOTS_DIR.concat(testName).concat(".jpg")));
        };
    };

    private ChromeOptions configChromeOptions() {
        //Create path and setting for download folder
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("download.default_directory",
                System.getProperty("user.dir").concat("\\").concat(DOWNLOAD_DIR));

        ChromeOptions chromeOptions = new ChromeOptions();
        //Set new default download folder
        chromeOptions.setExperimentalOption("prefs", prefs);
        //Force the download to be automatic
        chromeOptions.addArguments("disable-popup-blocking");

        return chromeOptions;
    }
    private void cleanDirectory(String directoryPath) throws IOException {
        System.out.println("____________________________________________________________");
        File directory = new File(directoryPath);

        //If directory is not shown after git clone of the repo this code will build the path
        if (!directory.exists()) {
            FileUtils.forceMkdir(directory);
            System.out.println("Created folder with path: "+ directoryPath);
        };

        System.out.println("Deleting not needed files from folder with path: "+ directoryPath);
        FileUtils.cleanDirectory(directory);
        String[] fileList = directory.list();
        if (fileList != null && fileList.length == 0) {
            System.out.printf("All file are deleted in Directory: %s%n", directoryPath);
        } else {
            System.out.printf("Unable to delete the files in Directory: %s%n", directoryPath);
        };
        System.out.println("____________________________________________________________");
    };
}