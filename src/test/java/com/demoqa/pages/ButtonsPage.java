package com.demoqa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ButtonsPage {

    WebDriver driver;
    WebDriverWait wait;

    By ClickMe = By.xpath("/html/body/div/div/div/div[2]/div[2]/div[1]/div[3]/button");
    By pageTitle1 = By.xpath("//*[@id=\"app\"]/div/div/div[1]/div");
    By response = By.xpath("//*[@id=\"dynamicClickMessage\"]");

    public ButtonsPage(WebDriver driver, WebDriverWait wait) {

        this.driver = driver;
        this.wait = wait;

    }

    public String getTitleButtons() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(pageTitle1)).getText();
    }

    public void clickClickMeButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(ClickMe)).click();
    }

    public String responseClickMe() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(response)).getText();
    }


}
