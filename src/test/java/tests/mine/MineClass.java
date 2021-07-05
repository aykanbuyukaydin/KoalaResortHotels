package tests.mine;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.mine.US_003pages;
import utilities.ConfigReader;
import utilities.Driver;

public class MineClass {
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
        Driver.getDriver().get(ConfigReader.getProperty("kr_url"));

        page.logInButonu.click();

        page.nameTextBox.sendKeys(ConfigReader.getProperty("kr_valid_username"));

        page.passwordTextBox.sendKeys(ConfigReader.getProperty("kr_valid_password"));

        page.secondLogIn.click();

        Assert.assertTrue(page.managerButonu.isDisplayed());

        page.hotelManagement.click();

        Assert.assertTrue(page.hotelList.isDisplayed());

        Assert.assertTrue(page.hotelRooms.isDisplayed());

        Assert.assertTrue(page.hotelRooms.isDisplayed());
    }

















    }










