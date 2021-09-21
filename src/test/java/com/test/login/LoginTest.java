package com.test.login;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends Baseclass {



    @Test
    public void Login(){
            driver.findElement(By.xpath("//span[text()='Dismiss']")).click();
            driver.findElement(By.id("navbarAccount")).click();
            driver.findElement(By.id("navbarLoginButton")).click();
            driver.findElement(By.id("email")).sendKeys("testemail@gmail.com");
            driver.findElement(By.id("password")).sendKeys("password@123");
            driver.findElement(By.id("loginButton")).click();

    }
}
