package BaseTestFolder;

import BasePageFolder.BasePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.Command;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.HasDevTools;
import utilityFolder.JavaScriptUtility;
import utilityFolder.WebdriverWaitUtility;
import utilityFolder.utility;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BasTest {

    private static WebDriver driver;
    private static String page = "https://www.saucedemo.com/";
    private static String pageForRegister = "https://demoqa.com/";


    @BeforeClass
    public static void before_class()throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();

        driver = new ChromeDriver(options);
        BasePage.setDriver(driver);
        utility.setUp(driver);
        JavaScriptUtility.JavaScriptSetUp();
        WebdriverWaitUtility.setWebDriverWait();
    }

    @Before
    public void loadApplication()throws InterruptedException{
        driver.get(pageForRegister);
        driver.manage().deleteAllCookies();
        utility.driver.manage().window().maximize();
    }


    @AfterClass
    public static void after_class()throws InterruptedException{
        driver.quit();
    }


}
