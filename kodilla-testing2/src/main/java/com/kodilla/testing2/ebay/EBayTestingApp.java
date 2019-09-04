package com.kodilla.testing2.ebay;

import com.kodilla.testing2.google.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EBayTestingApp {

    public static void main(String[] args) {

        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.ebay.com");

        WebElement webElement = driver.findElement(By.id("gh-ac"));
        webElement.sendKeys("Laptop");
        webElement.submit();
    }
}
