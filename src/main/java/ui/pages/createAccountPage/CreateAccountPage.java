package ui.pages.createAccountPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.testng.Assert.assertEquals;

public class CreateAccountPage {
    private WebDriver driver;
    private By Label = By.cssSelector(".container h3");
    private By signUpButton = By.cssSelector(".btn-success");

    private By emailTextField = By.cssSelector("#email");
    private By passwordTextField = By.cssSelector("#password");
    private By confirmPasswordTextField = By.cssSelector("#confirmPassword");

    public CreateAccountPage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyLabel() {
        String label = driver.findElement(Label).getText();
        assertEquals("Sign up", label);
    }

    public void clickOnGetStarted() {
        driver.findElement(signUpButton).click();
    }

    public void enterEmail(String arg1) {
        driver.findElement(emailTextField).sendKeys(arg1);
    }
    public void enterPassword(String arg1) {
        driver.findElement(passwordTextField).sendKeys(arg1);
    }
    public void enterConfirmPassword(String arg1) {
        driver.findElement(confirmPasswordTextField).sendKeys(arg1);
    }
}