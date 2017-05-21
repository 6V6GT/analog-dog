package com.sandbox.cucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by User on 5/10/2017.
 */
public class WebDriverThreadLocalUtil {

    private static WebDriverThreadLocalUtil utilInstance = null;

    private String browser;

    private WebDriverThreadLocalUtil(){}

    private WebDriverThreadLocalUtil(String type){
        this.browser = type;
    }

    public static WebDriverThreadLocalUtil getWebDriverUtil(String browser){
       if(utilInstance == null){
           utilInstance = new WebDriverThreadLocalUtil(browser);
       }
       return utilInstance;
    }

    ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>(){

        @Override
        protected WebDriver initialValue(){
            WebDriver selectedDriver = null;
            switch (browser) {
                case "Chrome":
                    System.setProperty("webdriver.chrome.driver", "C:/drivers/chromedriver//chromedriver.exe");
                    selectedDriver = new ChromeDriver();
                    break;
                case "Firefox":
                    System.setProperty("webdriver.gecko.driver", "C:/drivers/geckodriver/geckodriver.exe");
                    selectedDriver = new FirefoxDriver();
                    break;
                default:
                    System.setProperty("webdriver.gecko.driver", "C:/drivers/geckodriver/geckodriver.exe");
                    selectedDriver = new FirefoxDriver();
            }
            return selectedDriver;
        }
    };

    public WebDriver getDriver(){
        return driver.get();
    }

    public void removeDriver(){
        driver.get().quit();
        driver.remove();
    }
}
