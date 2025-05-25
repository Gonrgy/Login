package Tests;

import BaseTestFolder.BasTest;
import PagesFolder.HomePage;
import TestData.FakeData;
import org.junit.Test;

public class LoginTest extends BasTest {



    @Test
    public void wrong_username()throws InterruptedException{
        HomePage.check_everyThink_with_wrong_input(FakeData.wrongUserName,FakeData.rightPassword,FakeData.expectedErrorFromWrongUserNameOrPassword);
    }

    @Test
    public void wrong_password()throws InterruptedException{
        HomePage.check_everyThink_with_wrong_input(FakeData.rightUserName,FakeData.wrongPassword,FakeData.expectedErrorFromWrongUserNameOrPassword);
    }


    @Test
    public void empty_username_and_password()throws InterruptedException{
        HomePage.check_everyThink_with_wrong_input(FakeData.emptyString,FakeData.emptyString,FakeData.nothingInSideTextBoxErrorMessage);
    }


    @Test
    public void login_is_succesfull()throws InterruptedException{
        HomePage.go_to_products_page().checkHeader();
    }



}
