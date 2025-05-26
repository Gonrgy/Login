package PagesFolderForRegister;

import BasePageFolder.BasePage;
import TestData.FakeDataForRegister;
import utilityFolder.JavaScriptUtility;

public class HomePage extends BasePage {


    public static BookStorePage go_to_Bookstoreapplication_page()throws InterruptedException{
        JavaScriptUtility.scrollToElement(FakeDataForRegister.xPathForBookStoreApplicationElement);
        JavaScriptUtility.clickJs(FakeDataForRegister.xPathForBookStoreApplicationElement);

        return new BookStorePage();
    }
}
