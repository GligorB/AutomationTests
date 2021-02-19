package com.demoqa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectMenu {
    WebDriver driver;
    WebDriverWait wait;

    public SelectMenu(WebDriver driver, WebDriverWait wait){
        this.driver=driver;
        this.wait=wait;
    }

    By selectVal= By.xpath("//*[@id=\"react-select-2-input\"]");
    By select1=By.xpath("//*[@id=\"react-select-3-input\"]");
    By oldStyle=By.xpath("//*[@id=\"oldSelectMenu\"]");
    By standard=By.xpath("//*[@id=\"cars\"]");
    By dropDown=By.xpath("//*[@id=\"react-select-4-input\"]");


    public void oldStyleSelect(String color){
        Select select=new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(oldStyle)));
        select.selectByValue(color);
    }

    //ista metoda select so index
    public void oldStyleSelect1(int index){
        Select select=new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(oldStyle)));
        select.selectByIndex(index);
    }

    public void standardMultiSelect(String car){
        Select select=new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(standard)));
        select.selectByValue(car);

    }

    public void multiSelectDropDown(String color){

        wait.until(ExpectedConditions.visibilityOfElementLocated(dropDown)).sendKeys(color);
        wait.until(ExpectedConditions.visibilityOfElementLocated(dropDown)).sendKeys(Keys.ENTER);
    }

    public void selectValue(String value){
        wait.until(ExpectedConditions.visibilityOfElementLocated(selectVal)).sendKeys(value);
        wait.until(ExpectedConditions.visibilityOfElementLocated(selectVal)).sendKeys(Keys.ENTER);
    }

    public void selectOne(String one){
        wait.until(ExpectedConditions.visibilityOfElementLocated(select1)).sendKeys(one);
        wait.until(ExpectedConditions.visibilityOfElementLocated(select1)).sendKeys(Keys.ENTER);
    }


}
