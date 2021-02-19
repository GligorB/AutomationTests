package com.demoqa.tests;

import org.testng.annotations.Test;

public class CheckBoxTests extends BaseTest{

    @Test
    public void test1(){
        driver.navigate().to(URL4);
        checkBoxPage.getTitleCheckBox();
        catc();
    }

    @Test
    public void test2(){
        driver.navigate().to(URL4);
        checkBoxPage.expandHome();
        // Vo zavisnost od indeks od 0-2 expandira Desktop,Documents ili Downloads
        checkBoxPage.expand(0);
        checkBoxPage.expand(1);
        checkBoxPage.expand(2);
        // expand 0-1 za Work Space & Office
        checkBoxPage.expandUnderDocuments(0);
        checkBoxPage.expandUnderDocuments(1);
       // selektira Home
       // checkBoxPage.selectHome(0);
       // Selektira Dekstop/Documents/Downloads
       // checkBoxPage.select3D(0);
        checkBoxPage.select3D(0);
        checkBoxPage.select3D(1);
        //checkBoxPage.select3D(2);
        //checkBoxPage.selectUnderDesktop(0);
        // expand documents

        catc();
    }

}
