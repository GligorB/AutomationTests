package com.demoqa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PracticeForm {
    WebDriver driver;
    WebDriverWait wait;

    public PracticeForm(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;

    }

    By homeTitle = By.xpath("//*[@id=\"app\"]/div/div/div[1]/div");
    By email = By.xpath("//*[@id=\"userEmail\"]");
    By ca = By.xpath("//*[@id=\"currentAddress\"]");
    By date = By.xpath("//*[@id=\"dateOfBirthInput\"]");
    By mobnum = By.xpath("//*[@id=\"userNumber\"]");
    By fName = By.xpath("//*[@id=\"firstName\"]");
    By prezime = By.xpath("//*[@id=\"lastName\"]");
    By submitButton = By.xpath("//*[@id=\"submit\"]");
    By hobby = By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div");
    By genderOption= By.xpath("//*[@id='genterWrapper']/div[2]/div");
    By states = By.xpath("//*[@id=\"react-select-3-input\"]");
    By cities=By.xpath("//*[@id=\"react-select-4-input\"]");
    //By subject = By.xpath("//*[@id=\"subjectsInput\"]");


    public String getTitle() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(homeTitle)).getText();
    }

    public void name(String name) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(fName)).sendKeys(name);

    }

    public void surname(String surname) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(prezime)).sendKeys(surname);
    }

    public void eMail(String eMail) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(email)).sendKeys(eMail);
    }

    public void mobileNumber(String mobile) {
        if (mobile.length() == 10) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(mobnum)).sendKeys(mobile);
        } else {
            System.out.println("The number must contain 10 digits");
        }
    }
    public void dateOfBirth(String dob){
        wait.until(ExpectedConditions.visibilityOfElementLocated(date)).sendKeys(Keys.chord(Keys.CONTROL,"a"),dob);
    }
   /* public void subject(String sub){
        wait.until(ExpectedConditions.visibilityOfElementLocated(subject)).sendKeys(sub);
    }*/

    public void hobbies(int i) {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(hobby)).get(i).click();
    }

    public void gender(int i) {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(genderOption)).get(i).click();
    }

    public void currentAddress(String Address){
        wait.until(ExpectedConditions.visibilityOfElementLocated(ca)).sendKeys(Address);
    }
    public void state(String st){
        wait.until(ExpectedConditions.visibilityOfElementLocated(states)).sendKeys(st);
        wait.until(ExpectedConditions.visibilityOfElementLocated(states)).sendKeys(Keys.ENTER);
    }
    public void city(String city){
        wait.until(ExpectedConditions.visibilityOfElementLocated(cities)).sendKeys(city);
        wait.until(ExpectedConditions.visibilityOfElementLocated(cities)).sendKeys(Keys.ENTER);
    }
    public void submit() {
        Actions actions = new Actions(driver);
        WebElement submitB=wait.until(ExpectedConditions.visibilityOfElementLocated(submitButton));
        actions.moveToElement(submitB).click().perform();
    }

    public String studentName(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div/div/div[2]/div/table/tbody/tr[1]/td[2]"))).getText();
    }
    public String studentEmail(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@class, 'table-dark')]/tbody/tr[2]/td[2]"))).getText();
    }
    public String studentGender(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div/div/div[2]/div/table/tbody/tr[3]/td[2]"))).getText();
    }
    public String studentMobile(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@class, 'table-dark')]/tbody/tr[4]/td[2]"))).getText();

    }
    public String studentDate(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div/div/div[2]/div/table/tbody/tr[5]/td[2] "))).getText();
    }
    public String studentHobbies(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div/div/div[2]/div/table/tbody/tr[7]/td[2]"))).getText();
    }
    public String studentAddress(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div/div/div[2]/div/table/tbody/tr[9]/td[2]"))).getText();
    }
    public String studentStateAndCity(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div/div/div[2]/div/table/tbody/tr[10]/td[2]"))).getText();
    }


}
