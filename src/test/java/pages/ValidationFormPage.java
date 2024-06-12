package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;
import utilities.ParallelDriver;

import java.time.Duration;

public class ValidationFormPage {


    //Buraya test classlarında yada fluent page classlarındaki methodlarda kullanılacak By objeleri konulur.
    public By firstname = By.name("firstname");
    public By lastname = By.xpath("//input[@id='surname']");
    public By age = By.name("age");
    public By country = By.id("country");
    public By notes = By.name("notes");
    public By gonder = By.xpath("//input[@type='submit']");
    public By hataLastname = By.xpath("//form[@action='/validate/input-validation']");
    //public By hataAge = By.xpath("//label[@name='agevalidation']");
    public By hataAge = By.xpath("(//label[@class='errormessage'])[3]");


    public ValidationFormPage enterFirstname(String firstname) {
        ParallelDriver.getDriver().findElement(this.firstname).sendKeys(firstname);
        return this;//Bu classın bir objesini döner. Bu sayede her methodu method chain şeklinde kullanabiliriz.
    }

    public ValidationFormPage enterLastname(String lastname) {
        ParallelDriver.getDriver().findElement(this.lastname).sendKeys(lastname);
        return this;
    }

    public ValidationFormPage enterAge(String age) {
        ParallelDriver.getDriver().findElement(this.age).sendKeys(age);
        return this;
    }

    public ValidationFormPage chooseCountry(String country) {
        new Select(ParallelDriver.getDriver().findElement(this.country)).deselectByVisibleText(country);
        return this;

    }

    public ValidationFormPage enterNotes(String notes) {
        ParallelDriver.getDriver().findElement(this.notes).sendKeys(notes);
        return this;
    }

    public ValidationFormPage clickGonder() {
        ParallelDriver.getDriver().findElement(this.gonder).click();
        return this;
    }
    public ValidationFormPage hataLastname() {
    assert ParallelDriver.getDriver().findElement(this.hataLastname).isDisplayed();
        return this;
    }
    public ValidationFormPage hataAge() {
//        WebDriverWait wait = new WebDriverWait(ParallelDriver.getDriver(), Duration.ofSeconds(20)); // Increased wait time to 20 seconds
//        WebElement ageError = wait.until(ExpectedConditions.visibilityOfElementLocated(this.hataAge));
//        assert ageError.isDisplayed();
//        return this;
        assert ParallelDriver.getDriver().findElement(this.hataAge).isDisplayed();
        return this;
    }
}
