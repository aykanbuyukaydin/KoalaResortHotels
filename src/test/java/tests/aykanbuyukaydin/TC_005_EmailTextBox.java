package tests.aykanbuyukaydin;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.aykanbuyukaydin.HomePage;
import pages.aykanbuyukaydin.LoginPage;
import pages.aykanbuyukaydin.ManagerPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.aykanbuyukaydin.TestBaseRaporAykan;


public class TC_005_EmailTextBox extends TestBaseRaporAykan {
    @Test
    public void test() {
        extentTest=extentReports.createTest("EmailTextBox","EmailTextBox nin ulasilabilir oldugunun gorulmesi");
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

        managerPage.emailTextBox.sendKeys(ConfigReader.getProperty("ch_email_data"));
        //icine data girmeye gerek yoktu bu text boxa erisilebiliyor mu diye ama testcase de data girin demis o yuzden yazdim
        extentTest.info("icine data girmeye gerek yoktu bu text boxa erisilebiliyor mu? diye ama testcase de data girin demis o yuzden yazdim");

        Assert.assertTrue(managerPage.emailTextBox.isEnabled());
        extentTest.pass("EmailTextBox nin ulasilabilir oldugu test edildi");

        Driver.closeDriver();
    }

}
