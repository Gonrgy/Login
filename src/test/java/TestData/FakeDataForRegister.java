package TestData;

import org.openqa.selenium.By;

public class FakeDataForRegister {

    public static By xPathForBookStoreApplicationElement = By.xpath("//h5[text()=\"Book Store Application\"]");

    public static By xPathForLoginElement = By.xpath("//li[@id=\"item-0\"]//span[text()=\"Login\"]");

    public static By newUserButton = By.xpath("//button[@id=\"newUser\"]");

    public static By firstNameTextBox = By.xpath("//input[@id=\"firstname\"]");

    public static By lastNameTextBox = By.xpath("//input[@id=\"lastname\"]");

    public static By userNameTextBox = By.xpath("//input[@id=\"userName\"]");

    public static By passwordTextBox = By.xpath("//input[@id=\"password\"]");

    public static By iAmNotARobotField = By.xpath("//*[@id=\"recaptcha-anchor\"]/div[1]");

    public static By registerButton = By.xpath("//button[@id=\"register\"]");

    public static By invalideUserNameOrPassword = By.xpath("//p[@id=\"name\"]");

    public static By loginButton = By.xpath("//button[@id=\"login\"]");

    public static String richtigesPassword = "Tester123!";

    public static String richtigerUserName = "Tester123";

    public static String falscherUserName = "ewqdwqfwq23";

    public static String falschesPassword = "wewqt213!";

    public static String fehlerMeldung = "Invalid username or password!";

    public static String firstName = "Max";

    public static String lastName = "Mustermann";

    public static By logedINName = By.xpath("//label[@class=\"form-label\"][@id=\"userName-value\"]");

    public static String expectedLogedInName = "Tester123";

}
