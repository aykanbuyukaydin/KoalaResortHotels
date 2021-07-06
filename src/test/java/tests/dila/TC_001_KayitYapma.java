package tests.dila;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.dila.RegistrationPage;
import pages.aykanbuyukaydin.HomePage;
import pages.aykanbuyukaydin.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;

public class TC_001_KayitYapma {

    @Test
    public void test(){
        Driver.getDriver().get(ConfigReader.getProperty("homepage_url"));
        HomePage homePage=new HomePage();
        homePage.loginLinki.click();
        LoginPage loginPage=new LoginPage();
        loginPage.kayitButonu.click();
        RegistrationPage registrationPage=new RegistrationPage();
        registrationPage.username.sendKeys("yonetici");
        registrationPage.password.sendKeys("yonetici");
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






    }
}
