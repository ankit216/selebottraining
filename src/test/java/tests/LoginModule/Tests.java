package tests.LoginModule;


import config.SeleniumConfig.BrowserConfig;


public class Tests extends BrowserConfig {


    /* @Test*/
    public void login() {

        String currentFileName = "login";
        performAction.openURL();
        performAction.click(currentFileName, "login Button");
        performAction.sendKeys(currentFileName, "email");
        performAction.pause(3);
        performAction.sendKeys(currentFileName, "password");
        performAction.click(currentFileName, "login to VigoReport");

    }


    //@Test
    public void login2() {

        String currentFileName = "login";

        performAction.openURL();
        performAction.click(currentFileName, "login Button");
        performAction.sendKeys(currentFileName, "email");
        performAction.pause(3);
        performAction.sendKeys(currentFileName, "password");
        performAction.click(currentFileName, "login to VigoReport");
        performAction.waitForElement(currentFileName, "project Lable On HomePage");
        verify.elementIsDisplayed(currentFileName, "project Lable On HomePage");


    }


    // @Test
    public void suruserLogin() {


        performAction.openURL();
        performAction.sendKeys("SuruseLogin", "userName", "ankitp@jsbot.io");
        performAction.sendKeys("SuruseLogin", "password", "asdf1234");
        performAction.click("SuruseLogin", "LoginButton");


    }


}
