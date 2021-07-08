package tests.rumeysaUS_005;


import org.junit.Test;
import pages.aykanbuyukaydin.HomePage;
import pages.aykanbuyukaydin.LoginPage;
import pages.rumeysaUS_005.OtelListUpDatePages;
import utilities.ConfigReader;
import utilities.Driver;

public class TestCase01HotelBilgisiDegistirme {

    /*

    Menu den hotel management linkine tiklanir
    "List of hotels"sayfasi goruntulenir
     Bilgileri degistirilmek istenen otel in "Details" butonuna tıklanir
     "Edit hotel" sayfasi goruntulenir
      Hotel  kodu degistirilmek isteniyorsa hotel cod text alanina istenilen hotel kodu girilir
      Hotel  name degistirilmek isteniyorsa hotel name text alanina istenilen hotel name girilir
      Hotel  adres degistirilmek isteniyorsa hotel adress text alanina istenilen hotel adresi girilir
      Hotel  telefonu degistirilmek isteniyorsa hotel phone text alanina istenilen telefon no girilir
      Hotel email adresi degistirilmek isteniyorsa hotel email text alanina istenilen adresi girilir
      Save butonuna tiklanip kaydedilir
      "Hotel was updated succesfully "  mesaji goruntulenir

     */

  @Test
   public void test01() {


      Driver.getDriver().get(ConfigReader.getProperty("kr_url"));
      OtelListUpDatePages otelListUpDatePages= new OtelListUpDatePages();
      otelListUpDatePages.LoginButonu1.click();
      otelListUpDatePages.usernameButonu.sendKeys(ConfigReader.getProperty("kr_valid_username"));
      otelListUpDatePages.passwordButonu.sendKeys(ConfigReader.getProperty("kr_valid_password"));
      otelListUpDatePages.LoginButonu2.click();
      System.out.println("Login Olundu..");

      otelListUpDatePages.HotelManagement.click();
      otelListUpDatePages.HotelList.click();
      System.out.println("List Of Hotels Sayfası Görüntülendi..");

      otelListUpDatePages.DETAİLS.click();
      System.out.println("DETAİLS Butonuna Tıklandı..");
      System.out.println("Edit Hotel Sayfası Görüntülendi..");
















  }

   }









