package utilityFolder;

import BasePageFolder.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class ActionsUtility extends utility{

    private static Actions action;


    private static Actions ausführen()throws InterruptedException{
        action = new Actions(utility.driver);
        return action;
    }


    public static void moveToElemenAndClick(By locator)throws InterruptedException{
        ausführen().moveToElement(BasePage.find(locator)).click(BasePage.find(locator)).perform();
    }
}
