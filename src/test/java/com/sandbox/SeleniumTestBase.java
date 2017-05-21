package com.sandbox;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.concurrent.TimeUnit;

/**
 * Created by User on 5/4/2017.
 */
public class SeleniumTestBase {

    protected static WebDriver driver;

    @BeforeClass
    public static void setUp(){
         /*System.setProperty("webdriver.gecko.driver", "C:/drivers/geckodriver/geckodriver.exe");
         DesiredCapabilities dc = DesiredCapabilities.firefox();
         dc.setCapability("marionette", true);
         driver = new FirefoxDriver(dc);
          */

        System.setProperty("webdriver.chrome.driver", "C:/drivers/chromedriver//chromedriver.exe");
        driver = new ChromeDriver();

         /*System.setProperty("webdriver.ie.driver", "C:/drivers/iedriver/IEDriverServer.exe");
          driver = new InternetExplorerDriver();
          driver.manage().window().maximize();
          */
    }

    @After
    public void cleanUp(){
        driver.manage().deleteAllCookies();
    }

    @AfterClass
    public static void tearDown(){
        driver.quit();
    }

}

