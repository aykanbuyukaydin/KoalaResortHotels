package tests.dila;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.aykanbuyukaydin.HomePage;
import pages.aykanbuyukaydin.LoginPage;
import pages.dila.RegistrationPage;
import utilities.ConfigReader;
import utilities.Driver;

public class TC_004_GecersizDatalar {
    @Test
    public void test() {
        Driver.getDriver().get(ConfigReader.getProperty("homepage_url"));
        HomePage homePage = new HomePage();
        homePage.loginLinki.click();
        LoginPage loginPage = new LoginPage();
        loginPage.kayitButonu.click();
        RegistrationPage registrationPage = new RegistrationPage();
        registrationPage.username.sendKeys("yonetici");
        registrationPage.password.sendKeys("127@!");
        registrationPage.email.sendKeys("abcdtedyj.co");
        registrationPage.fullName.sendKeys("edat eymen");
        registrationPage.phoneNo.sendKeys("5551234");
        registrationPage.ssn.sendKeys("023456789");
        registrationPage.drivingLicense.sendKeys("B");
        Select options = new Select(registrationPage.idCountry);
        options.selectByVisibleText("United States");
        Select dropDown = new Select(registrationPage.state);
        dropDown.selectByVisibleText("Colorado");
        registrationPage.address.sendKeys("x mah. X cad. No:24");
        registrationPage.workingSector.sendKeys("turizm");
        registrationPage.birthDate.sendKeys("5/17/1989");
        registrationPage.saveButonu.click();

        String expected_password="At least one uppercase character is required";
        String actual_password=registrationPage.password_error.getText();
        Assert.assertEquals(actual_password,expected_password);

        String expected_email="Please provide correct email address";
        String actual_email=registrationPage.email_error.getText();
        Assert.assertEquals(actual_email,expected_email);

        String expected_phoneNo="Please enter phone number";
        String actual_phoneNo=registrationPage.phoneNum_error.getText();
        Assert.assertEquals(actual_phoneNo,expected_phoneNo);




    }
}

