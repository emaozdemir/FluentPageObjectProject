package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ValidationFormPage {
    private WebDriver driver;

    public ValidationFormPage(WebDriver driver) {//Bu classtan obje oluştutken test classında kullanılan driver bu classın driver'ına assign adilir.
        this.driver = driver;
    }

    public ValidationFormPage() {//Bu constructor default constructor yerine geçecektir.
        //Java'da bir classta constructor oluşturulduğunda default oln yok olur.
        //Bu sebeple paramteresiz constrcutor'ı kullanmak istiyorsanız boş bir constructor oluşturmalısınız.
    }

    //Buraya test classlarında yada fluent page classlarındaki methodlarda kullanılacak By objeleri konulur.
    public By firstname = By.name("firstname");
    public By lastname = By.xpath("//input[@id='surname']");
    public By age = By.name("age");
    public By country = By.id("country");
    public By notes = By.name("notes");
    public By gonder = By.xpath("//input[@type='submit']");


    public void enterFirstname(String firstname) {
        driver.findElement(this.firstname).sendKeys(firstname);
    }

    public void enterLastname(String lastname) {
        driver.findElement(this.lastname).sendKeys(lastname);
    }

    public void enterAge(String age) {
        driver.findElement(this.age).sendKeys(age);
    }

    public void enterCountry(String country) {
        driver.findElement(this.country).sendKeys(country);
    }

    public void enterNotes(String notes) {
        driver.findElement(this.notes).sendKeys(notes);
    }

    public void clickGonder() {
        driver.findElement(this.gonder).click();
    }
}
