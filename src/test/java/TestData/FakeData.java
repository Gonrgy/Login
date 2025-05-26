package TestData;

import BasePageFolder.BasePage;
import org.openqa.selenium.By;
import utilityFolder.JavaScriptUtility;

public class FakeData {


    // FAKEDATA FÜR https://www.saucedemo.com/

    public static String wrongUserName = "bliblaman28";

    public static String wrongPassword = "ewqdsadada2321!";

    public static String expectedErrorFromWrongUserNameOrPassword = " Username and password do not match any user in this service";

    public static String nothingInSideTextBoxErrorMessage = "Username is required";

    public static String rightUserName = "standard_user";

    public static String rightPassword = "secret_sauce";

    public static String emptyString = "";

    public static String HomePageHeaderName = "Swag Labs";

    public static String ProductsPageHeaderName = "Products";

    public static By userNameInput = By.xpath("//input[@id=\"user-name\"]");
    public static By passwordInput = By.xpath("//input[@id=\"password\"]");
    public static By loginButton = By.xpath("//input[@id=\"login-button\"]");
    public static By errorMessage = By.xpath("\"//div[@class=\\\"error-message-container error\\\"]//h3\"");


    // UM DIE SEITE ZU CHECKEN

    public static void check_page(By pageHeaderParameter, String expectedTextParameter)throws InterruptedException{

        JavaScriptUtility.scrollToElement(pageHeaderParameter);
        String expectedText = expectedTextParameter;

        var x = BasePage.find(pageHeaderParameter).isDisplayed();
        var y = BasePage.find(pageHeaderParameter).getText();

        if(x && y.equals(expectedText)) System.out.println("Wir befinden uns auf der Seite " + expectedText);

    }


}
