package com.selenium.setup;

import org.testng.annotations.AfterClass;
import ui.pages.homePage.HomePage;
import ui.pages.loginPage.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginTest {
    private static final String URL = "https://sample-project.tech-stack.dev/login";
    WebDriver driver;
    LoginPage loginPage;
    HomePage homePage;

    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/templates/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(URL);
    }

    @Test(priority = 1)
    public void enterUserDetails() {
        this.driver = driver;
        loginPage = new LoginPage(driver);
        loginPage.enterEmail("konstantinov03051999@gmail.com");
        loginPage.enterPassword("03051999");
        homePage = loginPage.clickOnLoginButton();
        homePage.header.verifyLabel("konstantinov03051999@gmail.com");
    }

    @AfterClass
    public void closeDriver() {
        driver.close();
    }
}