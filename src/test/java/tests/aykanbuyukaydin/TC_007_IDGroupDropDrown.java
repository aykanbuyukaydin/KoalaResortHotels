package tests.aykanbuyukaydin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.aykanbuyukaydin.HomePage;
import pages.aykanbuyukaydin.LoginPage;
import pages.aykanbuyukaydin.ManagerPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.aykanbuyukaydin.TestBaseRaporAykan;

public class TC_007_IDGroupDropDrown extends TestBaseRaporAykan {
    @Test
    public void test() {
        extentTest=extentReports.createTest("IDGroupDropDrown","IDGroupDropDrown dan Hotel Type1 in secildiginin gorulmesi");
        Driver.getDriver().get(ConfigReader.getProperty("kr_url"));
        extentTest.info("Koala Resort Hotels sayfasina gidildi");

        HomePage homePage = new HomePage();
        homePage.loginLinki.click();
        extentTest.info("login sayfasina gidildi");

        LoginPage loginPage = new LoginPage();
        loginPage.kullaniciAdiTextBox.sendKeys(ConfigReader.getProperty("kr_valid_username"));
        loginPage.passwordTexBox.sendKeys(ConfigReader.getProperty("kr_valid_password"));
        loginPage.loginButonu.click();
        extentTest.info("manager sayfasina gidildi");

        ManagerPage managerPage = new ManagerPage();
        managerPage.hotelManagementButonu.click();
        managerPage.hotelListButonu.click();
        managerPage.addHotelButonu.click();
        extentTest.info("add hotel butonuna basildi");

        WebElement idGroupDropDrown = managerPage.idGroupDropDown;
        Select select = new Select(idGroupDropDrown);
        select.selectByVisibleText(ConfigReader.getProperty("ch_idGroupDropDrown_data"));
        extentTest.info("Dropdrown dan Hotel Type1 secenegi secildi");

        String actual = select.getFirstSelectedOption().getText();
        String expected = ConfigReader.getProperty("ch_idGroupDropDrown_data");
        Assert.assertEquals(actual,expected);
        extentTest.pass("Dropdrown dan Hotel Type1 seceneginin secildigi test edildi");

        Driver.closeDriver();

    }

}
