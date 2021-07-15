package tests.rumeysaUS_006;

import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import pages.rumeysa.HotelRoomDeletePages;
import utilities.Driver;

import java.util.Set;

public class TestCase02HotelRoomDelete {

/*
    Menuden System Management'a tiklanir
    Acilan listeden Hotel Management linkine tiklanir
    Hotel Rooms sekmesine tiklanir
    List Of Hotelrooms sayfasi goruntulenir.
    Silinmek istenen odanın "Actions" sutunundan "Details" butonu tıklanır.
    "Edit Hotelroom" sayfası goruntulenir.
    "Delete" butonu tıklanır.
    "Would you like to continue?" uyarı mesajı goruntulenir.
    "OK" butonu tıklanır.
    "Hotelroom successfully delete" uyarı mesajı goruntulenir.

*/

    @Test
    public void test02() throws InterruptedException {

        HotelRoomDeletePages hotelRoomDeletePages=new HotelRoomDeletePages();
        hotelRoomDeletePages.LoginTesti();

        String ilkSayfaHandleDegeri= Driver.getDriver().getWindowHandle();

        hotelRoomDeletePages.HotelManagement.click();
        hotelRoomDeletePages.RoomList.click();

        WebElement selectElement= hotelRoomDeletePages.View1;
        Select options=new Select(hotelRoomDeletePages.View1);
        options.selectByIndex(5);

        Thread.sleep(2000);
         Actions actions=new Actions(Driver.getDriver());
         actions.sendKeys(Keys.PAGE_DOWN).perform();
        hotelRoomDeletePages.allDetailsList.get(1).click();

        System.out.println(hotelRoomDeletePages.allDetailsList.size());
        Set<String> handleListesi = Driver.getDriver().getWindowHandles();

        String ikinciSayfaHandleDegeri="";

        for (String each: handleListesi
        ) {
            if (!each.equals(ilkSayfaHandleDegeri)){
                ikinciSayfaHandleDegeri=each;
            }
        }

        Driver.getDriver().switchTo().window(ikinciSayfaHandleDegeri);

       // Actions actions=new Actions(Driver.getDriver());

        hotelRoomDeletePages.DELETEButonu.click();
      //  Assert.assertTrue(hotelRoomDeletePages.DeleteUyarıMesajı.isDisplayed());


        hotelRoomDeletePages.OKButonu.click();


    }

    
}
