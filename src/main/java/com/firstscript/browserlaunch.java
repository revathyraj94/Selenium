package com.firstscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browserlaunch {

    public static void main( String[] args ) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\RahulDevan\\Downloads\\Revathy\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
         driver.get("https://www.facebook.com/");
         //driver.navigate().to("https://www.facebook.com/login/identify/");
         //driver.navigate().back();
         //driver.navigate().forward();

         driver.navigate().refresh();
         String tit = driver.getTitle();
         System.out.println("Title:" +tit);
         String url = driver.getCurrentUrl();
         System.out.println("Current url:" +url);
         driver.navigate().to("https://www.facebook.com/login/identify");
         String pagesource = driver.getPageSource();
         System.out.println("page source of forgot password:" +pagesource);
         driver.close();
         //driver.quit();



    }


}
