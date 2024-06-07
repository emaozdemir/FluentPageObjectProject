package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.ContactListPage;
import pages.ContactListPageSingletonDriver;
import utilities.Driver;

public class C04_SingletonDriver {

    /*
            Go to https://thinking-tester-contact-list.herokuapp.com/
            Enter email clarusway@hotmail.com
            Enter password Clarusway.123
            Click submit button
            Assert Logout button
        */
    @Test
    void fluentPageMethodChainTest() {

        ContactListPageSingletonDriver contactListPageSingletonDriver = new ContactListPageSingletonDriver();

//        Go to https://thinking-tester-contact-list.herokuapp.com/
        Driver.getDriver().get("https://thinking-tester-contact-list.herokuapp.com/");

        contactListPageSingletonDriver
                .enterEmail("clarusway@hotmail.com")//        Enter email clarusway@hotmail.com
                .enterPassword("Clarusway.123")//        Enter password Clarusway.123
                .clickSubmit()//        Click submit button
                .assertLogout()//        Assert Logout button
        ;

        Driver.closeDriver();

    }

}
