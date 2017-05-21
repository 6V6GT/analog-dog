package com.sandbox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by User on 5/4/2017.
 */
public class LogInPage extends PageObject {
    @FindBy(id="session_key-login")
    private WebElement emailAddress;

    @FindBy(id="session_password-login")
    private WebElement passwd;

    @FindBy(id="btn-primary")
    private WebElement signIn;

    public LogInPage(WebDriver driver){
        super(driver);
    }


    public boolean isLoaded() {
        new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOf(emailAddress));
        return emailAddress.isDisplayed();
    }

    public void enterEmailAddress(String eaddress){
        this.emailAddress.clear();
        this.emailAddress.sendKeys(eaddress);
    }

    public void enterPassword(String pass){
        this.passwd.clear();
        this.passwd.sendKeys(pass);
    }

    public HomePage clickSignInButton(){
        new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(signIn));
        this.signIn.click();
        return new HomePage(driver);
    }

    public NavigationBar getNavigationBar(){
        return new NavigationBar(driver);
    }
}
