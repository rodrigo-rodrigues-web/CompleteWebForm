package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class FormPage {
    public static void submitForm (WebDriver driver ){

        driver.manage().window().maximize();

        driver.get("https://formy-project.herokuapp.com/form");

        driver.findElement(By.id("first-name")).sendKeys("Rodrigo");

        driver.findElement(By.id("last-name")).sendKeys("Rodrigues");

        driver.findElement(By.id("job-title")).sendKeys("Software Engineer in test");

        driver.findElement(By.id("radio-button-2")).click();

        driver.findElement(By.cssSelector("input[value='checkbox-1']")).click();

        driver.findElement(By.cssSelector("option[value='2']")).click();

        driver.findElement(By.id("datepicker")).sendKeys("08/26/2020");

        driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);

        driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();
    }
}
