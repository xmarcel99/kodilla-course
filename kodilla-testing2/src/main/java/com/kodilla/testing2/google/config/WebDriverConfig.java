package com.kodilla.testing2.google.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverConfig  {

   public static final String CHROME = "CHROME_DRIVER";

   public static WebDriver getDriver(final String driver) {

       System.setProperty("webdriver.chrome.driver","/home/xmarcel99/Documents/Development/Kodilla/chromedriver");

       if(driver.equals(CHROME)) {
           return new ChromeDriver();
       } else {
           return null;
       }
   }
}
