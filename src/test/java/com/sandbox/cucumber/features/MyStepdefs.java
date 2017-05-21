package com.sandbox.cucumber.features;

import com.sandbox.HomePage;
import com.sandbox.LogInPage;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import static com.sandbox.cucumber.WebDriverThreadLocalUtil.getWebDriverUtil;
import static com.sandbox.cucumber.WebDriverUtil.Browser.FF;
import static com.sandbox.cucumber.WebDriverUtil.closeBrowser;
import static com.sandbox.cucumber.WebDriverUtil.getDriver;
import static com.sandbox.cucumber.WebDriverUtil.Browser.CHR;
import static junit.framework.TestCase.assertTrue;

/**
 * Created by User on 5/9/2017.
 */
public class MyStepdefs {

    LogInPage loginPage;
    HomePage homePage;
    WebDriver driver;

    @Before public void setupDriver(){
        driver = getWebDriverUtil("Firefox").getDriver();
    }

    @Given("^User is on the Login page$")
    public void userIsOnTheLoginPage() throws Throwable {
        driver.get("https://www.linkedin.com/uas/login");
        loginPage = new LogInPage(driver);
        assertTrue(loginPage.isLoaded());
    }

    @When("^User enters a valid email address$")
    public void userEntersAValidEmailAddress() throws Throwable {
        loginPage.enterEmailAddress("xxxxxxxxx");
    }

    @And("^User enters a valid password$")
    public void userEntersAValidPassword() throws Throwable {
        loginPage.enterPassword("xxxxxxxx");
    }

    @And("^User clicks the Sign in Button$")
    public void userClicksTheLoginButton() throws Throwable {
        homePage = loginPage.clickSignInButton();
    }

    @Then("^User Home page is opened$")
    public void userHomePageIsOpened() throws Throwable {
        assertTrue(homePage.isLoaded());
    }

    @After public void cleanUp(){
        getWebDriverUtil("Chrome").removeDriver();
    }
}
