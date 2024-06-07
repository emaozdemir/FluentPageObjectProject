package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.ContactListPage;

public class C02_FluentPageMethods {
        /*
        Go to https://thinking-tester-contact-list.herokuapp.com/
        Enter email clarusway@hotmail.com
        Enter password Clarusway.123
        Click submit button
        Assert Logout button
     */

    @Test
    void fluentPageMethodsTest() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        ContactListPage contactListPage = new ContactListPage(driver);

//        Go to https://thinking-tester-contact-list.herokuapp.com/
        driver.get("https://thinking-tester-contact-list.herokuapp.com");

//        Enter email clarusway@hotmail.com
        contactListPage.enterEmail("clarusway@hotmail.com");

//        Enter password Clarusway.123


//        Click submit button


//        Assert Logout button


        Thread.sleep(3000);
        driver.quit();

    }


}