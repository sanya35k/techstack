package com.selenium.setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import ui.pages.createAccountPage.CreateAccountPage;

import java.util.concurrent.TimeUnit;

public class CreateAccountTest {
    private static final String URL = "https://sample-project.tech-stack.dev/signup";
    WebDriver driver;
    CreateAccountPage createAccountPage;

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
    public void verifyLabelOnCreateAccountPage() {
        createAccountPage = new CreateAccountPage(driver);
        createAccountPage.verifyLabel();
        createAccountPage.clickOnGetStarted();
    }

    @Test(priority = 2)
    public void enterUserDetails() {
        createAccountPage = new CreateAccountPage(driver);
        createAccountPage.enterEmail("testUser" + (int)Math.random()*10000 + "@gmail.com");
        createAccountPage.enterPassword("1234");
        createAccountPage.enterConfirmPassword("1234");
        createAccountPage.clickOnGetStarted();
    }

    @AfterClass
    public void closeDriver() {
        driver.close();
    }
}