package com.sandbox.cucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.logging.Level;

/**
 * Created by User on 5/9/2017.
 */
public class WebDriverUtil {

    private static WebDriver driver = null;

    public enum Browser{FF,CHR}

    protected WebDriverUtil(){

    }


    public static WebDriver getDriver(Browser browser){
        if (driver == null) {
            switch (browser) {
                case CHR:
                    System.setProperty("webdriver.chrome.driver", "C:/drivers/chromedriver//chromedriver.exe");
                    driver = new ChromeDriver();
                    break;
                case FF:
                    DesiredCapabilities capabilities = DesiredCapabilities.firefox();
                    System.setProperty("webdriver.gecko.driver", "C:/drivers/geckodriver/geckodriver.exe");
                    driver = new FirefoxDriver(capabilities);
            }
        }
        return driver;
    }

    public static void closeBrowser(){
        driver.quit();
    }
}
