package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CompleteWebForm {

    public static void main(String[] args) {
	// write your code here
        System.setProperty("webdriver.chrome.driver", "C:\\seleniumWebdrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        FormPage formPage = new FormPage();
        formPage.submitForm(driver);

        ConfirmationPage confirmationPage = new ConfirmationPage();
         confirmationPage.waitForAlertBanner(driver);

        assert "The form was successfully submitted!" == confirmationPage.getAlertBannerText(driver);

    } // ENd of Main method







}
