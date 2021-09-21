package com.test.login;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.constants.PathConstants;

public class Baseclass {
    WebDriver driver;

    @BeforeMethod
    public void InitDriver(){
        System.setProperty("webdriver.chrome.driver", PathConstants.getDriverPath());
        driver = new ChromeDriver();
        driver.get("http://localhost:3000/");
    }

    @AfterMethod
    public void QuitDriver(){
        driver.quit();
    }
}
