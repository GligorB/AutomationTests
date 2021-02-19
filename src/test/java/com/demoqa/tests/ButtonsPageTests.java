package com.demoqa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ButtonsPageTests extends BaseTest{

    @Test
    public void test1(){
        driver.navigate().to(URL2);
        Assert.assertEquals(buttonsPage.getTitleButtons(),"Buttons");
        catc();
    }

    @Test
    public void test2(){
        driver.navigate().to(URL2);
        buttonsPage.clickClickMeButton();
        Assert.assertEquals(buttonsPage.responseClickMe(),"You have done a dynamic click");
        catc();
    }
}
