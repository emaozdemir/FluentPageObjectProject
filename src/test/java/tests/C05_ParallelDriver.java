package tests;

import org.testng.annotations.Test;
import pages.ContactListPageParallelDriver;
import pages.ContactListPageSingletonDriver;
import utilities.Driver;
import utilities.ParallelDriver;

public class C05_ParallelDriver {

    /*
            Go to https://thinking-tester-contact-list.herokuapp.com/
            Enter email clarusway@hotmail.com
            Enter password Clarusway.123
            Click submit button
            Assert Logout button
        */
    @Test
    void fluentPageMethodChainTest() {

        ContactListPageParallelDriver contactListPageParallelDriver = new ContactListPageParallelDriver();

//        Go to https://thinking-tester-contact-list.herokuapp.com/
        ParallelDriver.getDriver().get("https://thinking-tester-contact-list.herokuapp.com/");

        contactListPageParallelDriver
                .enterEmail("clarusway@hotmail.com")//        Enter email clarusway@hotmail.com
                .enterPassword("Clarusway.123")//        Enter password Clarusway.123
                .clickSubmit()//        Click submit button
                .assertLogout()//        Assert Logout button
        ;

        ParallelDriver.closeDriver();

    }

    @Test
    void fluentPageMethodChainTest2() {

        ContactListPageParallelDriver contactListPageParallelDriver = new ContactListPageParallelDriver();

//        Go to https://thinking-tester-contact-list.herokuapp.com/
        ParallelDriver.getDriver().get("https://thinking-tester-contact-list.herokuapp.com/");

        contactListPageParallelDriver
                .enterEmail("jasonsteel@gmail.com")//        Enter email clarusway@hotmail.com
                .enterPassword("Jason.123")//        Enter password Clarusway.123
                .clickSubmit()//        Click submit button
                .assertLogout()//        Assert Logout button
        ;

        ParallelDriver.closeDriver();

    }

    @Test
    void fluentPageMethodChainTest3() {

        ContactListPageParallelDriver contactListPageParallelDriver = new ContactListPageParallelDriver();

//        Go to https://thinking-tester-contact-list.herokuapp.com/
        ParallelDriver.getDriver().get("https://thinking-tester-contact-list.herokuapp.com/");

        contactListPageParallelDriver
                .enterEmail("john.doech5@gmail.com")//        Enter email clarusway@hotmail.com
                .enterPassword("John.123")//        Enter password Clarusway.123
                .clickSubmit()//        Click submit button
                .assertLogout()//        Assert Logout button
        ;

        ParallelDriver.closeDriver();

    }

}