package PagesFolder;

import BasePageFolder.BasePage;
import TestData.FakeData;
import org.openqa.selenium.By;
import utilityFolder.JavaScriptUtility;
import utilityFolder.WebdriverWaitUtility;

public class HomePage extends BasePage {


    private static By pageHeaderXPath = By.xpath("//div[@class=\"login_logo\"][text()=\"Swag Labs\"]");



    public static void check_everyThink_with_wrong_input(By userNameTextBoxPath,By passwordTextBoxPath,By button,String userNameInputParameter,String passwordInputParameter,String errorMessageParameter,By errorMessageXPath)throws InterruptedException{

        //FakeData.check_page(pageHeaderXPath,FakeData.HomePageHeaderName);

        String userNametext = userNameInputParameter;
        String passwortext = passwordInputParameter;
        String expectedError = errorMessageParameter;

        BasePage.set(userNameTextBoxPath,userNametext);
        BasePage.set(passwordTextBoxPath,passwortext);

        var valueOfUserName = BasePage.find(userNameTextBoxPath).getAttribute("value");
        var valueOfPassword = BasePage.find(passwordTextBoxPath).getAttribute("value");


        if(valueOfUserName.equals(userNametext) && valueOfPassword.equals(passwortext)) System.out.println("username text ist " + userNametext + " " + "password text ist " +passwortext );

        JavaScriptUtility.clickJs(button);

        By errorMessage = errorMessageXPath;

        var x = WebdriverWaitUtility.itemIsDisplayed(errorMessage).isDisplayed();
        var y = WebdriverWaitUtility.itemIsDisplayed(errorMessage).getText();

        if(x && y.contains(expectedError)) System.out.println(expectedError + " Die Fehlermeldung wurde richtig ausgegegben");

    }

    public static ProductsPage go_to_products_page()throws InterruptedException{
        BasePage.set(FakeData.userNameInput,FakeData.rightUserName);
        BasePage.set(FakeData.passwordInput,FakeData.rightPassword);
        JavaScriptUtility.clickJs(FakeData.loginButton);
        return new ProductsPage();
    }

}
