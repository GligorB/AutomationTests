package com.demoqa.tests;

import com.demoqa.framework.Browser;
import com.demoqa.pages.*;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    public WebDriver driver;
    public WebDriverWait wait;
    public String brs ="chrome";
    public static final String URL="https://demoqa.com/links";
    public static final String URL2="https://demoqa.com/buttons";
    public static final String URL3="https://demoqa.com/radio-button";
    public static final String URL4="https://demoqa.com/checkbox";
    public static final String URL5="https://demoqa.com/automation-practice-form";
    public static final String URL6="https://demoqa.com/select-menu";


    public LinksPage linksPage;
    Browser browser=new Browser();

    public ButtonsPage buttonsPage;
    public RadioButtonPage radioButtonPage;
    public CheckBoxPage checkBoxPage;
    public PracticeForm practiceForm;
    public SelectMenu selectMenu;

    @BeforeMethod
    public void set_up(){
        driver = browser.open(this.brs);

        Dimension dimension=new Dimension(200,300);
        driver.manage().window().setSize(dimension);
        driver.manage().window().maximize();
        wait=new WebDriverWait(driver,20);

        linksPage=new LinksPage(driver,wait);
        buttonsPage=new ButtonsPage(driver,wait);
        radioButtonPage=new RadioButtonPage(driver,wait);
        checkBoxPage=new CheckBoxPage(driver,wait);
        practiceForm=new PracticeForm(driver,wait);
        selectMenu=new SelectMenu(driver,wait);

        //driver.manage().window().setSize(new Dimension(1024,768));
        //driver.manage().window().setPosition(new Point(15,20));
        //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println(driver.manage().window().getSize());

    }
    public void catc(){
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
        }}


    @AfterMethod
    public void tear_down(){
        driver.quit();
    }

}
