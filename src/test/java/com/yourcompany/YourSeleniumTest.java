package com.yourcompany;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class YourSeleniumTest {
    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        // Set up WebDriverManager to handle ChromeDriver setup
        WebDriverManager.chromedriver().setup();

        // Set up ChromeOptions
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        // Uncomment if you need headless mode
         options.addArguments("--headless");
         options.addArguments("--disable-gpu"); // Optional: Disable GPU acceleration

        // Initialize ChromeDriver with options
        driver = new ChromeDriver(options);
    }

    @Test
    public void testExample() {
        driver.get("https://example.com");
        System.out.println(driver.getTitle());
        // Your test logic here
    }

    @Test
    public void url() {
        driver.get("https://example.com");
        System.out.println(driver.getCurrentUrl());
        // Your test logic here
    }

    @AfterClass
    public void tearDown() {
        // Quit the driver session
        if (driver != null) {
            driver.quit();
        }
    }
}
