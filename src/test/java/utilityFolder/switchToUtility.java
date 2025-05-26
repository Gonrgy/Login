package utilityFolder;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class switchToUtility extends utility{

     private static WebDriver.TargetLocator switchToFrame()throws InterruptedException{
        return utility.driver.switchTo();
    }

    public static void changeToFrame(WebElement locator) throws InterruptedException{
        switchToFrame().frame(locator);
    }

    public static void switchBack()throws  InterruptedException{
         switchToFrame().defaultContent();
    }

    public static WebDriver.TargetLocator switchToEverythink()throws InterruptedException{
         return switchToFrame();
    }
}
