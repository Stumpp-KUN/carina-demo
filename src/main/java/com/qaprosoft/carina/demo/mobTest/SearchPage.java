package com.qaprosoft.carina.demo.mobTest;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.mobTest.base.SearchPageBase;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends SearchPageBase implements IMobileUtils {
    @FindBy(xpath = "//android.widget.TextView[@text='See All']")
    private ExtendedWebElement seeAll;

    @FindBy(xpath = ("//android.widget.TextView[@bounds='[37,1621][511,1695]']"))
    private ExtendedWebElement item;

    @FindBy(xpath = "//android.widget.TextView[@text='Latest']")
    private ExtendedWebElement latest;

    @FindBy(xpath = "//android.widget.TextView[@text='Top Sales']")
    private ExtendedWebElement topSales;

    @FindBy(xpath = "//android.widget.TextView[@text='Price']")
    private ExtendedWebElement price;

    @FindBy(xpath = "//android.widget.TextView[@text='Visit Shop ']")
    private ExtendedWebElement shop;

    public SearchPage(WebDriver driver) {
        super(driver);
    }


    @Override
    public boolean latestClickIfPresent() {
        return latest.clickIfPresent();
    }

    @Override
    public boolean topSalesClickIfPresent() {
        return topSales.clickIfPresent();
    }

    @Override
    public boolean priceClickIfPresent() {
        return price.clickIfPresent();
    }

    @Override
    public boolean seeShopClickIfPresent() {
        return shop.clickIfPresent();
    }

    @Override
    public String getItemName() {
        return item.getText();
    }


}
