package com.sandbox;

import org.junit.*;

import static junit.framework.TestCase.assertTrue;

/**
 * Created by User on 5/4/2017.
 */
public class LogInPageTest extends SeleniumTestBase {

    @Test
    public void testLogin() throws InterruptedException{
        driver.get("https://www.linkedin.com/uas/login");
        LogInPage loginPage = new LogInPage(driver);
        assertTrue(loginPage.isLoaded());

        loginPage.enterEmailAddress("xxxxxxxxxx");
        loginPage.enterPassword("xxxxxxxx");
        HomePage home = loginPage.clickSignInButton();
        assertTrue(home.isLoaded());
    }
}
