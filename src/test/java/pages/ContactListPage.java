package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactListPage {

    private WebDriver driver;

    public ContactListPage(WebDriver driver) {//Bu classtan obje oluştutken test classında kullanılan driver bu classın driver'ına assign adilir.
        this.driver = driver;
    }

    public ContactListPage() {//Bu constructor default constructor yerine geçecektir.
        //Java'da bir classta constructor oluşturulduğunda default oln yok olur.
        //Bu sebeple paramteresiz constrcutor'ı kullanmak istiyorsanız boş bir constructor oluşturmalısınız.
    }

    //Buraya test classlarında yada fluent page classlarındaki methodlarda kullanılacak By objeleri konulur.
    public By email = By.id("email");
    public By password = By.id("password");
    public By submit = By.id("submit");
    public By logout = By.id("logout");


    public ContactListPage enterEmail(String email) {
        driver.findElement(this.email).sendKeys(email);
        return this;//Bu classın bir objesini döner. Bu sayede her methodu method chain şeklinde kullanabiliriz.
    }

    public ContactListPage enterPassword(String password) {
        driver.findElement(this.password).sendKeys(password);
        return this;
    }

    public ContactListPage clickSubmit() {
        driver.findElement(this.submit).click();
        return this;
    }

    public ContactListPage assertLogout() {
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        assert driver.findElement(this.logout).isDisplayed();

        return this;
    }


}