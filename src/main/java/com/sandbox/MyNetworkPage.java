package com.sandbox;

import org.openqa.selenium.WebDriver;

/**
 * Created by User on 5/4/2017.
 */
public class MyNetworkPage extends PageObject{

    public MyNetworkPage(WebDriver driver){
        super(driver);
    }

    public NavigationBar getNavigationBar(){
        return new NavigationBar(driver);
    }

}
