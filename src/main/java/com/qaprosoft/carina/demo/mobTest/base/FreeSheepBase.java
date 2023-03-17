package com.qaprosoft.carina.demo.mobTest.base;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class FreeSheepBase extends AbstractPage {
    public FreeSheepBase(WebDriver driver) {
        super(driver);
    }

    public abstract boolean iconsCall();
    public abstract String getText(String productName);
    public abstract String getPrice();

}
