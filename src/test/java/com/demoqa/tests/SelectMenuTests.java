package com.demoqa.tests;

import org.testng.annotations.Test;

public class SelectMenuTests extends BaseTest{

    @Test
    public void prv(){
        driver.navigate().to(URL6);
        selectMenu.selectValue("A root option");
        selectMenu.selectOne("Mrs");
        // Za color red i indeks(value) od 1 do 10
        selectMenu.oldStyleSelect("1");
        // so indeks od 0-10
        selectMenu.oldStyleSelect1(5);
        selectMenu.multiSelectDropDown("Blue");
        selectMenu.multiSelectDropDown("Green");
        selectMenu.standardMultiSelect("volvo");
        selectMenu.standardMultiSelect("opel");

        catc();
    }
}
