package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.ContactListPage;

public class C03_FluentPageMethodChain {
    /*
        Go to https://thinking-tester-contact-list.herokuapp.com/
        Enter email clarusway@hotmail.com
        Enter password Clarusway.123
        Click submit button
        Assert Logout button
    */
    @Test
    void fluentPageMethodChainTest() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        ContactListPage contactListPage = new ContactListPage(driver);
//        Go to https://thinking-tester-contact-list.herokuapp.com/
        driver.get("https://thinking-tester-contact-list.herokuapp.com/");
        contactListPage
                .enterEmail("clarusway@hotmail.com")//        Enter email clarusway@hotmail.com
                .enterPassword("Clarusway.123")//        Enter password Clarusway.123
                .clickSubmit()//        Click submit button
                .assertLogout()//        Assert Logout button
        ;
        Thread.sleep(3000);
        driver.quit();
    }
}