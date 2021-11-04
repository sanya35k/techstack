package ui.pages.homePage;

import org.openqa.selenium.WebDriver;
import ui.components.Header;

public class HomePage {

    private WebDriver driver;
    public Header header;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        header = new Header(this.driver);
    }
}