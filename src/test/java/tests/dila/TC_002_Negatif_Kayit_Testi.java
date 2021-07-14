package tests.dila;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.dila.RegistrationPage;
import pages.aykanbuyukaydin.HomePage;
import pages.aykanbuyukaydin.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.dila.TestBaseRaporDila;

public class TC_002_Negatif_Kayit_Testi extends TestBaseRaporDila {
    @Test
    public void test() {
        extentTest=extentReports.createTest("Negatif","Basarili Negatif Kayit Testi Yapildi");
        Driver.getDriver().get(ConfigReader.getProperty("kr_url"));
        Driver.getDriver().get(ConfigReader.getProperty("homepage_url"));
        HomePage homePage = new HomePage();
        homePage.loginLinki.click();
        LoginPage loginPage = new LoginPage();
        loginPage.kayitButonu.click();
        RegistrationPage registrationPage = new RegistrationPage();
        registrationPage.username.sendKeys("");
        registrationPage.password.sendKeys("");
        registrationPage.email.sendKeys("");
        registrationPage.fullName.sendKeys("");
        registrationPage.phoneNo.sendKeys("");
        registrationPage.ssn.sendKeys("");
        registrationPage.drivingLicense.sendKeys("");
        Select options = new Select(registrationPage.idCountry);
//        options.selectByVisibleText("");
        Select dropDown = new Select(registrationPage.state);
//        dropDown.selectByVisibleText("");
        registrationPage.address.sendKeys("");
        registrationPage.workingSector.sendKeys("");
        registrationPage.birthDate.sendKeys("");
        registrationPage.saveButonu.click();

        String expected_username="Please select a username";
        String actual_username=registrationPage.username_error.getText();
        Assert.assertEquals(actual_username,expected_username);

        String expected_password="Please select a Password";
        String actual_password=registrationPage.password_error.getText();
        Assert.assertEquals(actual_password,expected_password);

        String expected_email="Please enter an email address";
        String actual_email=registrationPage.email_error.getText();
        Assert.assertEquals(actual_email,expected_email);

        String expected_fullName="This field is required.";
        String actual_fullName=registrationPage.fullName_error.getText();
        Assert.assertEquals(actual_fullName,expected_fullName);

        String expected_phoneNo="Please enter phone number";
        String actual_phoneNom=registrationPage.phoneNum_error.getText();
        Assert.assertEquals(expected_phoneNo,actual_phoneNom);

        String expected_ssn="This field is required.";
        String actual_ssn=registrationPage.ssn_error.getText();
        Assert.assertEquals(actual_ssn,expected_ssn);

        String expected_drivingLicense="This field is required.";
        String actual_drivingLicense=registrationPage.driving_error.getText();
        Assert.assertEquals(actual_drivingLicense,expected_drivingLicense);

        String expected_idCountry="Select Country";
        String actual_idCountry=registrationPage.idCountry_error.getText();
        Assert.assertEquals(actual_idCountry,expected_idCountry);

        String expected_address="This field is required.";
        String actual_address=registrationPage.address_error.getText();
        Assert.assertEquals(actual_address,expected_address);

        String expected_workingSector="This field is required.";
        String actual_workingSector=registrationPage.WorkingSector_error.getText();
        Assert.assertEquals(actual_workingSector,expected_workingSector);

        String expected_birtData="This field is required.";
        String actual_birthData=registrationPage.birthDate_error.getText();
        Assert.assertEquals(actual_birthData,expected_birtData);


        extentTest.pass("gecersiz datalarla kayit yapilamadi");



    }
}