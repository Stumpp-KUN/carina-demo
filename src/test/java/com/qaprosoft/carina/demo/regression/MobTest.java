package com.qaprosoft.carina.demo.regression;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.demo.mobTest.*;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class MobTest implements IAbstractTest, IMobileUtils {

    @Test
    public void loginTest(){
        String username="test";
        String password="testTest1";
        WelcomePage welcomePage = new WelcomePage(getDriver());
        Assert.assertTrue(welcomePage.isPageOpened(), "Welcome page isn't opened");
        LoginPage loginPage =welcomePage.clickStart();
        Assert.assertNotEquals(loginPage,null);
        Assert.assertTrue(loginPage.findAndClickLoginPanelClickIfPresent());
        loginPage.typeUsername(username);
        loginPage.typePassword(password);
        loginPage.logInClickIfPresent();
    }

    @Test
    public void freeShippingTest(){
        WelcomePage welcomePage = new WelcomePage(getDriver());
        Assert.assertTrue(welcomePage.isPageOpened(), "Welcome page isn't opened");
        MainPage mainPage=welcomePage.clickStartBtn();
        Assert.assertNotEquals(mainPage,null);
        FreeSheepPage freeSheepPage=mainPage.sheepPage();
        Assert.assertTrue(freeSheepPage.iconsCall(),"Shop element not found");
        String t= freeSheepPage.getText("Casing Samsung A03s A53 A73 A23 A13 A03s A21s A10s A12 A22 A72 A32 A52 A02s A52s A50 A50s A30s A33 M12 Luxury Wallet Credit Card Slot Phone Case Shockproof Soft TPU Back Cover");
        Assert.assertNotEquals(t,null, "Element name is null");
    }

    @Test
    public void seeMoreTest(){
        WelcomePage welcomePage = new WelcomePage(getDriver());
        Assert.assertTrue(welcomePage.isPageOpened(), "Welcome page isn't opened");
        MainPage mainPage=welcomePage.clickStartBtn();
        Assert.assertNotEquals(mainPage,null);
        SeeMorePage seeMorePage =mainPage.recPage();
        Assert.assertTrue(seeMorePage.clickIfPresentSeeMore(),"SeeMoreNotFound");
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(seeMorePage.firstIcon());
        softAssert.assertTrue(seeMorePage.secondIcon());
        softAssert.assertTrue(seeMorePage.thirdIcon());
        softAssert.assertTrue(seeMorePage.fourthIcon());
        softAssert.assertTrue(seeMorePage.fifthIcon());
        softAssert.assertAll();
    }

    @Test
    public void searchFiltersTest(){
        WelcomePage welcomePage = new WelcomePage(getDriver());
        Assert.assertTrue(welcomePage.isPageOpened(), "Welcome page isn't opened");
        MainPage mainPage=welcomePage.clickStartBtn();
        Assert.assertNotEquals(mainPage,null);
        SearchPage searchPage=mainPage.searchPage();

        SoftAssert softAssert=new SoftAssert();
        String t=searchPage.getItemName();
        softAssert.assertTrue(searchPage.latestClickIfPresent(),"Latest btn not found");
        Assert.assertNotEquals(t,searchPage.getItemName(),"Similar items");
        t=searchPage.getItemName();
        softAssert.assertTrue(searchPage.topSalesClickIfPresent(),"TopSales btn not found");
        Assert.assertNotEquals(t,searchPage.getItemName(),"Similar items");
        softAssert.assertTrue(searchPage.priceClickIfPresent(),"First click price error");
        softAssert.assertTrue(searchPage.priceClickIfPresent(),"Second click price error");
        softAssert.assertAll();
        Assert.assertTrue(searchPage.seeShopClickIfPresent());
    }

    @Test
    public void liveTest(){
        WelcomePage welcomePage = new WelcomePage(getDriver());
        Assert.assertTrue(welcomePage.isPageOpened(), "Welcome page isn't opened");
        MainPage mainPage=welcomePage.clickStartBtn();
        Assert.assertNotEquals(mainPage,null);
        LivePage livePage=mainPage.livePage();
        Assert.assertNotEquals(livePage,null);
        Assert.assertTrue(livePage.replayBtnClickIfPresent());
        Assert.assertTrue(livePage.lastReplay());

    }
}
