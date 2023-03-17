package com.qaprosoft.carina.demo.mobTest;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.mobTest.base.WelcomPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class WelcomePage extends WelcomPageBase {
    @FindBy(id = "btn")
    private ExtendedWebElement startBtn;

    public WelcomePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public LoginPage clickStart() {
        Assert.assertTrue(clickBtn(startBtn),"Start button click error");
        return new LoginPage(driver);
    }

    @Override
    public MainPage clickStartBtn() {
        Assert.assertTrue(clickBtn(startBtn),"Start button click error");
        return new MainPage(driver);
    }

    private boolean clickBtn(ExtendedWebElement e){
        return e.clickIfPresent();
    }

    @Override
    public boolean isPageOpened() {
        return startBtn.isElementPresent();
    }
}
