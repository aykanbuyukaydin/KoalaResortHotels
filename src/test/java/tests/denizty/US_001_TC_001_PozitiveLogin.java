package tests.denizty;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.denizty.LoginPages;
import utilities.ConfigReader;
import utilities.Driver;

public class US_001_TC_001_PozitiveLogin {

    @Test
    public void Login(){

        Driver.getDriver().get(ConfigReader.getProperty("kr_url"));

        LoginPages loginPages = new LoginPages();
        loginPages.logInButonu.click();
        loginPages.UserNameText.sendKeys(ConfigReader.getProperty("kr_valid_username"));
        loginPages.PasswordText.sendKeys(ConfigReader.getProperty("kr_valid_password"));
        loginPages.btnSubmitButton.click();

        Assert.assertEquals(loginPages.loggedInUser.getText() ,ConfigReader.getProperty("kr_valid_username"));
        Driver.closeDriver();
    }

}
