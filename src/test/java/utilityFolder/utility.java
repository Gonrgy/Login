package utilityFolder;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class utility {

    public static WebDriver driver;


    public static void setUp(WebDriver driver)throws InterruptedException{
        utility.driver = driver;
    }
}
