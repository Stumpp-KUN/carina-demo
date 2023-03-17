package com.qaprosoft.carina.demo.mobTest.base;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class LoginPageBase extends AbstractPage {
    public LoginPageBase(WebDriver driver) {
        super(driver);
    }
    public abstract boolean findAndClickLoginPanelClickIfPresent();
    public abstract void typeUsername(String username);
    public abstract void typePassword(String password);
    public abstract boolean logInClickIfPresent();
}
