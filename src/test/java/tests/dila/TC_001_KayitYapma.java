package tests.dila;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.dila.RegistrationPage;
import pages.aykanbuyukaydin.HomePage;
import pages.aykanbuyukaydin.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.dila.TestBaseRaporDila;

public class TC_001_KayitYapma extends TestBaseRaporDila {

    @Test
    public void test(){
        extentTest=extentReports.createTest("KayitYapma","Basarili KayitYapma Yapildi");
        Driver.getDriver().get(ConfigReader.getProperty("kr_url"));
        Driver.getDriver().get(ConfigReader.getProperty("homepage_url"));
        HomePage homePage=new HomePage();
        homePage.loginLinki.click();
        LoginPage loginPage=new LoginPage();
        loginPage.kayitButonu.click();
        RegistrationPage registrationPage=new RegistrationPage();
        registrationPage.username.sendKeys("yonetici");
        registrationPage.password.sendKeys("Yyonetici4@");
        registrationPage.email.sendKeys("abc@gmail.com");
        registrationPage.fullName.sendKeys("edat eymen");
        registrationPage.phoneNo.sendKeys("5555555555");
        registrationPage.ssn.sendKeys("123456789");
        registrationPage.drivingLicense.sendKeys("B");
        Select options=new Select(registrationPage.idCountry);
        options.selectByVisibleText("United States");
        Select dropDown= new Select(registrationPage.state);
        dropDown.selectByVisibleText("California");
        registrationPage.address.sendKeys("x mah. X cad. No:24");
        registrationPage.workingSector.sendKeys("turizm");
        registrationPage.birthDate.sendKeys("5/17/1989");
        registrationPage.saveButonu.click();

        extentTest.pass("yeni bir hesap basarili bir sekide olusturuldu");

    }
}
