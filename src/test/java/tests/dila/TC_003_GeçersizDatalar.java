package tests.dila;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.aykanbuyukaydin.HomePage;
import pages.aykanbuyukaydin.LoginPage;
import pages.dila.RegistrationPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.dila.TestBaseRaporDila;

public class TC_003_GeçersizDatalar extends TestBaseRaporDila {
    @Test
    public void test() {
        extentTest=extentReports.createTest("Gecersiz ","Gecersiz Datalara goruldu");
        Driver.getDriver().get(ConfigReader.getProperty("kr_url"));
        Driver.getDriver().get(ConfigReader.getProperty("homepage_url"));
        HomePage homePage = new HomePage();
        homePage.loginLinki.click();
        LoginPage loginPage = new LoginPage();
        loginPage.kayitButonu.click();
        RegistrationPage registrationPage = new RegistrationPage();
        registrationPage.username.sendKeys("yonetici124");
        registrationPage.password.sendKeys("Yonetici127");
        registrationPage.email.sendKeys("abc@gmail.com");
        registrationPage.fullName.sendKeys("edat eymen");
        registrationPage.phoneNo.sendKeys("5555555555");
        registrationPage.ssn.sendKeys("123456789");
        registrationPage.drivingLicense.sendKeys("B");
        Select options = new Select(registrationPage.idCountry);
//        options.selectByVisibleText("");
        Select dropDown = new Select(registrationPage.state);
//        dropDown.selectByVisibleText("");
        registrationPage.address.sendKeys("x mah. X cad. No:24");
        registrationPage.workingSector.sendKeys("turizm");
        registrationPage.birthDate.sendKeys("");
        registrationPage.saveButonu.click();

        String expected_password="At least one special character is required";
        String actual_password=registrationPage.password_error.getText();
        Assert.assertEquals(actual_password,expected_password);

        String expected_idCountry="Select Country";
        String actual_idCountry=registrationPage.idCountry_error.getText();
        Assert.assertEquals(actual_idCountry,expected_idCountry);

        String expected_birthDate="This field is required.";
        String actual_birthDate=registrationPage.birthDate_error.getText();
        Assert.assertEquals(actual_birthDate,expected_birthDate);


        extentTest.pass("gecersiz datalarla kayit yapilamadi");




    }
}