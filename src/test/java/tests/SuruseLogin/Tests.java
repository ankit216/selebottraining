package tests.SuruseLogin;


import config.SeleniumConfig.BrowserConfig;
import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;

public class Tests extends BrowserConfig {
    //@Test
    public void verifyLoginSuccessfully() {

        performAction.openURL();
        performAction.pause(2);
        performAction.sendKeys("SuruseLogin", "userName");
        performAction.sendKeys("SuruseLogin", "password");
        performAction.pause(2);
        performAction.click("SuruseLogin", "logIn");

    }


    //@Test
    public void verifyLoginWithUnregisteredUser() {

        performAction.openURL();
        performAction.pause(2);
        performAction.sendKeys("SuruseLogin", "userName", "Ankit@jsbot.io");
        performAction.sendKeys("SuruseLogin", "password");
        performAction.pause(2);
        performAction.click("SuruseLogin", "logIn");
        performAction.pause(2);
        Verify verify = new Verify(driver);
        verify.verifyErrorMessage("SuruseLogin", "errorMessage", "login failed : not_found");

    }

    //@Test
    public void verifyLoginWithBlankUserName() {

        performAction.openURL();
        performAction.pause(5);
        performAction.sendKeys("SuruseLogin", "userName", "");
        performAction.sendKeys("SuruseLogin", "password", "test123");
        performAction.pause(2);
        performAction.click("SuruseLogin", "logIn");
        Verify verify = new Verify(driver);
        verify.verifyErrorMessage("SuruseLogin", "errorMessage", "We couldn't find an account matching the username and password you entered");
    }

    //@Test //verifyLoginWithBlankPassword
    public void verifyLoginWithBlankPassword() {

        performAction.openURL();
        performAction.pause(5);
        performAction.sendKeys("SuruseLogin", "userName", "Ankit@jsbot.io");
        performAction.sendKeys("SuruseLogin", "password", "");
        performAction.pause(2);
        performAction.click("SuruseLogin", "logIn");
        Verify verify = new Verify(driver);
        verify.verifyErrorMessage("SuruseLogin", "errorMessage", "We couldn't find an account matching the username and password you entered");
    }

    @Test
    public void createStream() {

        verifyLoginSuccessfully();
        int streamLength = 4;
        int noteLength = 4;
        String streamName1 = RandomStringUtils.randomAlphanumeric(streamLength);
        String notesName1 = RandomStringUtils.randomAlphanumeric(noteLength);

        performAction.pause(2);
        performAction.click("SuruseLogin", "createStream");
        performAction.pause(2);

        performAction.sendKeys("SuruseLogin", "streamName", streamName1);
        performAction.pause(2);
        performAction.sendKeys("SuruseLogin", "notesName", notesName1);
        performAction.click("SuruseLogin", "privateClick");
        performAction.pause(1);
        performAction.click("SuruseLogin", "staticClick");
        performAction.pause(1);
        performAction.click("SuruseLogin", "addClick");


    }

    @Test
    public void verifyCreateStreamWithOneAlfabate() {


    }
}