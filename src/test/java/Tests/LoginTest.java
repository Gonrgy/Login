package Tests;

import BaseTestFolder.BasTest;
import PagesFolder.HomePage;
import TestData.FakeData;
import TestData.FakeDataForRegister;
import org.junit.Test;

public class LoginTest extends BasTest {

    //LOGIN TEST SIND VON https://www.saucedemo.com/

    @Test
    public void wrong_username()throws InterruptedException{
        HomePage.check_everyThink_with_wrong_input(FakeData.userNameInput,FakeData.passwordInput,FakeData.loginButton,FakeData.wrongUserName,FakeData.rightPassword,FakeData.expectedErrorFromWrongUserNameOrPassword,FakeData.errorMessage);
    }

    @Test
    public void wrong_password()throws InterruptedException{
        HomePage.check_everyThink_with_wrong_input(FakeData.userNameInput,FakeData.passwordInput,FakeData.loginButton,FakeData.rightUserName,FakeData.wrongPassword,FakeData.expectedErrorFromWrongUserNameOrPassword,FakeData.errorMessage);
    }


    @Test
    public void empty_username_and_password()throws InterruptedException{
        HomePage.check_everyThink_with_wrong_input(FakeData.userNameInput,FakeData.passwordInput,FakeData.loginButton,FakeData.emptyString,FakeData.emptyString,FakeData.nothingInSideTextBoxErrorMessage,FakeData.errorMessage);
    }


    @Test
    public void login_is_succesfull()throws InterruptedException{
        HomePage.go_to_products_page().checkHeader();
    }




    // LOGIN und Registrierung FÜR DEMOQA

    @Test
    public void check_wrong_userName()throws InterruptedException{
        PagesFolderForRegister.HomePage.go_to_Bookstoreapplication_page().go_to_login_page();
        HomePage.check_everyThink_with_wrong_input(FakeDataForRegister.userNameTextBox,FakeDataForRegister.passwordTextBox,FakeDataForRegister.loginButton,FakeDataForRegister.falscherUserName,FakeDataForRegister.richtigesPassword,FakeDataForRegister.fehlerMeldung,FakeDataForRegister.invalideUserNameOrPassword);
    }


    @Test
    public void check_wrong_password()throws InterruptedException{
        PagesFolderForRegister.HomePage.go_to_Bookstoreapplication_page().go_to_login_page();
        HomePage.check_everyThink_with_wrong_input(FakeDataForRegister.userNameTextBox,FakeDataForRegister.passwordTextBox,FakeDataForRegister.loginButton,FakeDataForRegister.richtigerUserName,FakeDataForRegister.falschesPassword,FakeDataForRegister.fehlerMeldung,FakeDataForRegister.invalideUserNameOrPassword);
    }

    @Test
    public void check_wrong_password_and_userName()throws InterruptedException{
        PagesFolderForRegister.HomePage.go_to_Bookstoreapplication_page().go_to_login_page();
        HomePage.check_everyThink_with_wrong_input(FakeDataForRegister.userNameTextBox,FakeDataForRegister.passwordTextBox,FakeDataForRegister.loginButton,FakeDataForRegister.falscherUserName,FakeDataForRegister.falschesPassword,FakeDataForRegister.fehlerMeldung,FakeDataForRegister.invalideUserNameOrPassword);
    }


    @Test
    public void register()throws InterruptedException{
       var x =  PagesFolderForRegister.HomePage.go_to_Bookstoreapplication_page().go_to_login_page();
        x.go_to_register();
    }

    @Test
    public void login_successfull()throws InterruptedException{
        var x =  PagesFolderForRegister.HomePage.go_to_Bookstoreapplication_page().go_to_login_page();
        x.login_succesfull();
    }



}
