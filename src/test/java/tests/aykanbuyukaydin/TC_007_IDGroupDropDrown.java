package tests.aykanbuyukaydin;

import org.testng.annotations.Test;
import pages.aykanbuyukaydin.HomePage;
import pages.aykanbuyukaydin.LoginPage;
import pages.aykanbuyukaydin.ManagerPage;
import utilities.ConfigReader;
import utilities.Driver;

public class TC_007_IDGroupDropDrown {
    @Test
    public void test() {
        Driver.getDriver().get(ConfigReader.getProperty("kr_url"));

        HomePage homePage = new HomePage();
        homePage.loginLinki.click();

        LoginPage loginPage = new LoginPage();
        loginPage.kullaniciAdiTextBox.sendKeys(ConfigReader.getProperty("kr_valid_username"));
        loginPage.passwordTexBox.sendKeys(ConfigReader.getProperty("kr_valid_password"));
        loginPage.loginButonu.click();

        ManagerPage managerPage = new ManagerPage();
        managerPage.hotelManagementButonu.click();
        managerPage.hotelListButonu.click();
        managerPage.addHotelButonu.click();

    }

    /*
    WebElement acilirListe = driver.findElement(By.id("pc_currency"));
        Select select = new Select(acilirListe);
        select.selectByVisibleText("Eurozone (euro)");
     */
}