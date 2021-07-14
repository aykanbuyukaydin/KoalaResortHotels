package tests.aykanbuyukaydin;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.aykanbuyukaydin.HomePage;
import pages.aykanbuyukaydin.LoginPage;
import pages.aykanbuyukaydin.ManagerPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.aykanbuyukaydin.TestBaseRaporAykan;


public class TC_008_SaveButonu extends TestBaseRaporAykan {
    @Test
    public void test() throws InterruptedException {
        extentTest=extentReports.createTest("SaveButonu","Save Butonuna basildiginin gorulmesi");
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

        Actions actions = new Actions(Driver.getDriver());
        actions.
                click(managerPage.codeTextBox).
                sendKeys(ConfigReader.getProperty("ch_code_data")).
                sendKeys(Keys.TAB).
                sendKeys(ConfigReader.getProperty("ch_name_data")).
                sendKeys(Keys.TAB).
                sendKeys(ConfigReader.getProperty("ch_address_data")).
                sendKeys(Keys.TAB).
                sendKeys(ConfigReader.getProperty("ch_email_data")).
                sendKeys(Keys.TAB).
                sendKeys(ConfigReader.getProperty("ch_phone_data")).
                sendKeys(Keys.TAB).
                sendKeys(Keys.ENTER).
                sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ENTER).
                perform();
        extentTest.info("textbox lara gerekli datalar girildi");

        managerPage.saveButonu.click();
        //Driver.getDriver().switchTo().alert().accept(); (yazi alert degil o yuzden buna gerek yok)
        extentTest.info("save butonuna basildi");

        //Thread.sleep(2000); (tercih edilmeyen bir yontem)
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),30);
        wait.until(ExpectedConditions.visibilityOf(managerPage.successfullyMesaji));
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='bootbox-body']"))); (direk xpath dan yapmak istersek)
        extentTest.info("asert edebilmek icin gerekli sure verildi");

        System.out.println("yazi: " + managerPage.successfullyMesaji.getText());
        //yazi gormek istersek
        extentTest.info("successfullyMesaji yazisi yazdirildi");

        Assert.assertTrue(managerPage.successfullyMesaji.isDisplayed());
        extentTest.pass("save butonuna basildigi test edildi");

        Driver.closeDriver();
    }
}
