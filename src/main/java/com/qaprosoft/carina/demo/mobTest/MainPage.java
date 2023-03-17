package com.qaprosoft.carina.demo.mobTest;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.mobTest.base.MainPageBase;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class MainPage extends MainPageBase implements IMobileUtils {
    @FindBy(xpath = "//android.widget.TextView[@text='Free Shipping']")
    private ExtendedWebElement shipping;

    @FindBy(id = "com.shopee.ph:id/text_search")
    private ExtendedWebElement search;

    @FindBy(xpath = "//android.widget.TextView[@index='1']")
    private ExtendedWebElement res;

    @FindBy(xpath = "//android.widget.ImageView[@bounds='[339,2145][470,2260]']")
    private ExtendedWebElement live;


    public MainPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public FreeSheepPage sheepPage() {
        Assert.assertTrue(shipping.clickIfPresent(),"Shipping btn error");
        return new FreeSheepPage(driver);
    }

    @Override
    public SeeMorePage recPage() {
        return new SeeMorePage(driver);
    }

    @Override
    public SearchPage searchPage() {
        Assert.assertTrue(search.clickIfPresent());
        pause(5);
        writeSearch();
        return new SearchPage(driver);
    }

    @Override
    public void writeSearch() {
        driver.findElements(By.className("android.widget.TextView")).get(5).click();
    }

    @Override
    public LivePage livePage() {
        Assert.assertTrue(live.clickIfPresent());
        return new LivePage(driver);
    }

}
