package tests.rumeysaUS_006;

import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.Select;
import pages.rumeysa.HotelListUpDatePages;
import pages.rumeysa.HotelRoomBilgisiDegistirmePages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.rumeysa.TestBaseRaporRumeysa;

import java.util.Set;

public class TestCase03RoomBilgisiDeğistirme  {

/*
    Menuden System Management'a tiklanir
    Acilan listeden Hotel Management linkine tiklanir
    List Of Hotelrooms sayfasi goruntulenir.
    Bilgileri update edilmek istenen room un "Actions" sutunundan "Details" butonu tıklanır.
            "Edit Hotelroom" sayfası goruntulenir.
    Room  kodu degistirilmek isteniyorsa room "Code" text alanina istenilen hotel kodu girilir
    Room ismi degistirilmek isteniyorsa room "Name" text alanina istenilen hotelroom ismi girilir
    Room acıklaması degistirilmek isteniyorsa "Description" alanina istenilen acıklalama yazılır.
    Room fiyat  degistirilmek isteniyorsa room "Price" text alanına drag drop ile sunulan aralıktan fiyat secilebilir.
    Room oda tipi degistirilmek isteniyorsa room "Type text" alanından drop down ile istenilen oda tipi secilir.
    Room da yetiskin sayısı degistirilmek isteniyorsa  "Max Adult Count" text alanına istenilen sayı girilir.
    Room da cocuk sayısı degistirilmek isteniyorsa "Max Children Count" text alanında istenilen sayı girilir.
    Room da "IsAvailable" sekmesi tıklanır.
            "Save" butonu tıklanarak kaydedilir.
    "HotelRoom was updated successfully" uyarı mesajı goruntulenir.
    "OK" butonu tıklanır.


 */

    @Test
    public void test01() throws InterruptedException {



        HotelRoomBilgisiDegistirmePages hotelRoomBilgisiDegistirmePages = new HotelRoomBilgisiDegistirmePages();
        hotelRoomBilgisiDegistirmePages.LoginTesti();

        String ilkSayfaHandleDegeri = Driver.getDriver().getWindowHandle();

        hotelRoomBilgisiDegistirmePages.HotelManagement.click();
        hotelRoomBilgisiDegistirmePages.HotelRooms.click();

        WebElement selectElementView = hotelRoomBilgisiDegistirmePages.view1;
        Select View = new Select(selectElementView);
        View.selectByIndex(5);

        Thread.sleep(3000);

        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        hotelRoomBilgisiDegistirmePages.allDetailsList.get(0).click();

        //System.out.println(hotelListUpDatePages.allDetailsList.size());

        Set<String> handleListesi = Driver.getDriver().getWindowHandles();

        String ikinciSayfaHandleDegeri="";

        for (String each: handleListesi
        ) {
            if (!each.equals(ilkSayfaHandleDegeri)){
                ikinciSayfaHandleDegeri=each;
            }
        }

        Driver.getDriver().switchTo().window(ikinciSayfaHandleDegeri);
/*
        WebElement selectElementHotel = hotelRoomBilgisiDegistirmePages.HotelTextBox;
        Select Hotel = new Select(selectElementView);
        View.selectByIndex(2);
*/

      hotelRoomBilgisiDegistirmePages.CodeTextBox.clear();
      hotelRoomBilgisiDegistirmePages.CodeTextBox.sendKeys(ConfigReader.getProperty("kr_Hotel_room_data_code"));

      hotelRoomBilgisiDegistirmePages.NameTextBox.clear();
      hotelRoomBilgisiDegistirmePages.NameTextBox.sendKeys(ConfigReader.getProperty("kr_Hotel_room_data_name"));

      hotelRoomBilgisiDegistirmePages.LocationTextBox.clear();
      hotelRoomBilgisiDegistirmePages.LocationTextBox.sendKeys(ConfigReader.getProperty("kr_Hotel_room_data_Location"));

      hotelRoomBilgisiDegistirmePages.DescriptionTextBox.clear();
      hotelRoomBilgisiDegistirmePages.DescriptionTextBox.sendKeys(ConfigReader.getProperty("kr_Hotel_room_data_Description"));



        WebElement selectElement = hotelRoomBilgisiDegistirmePages.RoomTypeTextBox;
        Select RoomType = new Select(selectElement);
        RoomType.selectByIndex(2);

        hotelRoomBilgisiDegistirmePages.MaxAdultCountTexBox.clear();
        hotelRoomBilgisiDegistirmePages.MaxAdultCountTexBox.sendKeys(ConfigReader.getProperty("kr_Hotel_room_data_MaxAdultCount"));

        hotelRoomBilgisiDegistirmePages.MaxChildCountTextBox.clear();
        hotelRoomBilgisiDegistirmePages.MaxChildCountTextBox.sendKeys(ConfigReader.getProperty("kr_Hotel_room_data_MaxChildrenCount"));

        hotelRoomBilgisiDegistirmePages.IsAvailableTextBox.isSelected();
    }

}
