package com.qaprosoft.carina.demo.mobTest;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.mobTest.base.FreeSheepBase;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class FreeSheepPage extends FreeSheepBase implements IMobileUtils {
    private final Logger logger = LogManager.getRootLogger();
    @FindBy(xpath = "//android.widget.TextView[@text='%s']")
    private ExtendedWebElement name;

    @FindBy(xpath = "//android.widget.TextView[@text='₱199']")
    private ExtendedWebElement price;

    public FreeSheepPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean iconsCall() {
        return name.clickIfPresent();
    }

    @Override
    public String getText(String productName) {
        return name.format(productName).getText();
    }

    @Override
    public String getPrice() {
        return price.getText();
    }
}
