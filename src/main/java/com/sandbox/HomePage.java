package com.sandbox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by User on 5/4/2017.
 */
public class HomePage extends PageObject {

    @FindBy(id="feed-tab-icon")
    WebElement home;

    public HomePage (WebDriver driver){
        super(driver);
    }


    public boolean isLoaded() {
        new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOf(home));
        return home.isDisplayed();
    }

}
