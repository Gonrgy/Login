package utilityFolder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WebdriverWaitUtility extends utility{


    private static WebDriverWait wait ;

    public static void setWebDriverWait()throws InterruptedException{
        WebdriverWaitUtility.wait = new WebDriverWait(utility.driver, Duration.ofSeconds(10));
    }

    public static WebElement itemIsDisplayed(By locator)throws InterruptedException{

        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
}

