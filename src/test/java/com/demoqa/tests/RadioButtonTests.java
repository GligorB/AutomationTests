package com.demoqa.tests;

import org.testng.annotations.Test;

public class RadioButtonTests extends BaseTest{

    @Test
    public void test1(){
        driver.navigate().to(URL3);
        radioButtonPage.getTitleRadioButton();
        catc();
    }

    @Test
    public void test2(){
        driver.navigate().to(URL3);
        // samo impresive mi go selektira so drugite indeksi za Yes nesaka
        radioButtonPage.click_radio(2);
        catc();
    }

}
