package BasePageFolder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {

    private static WebDriver driver;


    public static void setDriver(WebDriver driver)throws InterruptedException{
        BasePage.driver = driver;
    }

    public static WebElement find(By locator)throws InterruptedException{
        return driver.findElement(locator);
    }

    public static void set(By locator,String keys)throws InterruptedException{
        find(locator).sendKeys(keys);
    }

    public static void click(By locator)throws InterruptedException{
        find(locator).click();
    }
}
