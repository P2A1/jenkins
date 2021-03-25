package tests;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.browser.Browser;
import org.testng.annotations.Test;

public class Tests {

    @Test
    public void check() {
        Browser browser = AqualityServices.getBrowser();
        browser.maximize();
        browser.goTo("https://www.google.com/");
        browser.waitForPageToLoad();
        System.out.println(System.getProperty("string"));
        browser.quit();
    }
}
