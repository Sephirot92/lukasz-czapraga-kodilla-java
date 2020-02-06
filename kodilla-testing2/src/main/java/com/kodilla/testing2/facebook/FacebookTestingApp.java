package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {

    public static final String XPATH_WAIT_FOR_FIRST = "//select[1]";
    public static final String XPATH_WAIT_FOR_SECOND = "//select[2]";
    public static final String XPATH_WAIT_FOR_THIRD = "//select[3]";

    public static final String XPATH_SELECT_FIRST = "//div[contains(@class,\"_5k_5\")]/span/span/select[1]";
    public static final String XPATH_SELECT_SECOND = "//div[contains(@class,\"_5k_5\")]/span/span/select[2]";
    public static final String XPATH_SELECT_THIRD = "//div[contains(@class,\"_5k_5\")]/span/span/select[3]";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://pl-pl.facebook.com/");

        while (!driver.findElement(By.xpath(XPATH_WAIT_FOR_FIRST)).isDisplayed()) ;
        WebElement selectComboDay = driver.findElement(By.xpath(XPATH_SELECT_FIRST));
        Select selectDay = new Select(selectComboDay);
        selectDay.selectByIndex(10);

        while (!driver.findElement(By.xpath(XPATH_WAIT_FOR_SECOND)).isDisplayed()) ;
        WebElement selectComboMonth = driver.findElement(By.xpath(XPATH_SELECT_SECOND));
        Select selectMonth = new Select(selectComboMonth);
        selectMonth.selectByIndex(6);

        while (!driver.findElement(By.xpath(XPATH_WAIT_FOR_THIRD)).isDisplayed()) ;
        WebElement selectComboYear = driver.findElement(By.xpath(XPATH_SELECT_THIRD));
        Select selectYear = new Select(selectComboYear);
        selectYear.selectByVisibleText("1990");
    }
}
