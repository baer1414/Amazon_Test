package com.amazon.tests;

import com.amazon.utilities.BrowserFactory;
import org.openqa.selenium.WebDriver;

public class FirefoxTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= BrowserFactory.getDriver("firefox");
        driver.get("https://www.amazon.com.tr/");
        Thread.sleep(2000);
        driver.close();
    }
}
