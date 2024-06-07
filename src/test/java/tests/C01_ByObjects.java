package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.ContactListPage;

public class C01_ByObjects {
    /*
        Go to https://thinking-tester-contact-list.herokuapp.com/
        Enter email clarusway@hotmail.com
        Enter password Clarusway.123
        Click submit button
        Assert Logout button
     */

    @Test
    void byObjectsTest() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        ContactListPage contactListPage = new ContactListPage();//By objelerinin bulunduğu class'tan bir obje oluşturarak By objelerine ulaşıyoruz.

//        Go to https://thinking-tester-contact-list.herokuapp.com/
        driver.get("https://thinking-tester-contact-list.herokuapp.com");

//        Enter email clarusway@hotmail.com
        driver.findElement(contactListPage.email).sendKeys("clarusway@hotmail.com");//findElement() metholarında çağrılan By objelerini locate işlemi için kullanıyoruz.

//        Enter password Clarusway.123
        driver.findElement(contactListPage.password).sendKeys("Clarusway.123");

//        Click submit button
        driver.findElement(contactListPage.submit).click();

//        Assert Logout button
        Thread.sleep(300);
        assert driver.findElement(contactListPage.logout).isDisplayed();

        Thread.sleep(3000);
        driver.quit();

    }
}