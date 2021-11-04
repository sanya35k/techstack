package ui.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.testng.Assert.assertEquals;

public class Header {
    private WebDriver driver;
    private By userNameLabel = By.cssSelector(".dropdown-toggle span");

    public Header(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyLabel(String expText) {
        String text = this.driver.findElement(userNameLabel).getText().toUpperCase();
        assertEquals(text, expText.toUpperCase());
    }
}