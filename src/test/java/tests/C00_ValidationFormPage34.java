package tests;

import org.checkerframework.checker.index.qual.Positive;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.ContactListPage;
import pages.ValidationFormPage;
import utilities.Driver;
import utilities.ParallelDriver;

public class C00_ValidationFormPage34 {

    @Test
    void testValidationScenario1() throws InterruptedException {
        ValidationFormPage validationFormPage = new ValidationFormPage();
        ParallelDriver.getDriver().get("https://testpages.eviltester.com/styled/validation/input-validation.html");

        validationFormPage.enterFirstname("Sem")
                .enterLastname("o") // kısa lastname
                .enterAge("22")
                .enterCountry("Canada")
                .enterNotes("sdfghj")
                .clickGonder()
                .hataLastname();

        Thread.sleep(3000);
        //ParallelDriver.closeDriver();
    }

    @Test
    void testValidationScenario2() throws InterruptedException {
        ValidationFormPage validationFormPage = new ValidationFormPage();
        ParallelDriver.getDriver().get("https://testpages.eviltester.com/styled/validation/input-validation.html");

        validationFormPage.enterFirstname("Sem")
                .enterLastname("oz")
                .enterAge("") // bos age
                .enterCountry("Canada")
                .enterNotes("sdfghj")
                .clickGonder()
                .hataAge();

        Thread.sleep(3000);
      //  ParallelDriver.closeDriver();
    }

    @Test //pozitif test
    void testValidationScenario3() throws InterruptedException {
        ValidationFormPage validationFormPage = new ValidationFormPage();
        ParallelDriver.getDriver().get("https://testpages.eviltester.com/styled/validation/input-validation.html");

        validationFormPage.enterFirstname("Sem")
                .enterLastname("oz")
                .enterAge("22")
                .enterCountry("Canada")
                .enterNotes("sdfghj")
                .clickGonder();

        Thread.sleep(3000);
    }
}
