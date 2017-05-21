package com.sandbox;

import org.openqa.selenium.WebDriver;

/**
 * Created by User on 5/4/2017.
 */
public class MessagingPage extends PageObject {

    public MessagingPage (WebDriver driver){
        super(driver);
    }

    public NavigationBar getNavigationBar(){
        return new NavigationBar(driver);
    }

}
