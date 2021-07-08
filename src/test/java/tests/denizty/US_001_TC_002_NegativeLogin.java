package tests.denizty;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.denizty.LoginPages;
import utilities.ConfigReader;
import utilities.Driver;

import java.sql.SQLOutput;

public class US_001_TC_002_NegativeLogin {

    @Test
    public void NegativeLogin(){

        Driver.getDriver().get(ConfigReader.getProperty("kr_url"));

        LoginPages loginPages = new LoginPages();
        loginPages.logInButonu.click();
        loginPages.UserNameText.sendKeys(ConfigReader.getProperty("kr_invalid_usernameTC_002"));
        loginPages.PasswordText.sendKeys(ConfigReader.getProperty("kr_invalid_passwordTC_002"));
        loginPages.btnSubmitButton.click();

      System.out.println( loginPages.negativeLoginMessage.getText());
      System.out.println(ConfigReader.getProperty("negativeLoginMessage").substring(0,16));
      Assert.assertEquals(loginPages.negativeLoginMessage.getText().substring(0,16) ,ConfigReader.getProperty("negativeLoginMessage").substring(0,16));
      Driver.closeDriver();

    }

}
