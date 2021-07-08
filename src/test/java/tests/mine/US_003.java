package tests.mine;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.mine.US_003pages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.mine.TestBaseRaporMine;

public class US_003 extends TestBaseRaporMine {
    /*
    1-kullanıcı verilen url deki sayfaya gider
2-sağ üstteki log in butonuna tıklar
3-açılan menude username text box a tıklar
4-username text box a data girer
5-password text box a tıklar
6-password text box a data girer
7-Log in butonuna tıklar
8-kullanıcı log in olduğunda sağ üstte manager yazısını görüntüler
9-sol tarafta bulunan Hotel Management butonuna tıklar
10-Hotel List, Hotel Rooms ve Room rezervations yazılarını görüntüler
     */

    US_003pages page=new US_003pages();
    @Test
    public void test01(){
        extentTest=extentReports.createTest("Hotel,room,reservation Testi","Hotel,room,reservation modullerinin goruntulenmesi");
        Driver.getDriver().get(ConfigReader.getProperty("kr_url"));
        extentTest.info("Koala resort hotels sayfasina gidildi");

        page.logInButonu.click();
        extentTest.info("log in butonu tiklandi");

        page.nameTextBox.sendKeys(ConfigReader.getProperty("kr_valid_username"));
        extentTest.info("Gecerli kullanici adi girildi");

        page.passwordTextBox.sendKeys(ConfigReader.getProperty("kr_valid_password"));
        extentTest.info("Gecerli sifre giridi");

        page.secondLogIn.click();
        extentTest.info("Log in butonuna tiklandi");

        Assert.assertTrue(page.managerButonu.isDisplayed());
        extentTest.info("manager butonu goruntulendi");

        page.hotelManagement.click();
        extentTest.info("Hotel management butonuna tiklandi");

        Assert.assertTrue(page.hotelList.isDisplayed());
        extentTest.info("Hotel list butonu goruntulendi");

        Assert.assertTrue(page.hotelRooms.isDisplayed());
        extentTest.info("Hotel rooms butonu goruntulendi");

        Assert.assertTrue(page.roomReservations.isDisplayed());
        extentTest.pass("Room rezervations butonu goruntulendi");
    }

















    }










