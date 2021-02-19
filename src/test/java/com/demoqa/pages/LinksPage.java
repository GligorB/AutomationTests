package com.demoqa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LinksPage {

    WebDriver driver;
    WebDriverWait wait;

    // lokatori
    By homeLink = By.id("simpleLink");
    By pageTitle = By.xpath("//*[@id=\"app\"]/div/div/div[1]/div");
    By homeDynamic = By.id("dynamicLink");
    By created = By.id("created");
    By noContent = By.id("no-content");
    By moved = By.id("moved");
    By badRequest = By.xpath("//*[@id=\"bad-request\"]");
    By unauthorized = By.id("unauthorized");
    By forbidden = By.id("forbidden");
    By notFound = By.id("invalid-url");
    By responseCode = By.xpath("//*[@id=\"linkResponse\"]");

    public LinksPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void clickHomeLink() {
        // driver.findElement(homeLink).click();
        //barame elementi so nachin podole
        wait.until(ExpectedConditions.visibilityOfElementLocated(homeLink)).click();
    }

    public String getTitleLinks() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(pageTitle)).getText();

    }

    public void clickHomeDynamic() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(homeDynamic)).click();
    }

    public void clickCreatedLink() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(created)).click();

    }

    public void clickNoContentLink() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(noContent)).click();
    }

    public void clickMovedLink() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(moved)).click();
    }

    public void clickBadRequestLink() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(badRequest)).click();
    }

    public void clickUnauthorizedLink() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(unauthorized)).click();
    }

    public void clickForbiddenLink() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(forbidden)).click();
    }

    public void clickNotFoundLink() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(notFound)).click();
    }

    public String response() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(responseCode)).getText();
    }
}
