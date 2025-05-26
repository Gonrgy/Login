package utilityFolder;

import BasePageFolder.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JavaScriptUtility extends utility {

    private static JavascriptExecutor js;


    public static void JavaScriptSetUp()throws InterruptedException{
    JavaScriptUtility.js = (JavascriptExecutor)utility.driver;
    }


    public static void scrollToElement(By locator)throws InterruptedException{
        WebElement element = driver.findElement(locator);
        String jsScript = "arguments[0].scrollIntoView()";
        js.executeScript(jsScript,element);
    }

    public static void clickJs(By locator)throws InterruptedException{
        WebElement element = driver.findElement(locator);
        String jsScript = "arguments[0].click()";
        js.executeScript(jsScript,element);
    }

}
