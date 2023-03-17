package com.qaprosoft.carina.demo.mobTest.base;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.mobTest.FreeSheepPage;
import com.qaprosoft.carina.demo.mobTest.LivePage;
import com.qaprosoft.carina.demo.mobTest.SeeMorePage;
import com.qaprosoft.carina.demo.mobTest.SearchPage;
import org.openqa.selenium.WebDriver;

public abstract class MainPageBase  extends AbstractPage {
    public MainPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract FreeSheepPage sheepPage();
    public abstract SeeMorePage recPage();
    public abstract SearchPage searchPage();
    public abstract void writeSearch();
    public abstract LivePage livePage();

}
