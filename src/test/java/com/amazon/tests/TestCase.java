package com.amazon.tests;

import com.amazon.utilities.Assertions;
import com.amazon.utilities.BrowserFactory;
import org.openqa.selenium.WebDriver;

public class TestCase {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= BrowserFactory.getDriver("chrome");
        driver.get("https://www.google.com.tr/");
        Thread.sleep(2000);
        System.out.println("driver.getTitle()="+driver.getTitle());

        String title="Google | ";

        String actualTitle= driver.getTitle();

        Assertions.verifyEquals(title,actualTitle);

        driver.get("https://www.amazon.com.tr/");

        Thread.sleep(2000);
        System.out.println("driver.getTitle()="+driver.getTitle());

        String title1="Amazon |Elektronik, bilgisayar, akıllı telefon, kitap, oyuncak, yapı market, ev, mutfak, oyun konsolları ürünleri ve daha fazlası için internet alışveriş sitesi";

        String actualTitle1= driver.getTitle();

        Assertions.verifyEquals(title1,actualTitle1);

        driver.navigate().back();
        Thread.sleep(2000);

        String title2=driver.getTitle();
        Assertions.verifyEquals(title,title2);


        driver.navigate().forward();
        Thread.sleep(2000);

        driver.navigate().refresh();


        String title3=driver.getTitle();
        Assertions.verifyEquals(title1,title3);





    }
}
