package com.qaprosoft.carina.demo.mobTest.base;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class SearchPageBase extends AbstractPage {
    public SearchPageBase(WebDriver driver) {
        super(driver);
    }
    public abstract boolean latestClickIfPresent();
    public abstract boolean topSalesClickIfPresent();
    public abstract boolean priceClickIfPresent();
    public abstract boolean seeShopClickIfPresent();
    public abstract String getItemName();
}
