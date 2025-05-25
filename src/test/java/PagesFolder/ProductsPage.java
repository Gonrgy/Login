package PagesFolder;

import TestData.FakeData;
import org.openqa.selenium.By;

public class ProductsPage extends HomePage{

    private static By headerName = By.xpath("//span[text() = \"Products\"]");

    public static void checkHeader()throws InterruptedException{
        FakeData.check_page(headerName,FakeData.ProductsPageHeaderName);
        System.out.println("Der Login war erfolgreich");
    }




}
