package PagesFolderForRegister;

import BasePageFolder.BasePage;
import TestData.FakeDataForRegister;
import com.fasterxml.jackson.databind.ser.Serializers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilityFolder.*;

import javax.swing.text.Utilities;
import java.util.List;

public class LoginPage extends BookStorePage{

    private static String  success = "User Register Successfully.";
    private static By logedInName = By.xpath("//label[@id=\"userName-value\"]");

    public static void go_to_register()throws InterruptedException{

        JavaScriptUtility.scrollToElement(FakeDataForRegister.newUserButton);
        JavaScriptUtility.clickJs(FakeDataForRegister.newUserButton);

        BasePage.set(FakeDataForRegister.firstNameTextBox,FakeDataForRegister.firstName);
        BasePage.set(FakeDataForRegister.lastNameTextBox,FakeDataForRegister.lastName);
        BasePage.set(FakeDataForRegister.userNameTextBox,FakeDataForRegister.richtigerUserName);
        BasePage.set(FakeDataForRegister.passwordTextBox,FakeDataForRegister.richtigesPassword);

        JavaScriptUtility.scrollToElement(FakeDataForRegister.registerButton);

        List<WebElement> allFrames = utility.driver.findElements(By.tagName("iframe"));

        for (WebElement frame : allFrames) {
            String src = frame.getAttribute("src");
            if (src != null && src.contains("api2/anchor")) {

                utility.driver.switchTo().frame(frame);
                BasePage.click(FakeDataForRegister.iAmNotARobotField);
                break;
            }
        }
        switchToUtility.switchBack();
        JavaScriptUtility.scrollToElement(FakeDataForRegister.registerButton);
        JavaScriptUtility.clickJs(FakeDataForRegister.registerButton);

        var x = WebdriverWaitUtility.alertIsPresentAndGetText();
        WebdriverWaitUtility.alertIsPresentAndAccept();

        if(x.equals(success)) System.out.println("Die Registrierung war erfolgreich");

        switchToUtility.switchBack();


    }

    public static void login_succesfull()throws InterruptedException{

        // DER USER LOGED SIICH EIN
        JavaScriptUtility.scrollToElement(FakeDataForRegister.userNameTextBox);
        BasePage.set(FakeDataForRegister.userNameTextBox,FakeDataForRegister.richtigerUserName);
        BasePage.set(FakeDataForRegister.passwordTextBox,FakeDataForRegister.richtigesPassword);

        BasePage.click(FakeDataForRegister.loginButton);



        // CHECKEN OB ER SICH WIRKLICH EINGELOGT HAT

       var x =  WebdriverWaitUtility.itemIsDisplayed(FakeDataForRegister.logedINName).getText();
       var y =  WebdriverWaitUtility.itemIsDisplayed(FakeDataForRegister.logedINName).isDisplayed();


       if(x.equals(FakeDataForRegister.expectedLogedInName) && y) System.out.println("Wir haben uns erfolgreich angemeldet");
       Thread.sleep(2000);


    }

}
