package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.Driver;

public class ContactListPageSingletonDriver {


    //Buraya test classlarında yada fluent page classlarındaki methodlarda kullanılacak By objeleri konulur.
    public By email = By.id("email");
    public By password = By.id("password");
    public By submit = By.id("submit");
    public By logout = By.id("logout");


    public ContactListPageSingletonDriver enterEmail(String email) {
        Driver.getDriver().findElement(this.email).sendKeys(email);
        return this;//Bu classın bir objesini döner. Bu sayede her methodu method chain şeklinde kullanabiliriz.
    }

    public ContactListPageSingletonDriver enterPassword(String password) {
        Driver.getDriver().findElement(this.password).sendKeys(password);
        return this;
    }

    public ContactListPageSingletonDriver clickSubmit() {
        Driver.getDriver().findElement(this.submit).click();
        return this;
    }

    public ContactListPageSingletonDriver assertLogout() {
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        assert Driver.getDriver().findElement(this.logout).isDisplayed();

        return this;
    }


}