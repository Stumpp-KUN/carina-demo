package com.qaprosoft.carina.demo.mobTest.base;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class RecommendedBase   extends AbstractPage {
    public RecommendedBase(WebDriver driver) {
        super(driver);
    }

    public abstract boolean clickIfPresentSeeMore();
    public abstract boolean firstIcon();
    public abstract boolean secondIcon();
    public abstract boolean thirdIcon();
    public abstract boolean fourthIcon();
    public abstract boolean fifthIcon();
}
