package com.qaprosoft.carina.demo.mobTest.base;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.mobTest.LoginPage;
import com.qaprosoft.carina.demo.mobTest.MainPage;
import org.openqa.selenium.WebDriver;

public abstract class WelcomPageBase extends AbstractPage {

    public WelcomPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract LoginPage clickStart();

    public abstract MainPage clickStartBtn();
}
