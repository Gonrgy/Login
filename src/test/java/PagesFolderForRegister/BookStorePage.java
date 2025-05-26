package PagesFolderForRegister;

import TestData.FakeDataForRegister;
import utilityFolder.JavaScriptUtility;

public class BookStorePage extends HomePage {


    public static LoginPage go_to_login_page()throws InterruptedException{
        JavaScriptUtility.scrollToElement(FakeDataForRegister.xPathForLoginElement);
        JavaScriptUtility.clickJs(FakeDataForRegister.xPathForLoginElement);
        return new LoginPage();
    }
}
