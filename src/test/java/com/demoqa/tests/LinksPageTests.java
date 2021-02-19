package com.demoqa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LinksPageTests extends BaseTest {

    @Test
    public void test1() {
        driver.navigate().to(URL);
        Assert.assertEquals(linksPage.getTitleLinks(), "Links");
        linksPage.clickHomeLink();
        linksPage.clickHomeDynamic();
        catc();
    }
    @Test
    public void test2(){
        driver.navigate().to(URL);
        linksPage.clickCreatedLink();
        Assert.assertEquals(linksPage.response(), "Link has responded with staus 201 and status text Created");
        catc();
    }
    @Test
    public void test3(){
        driver.navigate().to(URL);
        linksPage.clickNoContentLink();
        Assert.assertEquals(linksPage.response(), "Link has responded with staus 204 and status text No Content");
        catc();
    }
    @Test
    public void test4(){
        driver.navigate().to(URL);
        linksPage.clickMovedLink();
        Assert.assertEquals(linksPage.response(), "Link has responded with staus 301 and status text Moved Permanently");
        catc();
    }
    @Test
    public void test5(){
        driver.navigate().to(URL);
        linksPage.clickBadRequestLink();
        Assert.assertEquals(linksPage.response(), "Link has responded with staus 400 and status text Bad Request");
        catc();
    }
    @Test
    public void test6(){
        driver.navigate().to(URL);
        linksPage.clickUnauthorizedLink();
        Assert.assertEquals(linksPage.response(), "Link has responded with staus 401 and status text Unauthorized");
        catc();
    }
    @Test
    public void test7(){
        driver.navigate().to(URL);
        linksPage.clickForbiddenLink();
        Assert.assertEquals(linksPage.response(), "Link has responded with staus 403 and status text Forbidden");
        catc();
    }
    @Test
    public void test8(){
        driver.navigate().to(URL);
        linksPage.clickNotFoundLink();
        Assert.assertEquals(linksPage.response(), "Link has responded with staus 404 and status text Not Found");
        catc();
    }
}
