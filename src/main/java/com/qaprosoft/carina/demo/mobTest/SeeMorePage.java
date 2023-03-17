package com.qaprosoft.carina.demo.mobTest;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.mobTest.base.RecommendedBase;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class SeeMorePage extends RecommendedBase implements IMobileUtils {
    @FindBy(xpath = "//android.widget.TextView[@text='See More']")
    private ExtendedWebElement element;

    @FindBy(xpath = "//android.widget.TextView[@text='Shopee Prizes']")
    private ExtendedWebElement prizes;

    @FindBy(xpath = "//android.widget.TextView[@text='Vouchers']")
    private ExtendedWebElement vouchers;

    @FindBy(xpath = "//android.widget.TextView[@text='Fashion Bazaar']")
    private ExtendedWebElement fashion;

    @FindBy(xpath = "//android.widget.TextView[@text='Shopee Mall']")
    private ExtendedWebElement mail;

    @FindBy(xpath = "//android.widget.TextView[@text='Finance']")
    private ExtendedWebElement finance;

    public SeeMorePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean clickIfPresentSeeMore() {
        return element.clickIfPresent();
    }

    @Override
    public boolean firstIcon() {
        return prizes.isElementPresent();
    }

    @Override
    public boolean secondIcon() {
        return vouchers.isElementPresent();
    }

    @Override
    public boolean thirdIcon() {
        return fashion.isElementPresent();
    }

    @Override
    public boolean fourthIcon() {
        return mail.isElementPresent();
    }

    @Override
    public boolean fifthIcon() {
        return finance.isElementPresent();
    }

}
