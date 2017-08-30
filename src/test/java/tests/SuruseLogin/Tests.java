package tests.SuruseLogin;


import config.SeleniumConfig.BrowserConfig;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Tests extends BrowserConfig {
    @BeforeTest
    public void login() {

        performAction.openURL();
        performAction.pause(5);
        performAction.sendKeys("SuruseLogin", "userName");
        performAction.sendKeys("SuruseLogin", "password");
        performAction.click("SuruseLogin", "logIn");
        performAction.pause(5);
    }

    @Test
    public void createStream() {
        performAction.pause(5);
        performAction.click("SuruseLoging", "createStream");

    }


}
