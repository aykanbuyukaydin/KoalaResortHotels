package tests.denizty;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.denizty.LoginPages;
import utilities.ConfigReader;
import utilities.Driver;

public class US_001_TC_003_NegativeLogin {

    @Test
    public void NegativeLogin003(){

        Driver.getDriver().get(ConfigReader.getProperty("kr_url"));

        LoginPages loginPages = new LoginPages();
        loginPages.logInButonu.click();
        loginPages.UserNameText.sendKeys(ConfigReader.getProperty("kr_invalid_usernameTC_003"));
        loginPages.PasswordText.sendKeys(ConfigReader.getProperty("kr_invalid_passwordTC_003"));
        loginPage
    s.btnSubmitButton.click();

        System.out.println( loginPages.negativeLoginMessage.getText());
        System.out.println(ConfigReader.getProperty("negativeLoginMessage").substring(0,16));
        Assert.assertEquals(loginPages.negativeLoginMessage.getText().substring(0,16) ,ConfigReader.getProperty("negativeLoginMessage").substring(0,16));
        Driver.closeDriver();

    }
}
