package com.sandbox;

import org.openqa.selenium.WebDriver;

/**
 * Created by User on 5/4/2017.
 */
public class MePage extends PageObject {

    public MePage(WebDriver driver){
        super(driver);
    }

    public NavigationBar getNavigationBar(){
        return new NavigationBar(driver);
    }
}
