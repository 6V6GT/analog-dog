package com.sandbox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by User on 5/4/2017.
 */
public class NavigationBar extends PageObject {

    @FindBy(id="feed-tab-icon")
    WebElement home;

    @FindBy(id="mynetwork-nav-item")
    WebElement myNetwork;

    @FindBy(id="jobs-nav-item")
    WebElement jobs;

    @FindBy(id="messaging-nav-item")
    WebElement messaging;

    @FindBy(id="notifications-nav-item")
    WebElement notifications;

    @FindBy(id="nav-settings_dropdown-trigger")
    WebElement me;

    public NavigationBar(WebDriver driver){
        super(driver);
    }

    public HomePage clickHomeIcon(){
        this.home.click();
        return new HomePage(driver);
    }

    public MyNetworkPage clickMyNetworkIcon(){
        this.myNetwork.click();
        return new MyNetworkPage(driver);
    }

    public JobsPage clickJobsIcon(){
        this.jobs.click();
        return new JobsPage(driver);
    }

    public MessagingPage clickMessagingIcon(){
        this.messaging.click();
        return new MessagingPage(driver);
    }

    public NotificationsPage clickNotificationsIcon(){
        this.notifications.click();
        return new NotificationsPage(driver);
    }

    public MePage clickMeIcon(){
        this.me.click();
        return new MePage(driver);
    }
}
