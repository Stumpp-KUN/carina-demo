package com.qaprosoft.carina.demo.mobTest.base;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class LivePageBase extends AbstractPage {
    public LivePageBase(WebDriver driver) {
        super(driver);
    }
    public abstract boolean replayBtnClickIfPresent();
    public abstract boolean lastReplay();
}
