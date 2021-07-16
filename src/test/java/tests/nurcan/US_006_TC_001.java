package tests.nurcan;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.ui.Select;
import pages.aykanbuyukaydin.LoginPage;
import pages.aykanbuyukaydin.ManagerPage;
import pages.denizty.LoginPages;
import pages.nurcan.US_006Pages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_006_TC_001 {


    @Test
    public void test() throws InterruptedException {

        Driver.getDriver().get(ConfigReader.getProperty("kr_url"));
       // https://qa-environment.koalaresorthotels.com/admin/HotelRoomAdmin
        LoginPages lgnpages6=new LoginPages();
        lgnpages6.logInButonu.click();

lgnpages6.UserNameText.sendKeys(ConfigReader.getProperty("kr_valid_username"));
lgnpages6.PasswordText.sendKeys(ConfigReader.getProperty("kr_valid_password"));
lgnpages6.btnSubmitButton.click();
        ManagerPage managerPage6 = new ManagerPage();
        managerPage6.hotelManagementButonu.click();


       US_006Pages uS_006Pages=new US_006Pages();
      uS_006Pages.HotelRoomsMenu.click();
       uS_006Pages.OtelRoomOlusturmaButonu.click();

        Select IdDropdown=new Select(uS_006Pages.IdOtelText);
        IdDropdown.selectByVisibleText("Mustafa");
       uS_006Pages.CodeText.sendKeys("123");
       uS_006Pages.NameText.sendKeys("Suit");
       uS_006Pages.LocationText.sendKeys("2. kat");
      // uS_006Pages.DescriptionText.sendKeys();
       uS_006Pages.Pricetext.sendKeys("500");

       Select RoomType=new Select(uS_006Pages.RoomTypeText);
       RoomType.selectByVisibleText("Single");

     //  uS_006Pages.MaxAdultCountText.sendKeys("2");
     //  uS_006Pages.MaxChildCountText.sendKeys("3");
     //  uS_006Pages.ApprovedText.isSelected();
      // uS_006Pages.SaveText.click();

        uS_006Pages.MaxAdultCountText.sendKeys("2");
        uS_006Pages.MaxChildCountText.sendKeys("3");
        Assert.assertEquals(uS_006Pages.ApprovedText.isSelected(),false);
        uS_006Pages.DescriptionText.sendKeys("Deneme description");
        uS_006Pages.SaveText.click();
        ReusableMethods.switchToWindow("https://qa-environment.koalaresorthotels.com/admin/HotelroomAdmin/Create");
        Thread.sleep(1000);


       uS_006Pages.kayitmesaji.click();
       uS_006Pages.okeyButonu.click();





/*
        code=123
        name=Suit
        2. kat

                price=500

 */


      // Driver.closeDriver();




    }

}
