package com.qaprosoft.carina.demo.mobTest;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.mobTest.base.LoginPageBase;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends LoginPageBase implements IMobileUtils {
    @FindBy(id = "cart_btn")
    private ExtendedWebElement me;

    @FindBy(xpath = "//android.widget.EditText[@text='Phone/Email/Username']")
    private ExtendedWebElement login;

    @FindBy(xpath = "//android.widget.EditText[@text='Password']")
    private ExtendedWebElement password;

    @FindBy(xpath = "//android.widget.TextView[@text='Log in']")
    private ExtendedWebElement loginBtn;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean findAndClickLoginPanelClickIfPresent() {
        return me.clickIfPresent();
    }

    @Override
    public void typeUsername(String username) {
        login.getElement().sendKeys(username);
    }

    @Override
    public void typePassword(String passwordT) {
        password.getElement().sendKeys(passwordT);
    }

    @Override
    public boolean logInClickIfPresent() {
        return loginBtn.isElementPresent();
    }
}
