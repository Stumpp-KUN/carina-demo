//package com.qaprosoft.carina.demo;
//
//import com.qaprosoft.carina.core.foundation.IAbstractTest;
//import com.qaprosoft.carina.demo.gui.sauceDemo.LoggingPage;
//import com.qaprosoft.carina.demo.gui.sauceDemo.MainPage;
//import com.qaprosoft.carina.demo.gui.sauceDemo.components.SearchModel;
//import com.zebrunner.agent.core.annotation.TestLabel;
//import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
//import com.zebrunner.carina.core.registrar.tag.Priority;
//import com.zebrunner.carina.core.registrar.tag.TestPriority;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//import org.testng.annotations.BeforeSuite;
//import org.testng.annotations.Test;
//import org.apache.commons.collections.CollectionUtils;
//import java.util.List;
//
//public class WebTest implements IAbstractTest {
//    LoggingPage loggingPage=null;
//    MainPage mainPage=null;
//    @BeforeSuite
//    public void startDriver() {
//        System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
//        WebDriver driver=new ChromeDriver();
//        loggingPage = new LoggingPage(driver);
//        mainPage=new MainPage(driver);
//    }
//
//    @Test
//    @MethodOwner(owner = "sausedemo")
//    @TestLabel(name = "feature", value = {"web", "regression"})
//    public void loginTest(){
//        loggingPage.open();
//        Assert.assertTrue(loggingPage.isPageOpened(),"Page is not opened");
//        Assert.assertTrue(loggingPage.getLog(),"Error of logging");
//    }
//
//    @Test
//    @MethodOwner(owner = "sausedemo")
//    @TestLabel(name = "feature", value = {"web", "regression"})
//    public void bucketTest(){
//        mainPage.open();
//        Assert.assertTrue(mainPage.isPageOpened(),"Page is not opened");
//        Assert.assertEquals(mainPage.checkBucket(),"3");
//    }
//
//    @Test
//    @MethodOwner(owner = "sausedemo")
//    @TestLabel(name = "feature", value = {"web", "regression"})
//    public void checkTest(){
//        mainPage.open();
//        Assert.assertTrue(mainPage.isPageOpened(), "Page is not opened");
//        Assert.assertEquals(mainPage.checkItem(),true);
//    }
//
//    @Test
//    @MethodOwner(owner = "sausedemo")
//    @TestLabel(name = "feature", value = {"web", "regression"})
//    public void searchTest(){
//        mainPage.open();
//        Assert.assertTrue(mainPage.isPageOpened(),"Page in not opened");
//        Assert.assertEquals(mainPage.searchItem(),true);
//    }
//
//
//    @Test
//    @MethodOwner(owner = "sausedemo")
//    @TestLabel(name = "feature", value = {"web", "regression"})
//    public void pageTest(){
//        mainPage.open();
//        Assert.assertTrue(mainPage.isPageOpened(),"Page is not opened");
//        mainPage.pageItem();
//
//    }
//
//
//
//}
