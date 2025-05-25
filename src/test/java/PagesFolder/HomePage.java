package PagesFolder;

import BasePageFolder.BasePage;
import TestData.FakeData;
import org.openqa.selenium.By;
import utilityFolder.JavaScriptUtility;
import utilityFolder.WebdriverWaitUtility;

public class HomePage extends BasePage {

    private static By userNameInput = By.xpath("//input[@id=\"user-name\"]");
    private static By passwordInput = By.xpath("//input[@id=\"password\"]");
    private static By loginButton = By.xpath("//input[@id=\"login-button\"]");
    private static By pageHeaderXPath = By.xpath("//div[@class=\"login_logo\"][text()=\"Swag Labs\"]");



    public static void check_everyThink_with_wrong_input(String userNameInputParameter,String passwordInputParameter,String errorMessageParameter)throws InterruptedException{

        FakeData.check_page(pageHeaderXPath,FakeData.HomePageHeaderName);

        String userNametext = userNameInputParameter;
        String passwortext = passwordInputParameter;
        String expectedError = errorMessageParameter;

        BasePage.set(userNameInput,userNametext);
        BasePage.set(passwordInput,passwortext);

        var valueOfUserName = BasePage.find(userNameInput).getAttribute("value");
        var valueOfPassword = BasePage.find(passwordInput).getAttribute("value");


        if(valueOfUserName.equals(userNametext) && valueOfPassword.equals(passwortext)) System.out.println("username text ist " + userNametext + " " + "password text ist " +passwortext );

        JavaScriptUtility.clickJs(loginButton);

        By errorMessage = By.xpath("//div[@class=\"error-message-container error\"]//h3");

        var x = WebdriverWaitUtility.itemIsDisplayed(errorMessage).isDisplayed();
        var y = WebdriverWaitUtility.itemIsDisplayed(errorMessage).getText();

        if(x && y.contains(expectedError)) System.out.println(expectedError + " Die Fehlermeldung wurde richtig ausgegegben");

    }

    public static ProductsPage go_to_products_page()throws InterruptedException{
        BasePage.set(userNameInput,FakeData.rightUserName);
        BasePage.set(passwordInput,FakeData.rightPassword);
        JavaScriptUtility.clickJs(loginButton);
        return new ProductsPage();
    }

}
