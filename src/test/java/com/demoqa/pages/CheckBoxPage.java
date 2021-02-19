package com.demoqa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckBoxPage {
    WebDriver driver;
    WebDriverWait wait;

    By pageTitle=By.xpath("//*[@id=\"app\"]/div/div/div[1]/div");
    By home=By.xpath("//*[@id=\"tree-node\"]/ol/li/span/button");
    By office=By.xpath("\"//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li[2]/span/button/svg");

    public CheckBoxPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }
    public String getTitleCheckBox() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(pageTitle)).getText();
    }

    public void expandHome(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(home)).click();
    }
    public void expand(int i){

        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li/span/button"))).get(i).click();
                }
    public void expandUnderDocuments(int i){
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li/span/button"))).get(i).click();
    }

    public void selectHome(int indeks){
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@class='rct-node-icon']"))).get(indeks).click();

    }
    public void select3D(int i){
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(" //*[@id=\"tree-node\"]/ol/li/ol/li/span/label/span[1]"))).get(i).click();
    }
    public void selectUnderDesktop(int i){
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[1]/ol/li/span/label/span/svg"))).get(i).click();
    }

}
