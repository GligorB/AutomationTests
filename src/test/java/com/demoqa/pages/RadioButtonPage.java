package com.demoqa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RadioButtonPage {

    WebDriver driver;
    WebDriverWait wait;

By pageTitle=By.xpath("//*[@id=\"app\"]/div/div/div[1]/div");

    public RadioButtonPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }
    public String getTitleRadioButton(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(pageTitle)).getText();
    }

    public void click_radio(int index) {

        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[1]/div"))).get(index).click();
    }

}
