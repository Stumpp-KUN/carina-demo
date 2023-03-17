//package com.qaprosoft.carina.demo;
//
//import com.qaprosoft.carina.core.foundation.IAbstractTest;
//import com.qaprosoft.carina.demo.gui.chip.*;
//import com.qaprosoft.carina.demo.gui.chip.components.*;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.testng.Assert;
//import org.testng.annotations.BeforeSuite;
//import org.testng.annotations.Test;
//import org.testng.asserts.SoftAssert;
//
//import java.text.DecimalFormat;
//import java.text.NumberFormat;
//
//public class WebChipTest implements IAbstractTest {
//
//    private HomePage homePage;
//    private WebDriver driver;
//
//    @BeforeSuite
//    public void startDriver() {
//        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--remote-allow-origins=*");
//        driver = new ChromeDriver(options);
//        homePage = new HomePage(driver);
//    }
//
//    @Test()
//    public void testLogin() {
//        homePage.open();
//        Assert.assertTrue(homePage.isPageOpened(), "Page is not opened");
//        LoginPage loginPage = homePage.loginForm();
//
//        Assert.assertNotEquals(loginPage, null);
//        loginPage.getLoginForm();
//        Assert.assertTrue(loginPage.loginBtn(),"Login error");
//        Assert.assertEquals(loginPage.getTitle(),"Личный кабинет","Title error");
//        Assert.assertEquals(loginPage.getUrl(),"https://www.chipdip.by/account","Url error");
//        Assert.assertTrue(loginPage.logoutBtn(),"Logout error");
//    }
//
//    @Test()
//    public void testRegistr() {
//        homePage.open();
//        Assert.assertTrue(homePage.isPageOpened(), "Page is not opened");
//        RegisterPage registerPage = homePage.regForm();
//        Assert.assertNotEquals(registerPage, null);
//
//        UserForm user = registerPage.selectAccountType();
//        Assert.assertEquals(registerPage.getUrl(),"https://www.chipdip.by/account/myprofile","Url error");
//        Assert.assertEquals(registerPage.getTitle(),"Регистрация","Title error");
//        Assert.assertTrue(registerPage.privacyB(),"Privacy btn not clicked");
//        Assert.assertNotEquals(user, null);
//    }
//
//    @Test()
//    public void testItem() {
//        homePage.open();
//        Assert.assertTrue(homePage.isPageOpened(), "Page is not opened");
//        FastItemCheck fastItemCheck = homePage.buyForm();
//        Item item=new Item();
//        Assert.assertNotEquals(fastItemCheck, null);
//
//        SoftAssert softAssert = new SoftAssert();
//        softAssert.assertEquals(fastItemCheck.readPrice(), item.getCheckItem().getPrice1(), "Invalid price");
//        softAssert.assertEquals(fastItemCheck.readModel(), item.getCheckItem().getModel1(), "Invalid model");
//        softAssert.assertEquals(fastItemCheck.readManuf(), item.getCheckItem().getManuf1(), "Invalid manufacture");
//        softAssert.assertAll();
//    }
//
//    @Test()
//    public void testBucket() {
//        homePage.open();
//        Assert.assertTrue(homePage.isPageOpened(), "Page is not opened");
//        FastItemCheck fastItemCheck = homePage.buyForm();
//        Item item=new Item();
//        BucketPage bucketPage = fastItemCheck.testBuy();
//
//        SoftAssert softAssert = new SoftAssert();
//        softAssert.assertEquals(bucketPage.getPrice(), item.getCheckItem().getPrice1(), "Invalid price");
//        Assert.assertEquals(bucketPage.getTitle(),"Корзина","Bucket title error");
//        Assert.assertEquals(bucketPage.getUrl(),"https://www.chipdip.by/cart","Bucket url error");
//        softAssert.assertEquals(bucketPage.getCount(), 1, "Invalid count");
//        softAssert.assertAll();
//    }
//
//    @Test()
//    public void testVideo() {
//        homePage.open();
//        Assert.assertTrue(homePage.isPageOpened(), "Page is not opened");
//        VideoPage videoPage = homePage.videoForm();
//        SoftAssert softAssert = new SoftAssert();
//        softAssert.assertNotEquals(videoPage.countProducts(),-1);
//        softAssert.assertNotEquals(videoPage, null);
//        softAssert.assertAll();
//        videoPage.getProducts();
//    }
//
//    @Test()
//    public void testCalculator() {
//        homePage.open();
//        Assert.assertTrue(homePage.isPageOpened(), "Page is not opened");
//        Footer footer = homePage.getFooter();
//        CalculatorPage calculatorPage = footer.getCalc();
//        OmCalc omCalc = calculatorPage.omForm();
//        NumberFormat formatter = new DecimalFormat("#0.000");
//        Calculator calculator=new Calculator();
//
//        SoftAssert softAssert = new SoftAssert();
//        Assert.assertEquals(omCalc.getUrl(),"https://www.chipdip.by/calc/ohm-law","Calc url error");
//        Assert.assertEquals(omCalc.getTitle(),"Калькулятор Закона Ома для участка цепи","calc title error");
//        softAssert.assertEquals(omCalc.calcI(), calculator.calcI(), "Invalid value R|U");
//        softAssert.assertEquals(omCalc.calcR(), calculator.calcR(), "Invalid value U|I");
//        softAssert.assertEquals(omCalc.calcU(), calculator.calcU(), "Invalid value R*I");
//
//        softAssert.assertEquals(omCalc.calcUWithMaxValue(), calculator.calcU() * 1000, "Invalid value R|I");
//        softAssert.assertEquals(omCalc.calcRWithMaxValue(), calculator.calcR(), "Invalid value U|I");
//
//        softAssert.assertAll();
//    }
//
//    @Test()
//    public void testWork() {
//        homePage.open();
//        Assert.assertTrue(homePage.isPageOpened(), "Page is not opened");
//        Footer footer = homePage.getFooter();
//        VacancyPage vacancyPage = footer.getVacancy();
//
//        Assert.assertTrue(vacancyPage.findRegion(), "Error in region finder");
//        Assert.assertTrue(vacancyPage.findVacancy(), "Error in vacancy view");
//        Assert.assertEquals(vacancyPage.getTitle(),"Контактные данные","Error in vacancy title");
//        Assert.assertEquals(vacancyPage.getUrlResume(),"https://www.chipdip.by/vacancy/respond/420","Error in resume url");
//    }
//
////    @Test()
////    public void testIcons() {
////        homePage.open();
////        Assert.assertTrue(homePage.isPageOpened(), "Page is not opened");
////        Icons icons = homePage.iconsForm();
////        Assert.assertNotEquals(icons.getSoc(),null);
////        icons.testSoc();
////    }
//
//    @Test()
//    public void testSearch() {
//        homePage.open();
//        Assert.assertTrue(homePage.isPageOpened(), "Page is not opened");
//        SearchPage searchPage = homePage.searchForm("Резистор");
//        searchPage.chooseItem();
//        SoftAssert softAssert = new SoftAssert();
//
//        softAssert.assertTrue(searchPage.chooseChip());
//        softAssert.assertTrue(searchPage.chooseExpensive());
//        softAssert.assertTrue(searchPage.chooseHit());
//        softAssert.assertTrue(searchPage.chooseRecommended());
//
//        softAssert.assertAll();
//    }
//
//
//}
