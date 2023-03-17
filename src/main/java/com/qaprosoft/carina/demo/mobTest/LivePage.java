package com.qaprosoft.carina.demo.mobTest;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.mobTest.base.LivePageBase;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class LivePage extends LivePageBase implements IMobileUtils {
    public LivePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean replayBtnClickIfPresent() {
        return replayBtn.clickIfPresent();
    }

    @Override
    public boolean lastReplay() {
        return replay.clickIfPresent();
    }

    @FindBy(xpath = "//android.view.View[@text='Replay']")
    private ExtendedWebElement replayBtn;

    @FindBy(xpath = "//android.widget.Image[@bounds='[0,540][624,1238]']")
    private ExtendedWebElement replay;






}
