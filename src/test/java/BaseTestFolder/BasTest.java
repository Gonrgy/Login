package BaseTestFolder;

import BasePageFolder.BasePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utilityFolder.JavaScriptUtility;
import utilityFolder.WebdriverWaitUtility;
import utilityFolder.utility;

public class BasTest {

    private static WebDriver driver;
    private static String page = "https://www.saucedemo.com/";


    @BeforeClass
    public static void before_class()throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        BasePage.setDriver(driver);
        utility.setUp(driver);
        JavaScriptUtility.JavaScriptSetUp();
        WebdriverWaitUtility.setWebDriverWait();
    }

    @Before
    public void loadApplication()throws InterruptedException{
        utility.driver.get(page);
        driver.manage().deleteAllCookies();
        utility.driver.manage().window().maximize();
    }


    @AfterClass
    public static void after_class()throws InterruptedException{
        driver.quit();
    }


}
