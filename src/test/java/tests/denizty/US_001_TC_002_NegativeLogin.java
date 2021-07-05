package tests.denizty;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.deniz.LoginPages;
import utilities.ConfigReader;
import utilities.Driver;

public class US_001_TC_002_NegativeLogin {

    @Test
    public void NegativeLogin(){

        Driver.getDriver().get(ConfigReader.getProperty("kr_url"));

        LoginPages loginPages = new LoginPages();
        loginPages.logInButonu.click();
        loginPages.UserNameText.sendKeys(ConfigReader.getProperty("kr_invalid_usernameTC_002"));
        loginPages.PasswordText.sendKeys(ConfigReader.getProperty("kr_invalid_passwordTC_002"));
        loginPages.btnSubmitButton.click();

       // (loginPages.negativeLoginMessage + "/" + loginPages.loggedInUser);

       // Assert.assertEquals(loginPages.negativeLoginMessage.getText() ,ConfigReader.getProperty("negativeLoginMessage"));

    }

}
