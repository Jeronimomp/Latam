package com.prueba.tecnica.latan.utils;

import net.serenitybdd.screenplay.Actor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class HisDriver {


    public static WebDriver chromeDriver(){
        String exePath="C:\\chromedriver.exe";
      System.setProperty("webdriver.chrome.driver", exePath);

        WebDriver driver;
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver=new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        return driver;

    }
}
