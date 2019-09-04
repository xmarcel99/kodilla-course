package com.kodilla.testing2.google;

import com.kodilla.testing2.google.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleTestingApp {

    public static final   String SEARCHFIELD  = "q";

    public static void main(String[] args) {

        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.google.com");

        WebElement searchElement = driver.findElement(By.name(SEARCHFIELD));
        searchElement.sendKeys("Kodilla");
        searchElement.submit();
    }
}
