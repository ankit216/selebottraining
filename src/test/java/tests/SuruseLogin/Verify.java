package tests.SuruseLogin;

import config.General.Methods;
import config.SeleniumConfig.AbstractPage;
import junit.framework.Assert;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Verify extends AbstractPage {

    /**
     * Initialize UserAbstractPage.
     *
     * @param driver .
     */
    public Verify(WebDriver driver) {
        super(driver);
    }

    public void verifyErrorMessage(String file, String elementName, String message) {
       /* WebElement errorMessage = driver.findElement(By.xpath("//*[contains(text(),'login failed')]"));*/
        Methods method = new Methods(driver);

        WebElement element = method.findElement(file, elementName);
        Assert.assertTrue(element.isDisplayed());
        Assert.assertTrue(element.getText().equals(message));

    }


    public void verifyLoginNotFoundMessage() {

        Methods method = new Methods(driver);

        WebElement element = method.findElement("", "");
        Assert.assertTrue(element.isDisplayed());
        Assert.assertTrue(element.getText().equals(""));

    }


    public void rendomStream(int streamLength, int noteLength) {
        String streamName = RandomStringUtils.randomAlphanumeric(streamLength);
        String streamNote = RandomStringUtils.randomAlphanumeric(noteLength);


    }

}
