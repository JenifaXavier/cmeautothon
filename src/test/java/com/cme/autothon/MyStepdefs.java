package com.cme.autothon.runner;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyStepdefs {
    public static WebDriver driver;
//    public static String driverPath = ".\\src\\main\\resources\\chromedriver.exe";

    @Before
    public static void setupClass() {
        WebDriverManager.chromedriver().setup();
    }

    @Before
    public void setupTest() {
        driver = new ChromeDriver();
    }

    @After
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }


    @And("^The \"(.*)\" has been launched$")
    public void theHasBeenLaunched(String url) {
//          System.setProperty("webdriver.chrome.driver",driverPath);
//          driver = new ChromeDriver();
          driver.get("https://www.amazon.in/");
    }
}
