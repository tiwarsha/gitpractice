package com.example.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    protected WebDriver driver;

    public void setup() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
// this is my code that i need to practice and sit behined the scenes.
        driver.manage().window().maximize();
    }

    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
}