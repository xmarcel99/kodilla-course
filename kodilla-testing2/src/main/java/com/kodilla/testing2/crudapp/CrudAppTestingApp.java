package com.kodilla.testing2.crudapp;

import com.kodilla.testing2.google.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CrudAppTestingApp {
    public static final String XPATH_INPUT = "/html/body/main/section/form/fieldset/input";
    public static final String XPATH_TEXTAREA = "/html/body/main/section/form/fieldset[2]/textarea";
    public static final String XPATH_WAITFOR = "//select[1]";
    public static final String XPATH_SELECT = "//div[contains(@class, \"tasks-container\")]/form/div/fieldset/select[1]";

    public static void main(String[] args) {

        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://xmarcel99.github.io/");

        WebElement webElement = driver.findElement(By.xpath(XPATH_INPUT));
        webElement.sendKeys("New robotic task");

        WebElement searchElement = driver.findElement(By.xpath(XPATH_TEXTAREA));
        searchElement.sendKeys("The robotic contex");

        while (!driver.findElement(By.xpath(XPATH_WAITFOR)).isDisplayed());
        WebElement selectElement = driver.findElement(By.xpath(XPATH_SELECT));
        Select select = new Select(selectElement);
        select.selectByIndex(1);

    }
}
