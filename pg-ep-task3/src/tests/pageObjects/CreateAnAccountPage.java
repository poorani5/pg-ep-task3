package tests.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static org.junit.Assert.assertEquals;

public class CreateAnAccountPage{
    private WebDriver driver;
    private String xpathButtonCreateAnAccount = "//*[@id=\"SubmitCreate\"]/span";

    public CreateAnAccountPage(WebDriver driver) {
        this.driver = driver;
    }

    public void testClickButton_SingIn(){
        WebElement headerUserInfo = driver.findElement(By.className("header_user_info"));
        headerUserInfo.findElement(By.className("login")).click();
    }

    public void fillCreateAnAccountEmailField(String email) {
        WebElement formCreateAccount = driver.findElement(By.id("create-account_form"));
        formCreateAccount.findElement(By.id("email_create")).sendKeys(email);
    }

    public void clickButtonCreateAnAccount() {
        WebElement formCreateAccount = driver.findElement(By.id("create-account_form"));
        formCreateAccount.findElement(By.xpath(xpathButtonCreateAnAccount)).click();
    }

    public void checkElementsIsDisplayed() {
        driver.findElement(By.className("account_creation")).isDisplayed();
    }

    public void checkTextsElements() {
        assertEquals("Authentication", driver.findElement(By.className("navigation_page")).getText());
        WebElement formAccoutCreation = driver.findElement(By.id("noSlide"));
        assertEquals("YOUR PERSONAL INFORMATION",formAccoutCreation.findElement(By.xpath("//*[@id=\"account-creation_form\"]/div[1]/h3N")).getText());
        assertEquals("Title",formAccoutCreation.findElement(By.className("clearfix")).getText());
    }

    public void fillGender() {
        WebElement gender = driver.findElement(By.id("id_gender1"));
        gender.click();
    }

    public void fillFirstName() {
        driver.findElement(By.id("customer_firstname")).sendKeys("PierceTestFirstName");
    }

    public void fillLastName() {
        driver.findElement(By.id("customer_lastname")).sendKeys("PierceTestLasttName");
    }

    public void fillPassword() {
        driver.findElement(By.id("passwd")).sendKeys("12345678");
    }

    public void fillDayOfBirth() {
        WebElement dayOfBirth = driver.findElement(By.id("days"));
        new Select(dayOfBirth).selectByValue("10");
    }

    public void fillMonthOfBirth() {
        WebElement monthOfBirth = driver.findElement(By.id("months"));
        new Select(monthOfBirth).selectByValue("10");
    }

    public void fillYearOfBirth() {
        WebElement yearOfBirth = driver.findElement(By.id("years"));
        new Select(yearOfBirth).selectByValue("1994");
    }

    public void fillAdressFirstName() {
        driver.findElement(By.id("firstname")).sendKeys("PierceTestFirstName");
    }

    public void fillAdressLastName() {
        driver.findElement(By.id("lastname")).sendKeys("PierceTestLastName");
    }

    public void fillCompany() {
        driver.findElement(By.id("company")).sendKeys("PierceGroup");
    }

    public void fillAdressCompany() {
        driver.findElement(By.id("address1")).sendKeys("Elektravägen 22");
    }

    public void fillAdressLine2() {
        driver.findElement(By.id("address2")).sendKeys("Hägersten");
    }

    public void fillAdressCity() {
        driver.findElement(By.id("city")).sendKeys("Stockholm");
    }

    public void fillAdressState() {
        WebElement state = driver.findElement(By.id("id_state"));
        new Select(state).selectByVisibleText("Texas");
    }

    public void fillAdressPostalCode() {
        driver.findElement(By.id("postcode")).sendKeys("99887");
    }

    public void fillAdressCountry() {
        WebElement state = driver.findElement(By.id("id_country"));
        new Select(state).selectByVisibleText("United States");
    }

    public void fillAdressAditionalInformation() {
        driver.findElement(By.id("other")).sendKeys("-");
    }

    public void fillAdressHomePhone() {
        driver.findElement(By.id("phone")).sendKeys("+12345676890");
    }

    public void fillAdressMobilePhone() {
        driver.findElement(By.id("phone_mobile")).sendKeys("+12345676890");
    }

    public void fillAdressReference() {
        driver.findElement(By.id("alias")).sendKeys("ABC Alias");
    }

    public void clickButtonRegister() {
        driver.findElement(By.id("submitAccount")).click();
    }

    public void checkLoginName() {
        assertEquals("PierceTestFirstName PierceTestLastName", driver.findElement(By.className("account")).getText());
    }

    public void clickSignOut() {
        driver.findElement(By.linkText("Sign out")).click();
    }
}
