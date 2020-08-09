package com.cme.autothon;

import cucumber.api.java.en.And;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyStepdefs {
    public static WebDriver driver;
    public static String driverPath = ".\\src\\main\\resources\\chromedriver.exe";


    @And("^The \"(.*)\" has been launched$")
    public void theHasBeenLaunched(String url) {
          System.setProperty("webdriver.chrome.driver",driverPath);
          driver = new ChromeDriver();
          driver.get("https://www.amazon.in/");
    }
}
