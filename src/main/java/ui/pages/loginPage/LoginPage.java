package ui.pages.loginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ui.pages.homePage.HomePage;

public class LoginPage {
    private WebDriver driver;
    private By Label = By.cssSelector(".container h3");
    private By loginButton = By.cssSelector("button.btn-primary");
    private HomePage homePage;

    private By email = By.cssSelector("#email");
    private By password = By.cssSelector("#password");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage clickOnLoginButton() {
        driver.findElement(loginButton).click();
        return new HomePage(this.driver);
    }

    public void enterEmail(String arg1) {
        driver.findElement(email).sendKeys(arg1);
    }

    public void enterPassword(String arg1) {
        driver.findElement(password).sendKeys(arg1);
    }
}
