package pages;

import org.openqa.selenium.By;
import utilities.ParallelDriver;

public class ContactListPageParallelDriver {


    //Buraya test classlarında yada fluent page classlarındaki methodlarda kullanılacak By objeleri konulur.
    public By email = By.id("email");
    public By password = By.id("password");
    public By submit = By.id("submit");
    public By logout = By.id("logout");


    public ContactListPageParallelDriver enterEmail(String email) {
        ParallelDriver.getDriver().findElement(this.email).sendKeys(email);
        return this;//Bu classın bir objesini döner. Bu sayede her methodu method chain şeklinde kullanabiliriz.
    }

    public ContactListPageParallelDriver enterPassword(String password) {
        ParallelDriver.getDriver().findElement(this.password).sendKeys(password);
        return this;
    }

    public ContactListPageParallelDriver clickSubmit() {
        ParallelDriver.getDriver().findElement(this.submit).click();
        return this;
    }

    public ContactListPageParallelDriver assertLogout() {
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        assert ParallelDriver.getDriver().findElement(this.logout).isDisplayed();

        return this;
    }


}
