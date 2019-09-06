package com.kodilla.testing2.facebook;

import com.kodilla.testing2.google.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {

    public static final String XPATH_BIRTHDAYMONTH = "//div[@class= \"_5k_5\"]/span/span/select[1]";
    public static final String XPATH_BIRTHDAYDAY = "//div[@class= \"_5k_5\"]/span/span/select[2]";
    public static final String XPATH_BIRTHDAYYEAR =  "//div[@class= \"_5k_5\"]/span/span/select[3]";
    public static void main(String[] args) {

        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com");


        WebElement birthdayMonth = driver.findElement(By.xpath(XPATH_BIRTHDAYMONTH));
        Select selectMonth = new Select(birthdayMonth);
        selectMonth.selectByIndex(3);

        WebElement birthdayDay = driver.findElement(By.xpath(XPATH_BIRTHDAYDAY));
        Select selectDay = new Select(birthdayDay);
        selectDay.selectByIndex(3);

        WebElement birthdayYear = driver.findElement(By.xpath(XPATH_BIRTHDAYYEAR));
        Select selectYear = new Select(birthdayYear);
        selectYear.selectByValue("2012");

    }
}
