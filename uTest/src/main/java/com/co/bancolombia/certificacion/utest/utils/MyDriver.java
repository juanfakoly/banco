package com.co.bancolombia.certificacion.utest.utils;

import net.thucydides.core.webdriver.SerenityWebdriverManager;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class MyDriver {

    public static WebDriver uTest(WebDriver driver) {
        driver.manage().window().maximize();
        driver.get("https://www.utest.com/");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        SerenityWebdriverManager.inThisTestThread().setCurrentActiveDriver(driver);

        return driver;
    }
}
