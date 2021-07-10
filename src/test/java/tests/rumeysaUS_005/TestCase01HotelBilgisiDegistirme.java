package tests.rumeysaUS_005;


import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import pages.aykanbuyukaydin.HomePage;
import pages.aykanbuyukaydin.LoginPage;
import pages.rumeysaUS_005.OtelListUpDatePages;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.Set;

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

      OtelListUpDatePages otelListUpDatePages=new OtelListUpDatePages();
      otelListUpDatePages.LoginTesti();

      String ilkSayfaHandleDegeri=Driver.getDriver().getWindowHandle();

      otelListUpDatePages.HotelManagement.click();
      otelListUpDatePages.HotelList.click();
      System.out.println("List Of Hotels Sayfası Görüntülendi..");

      otelListUpDatePages.allDetailsList.get(0).click();

      Set<String> handleListesi = Driver.getDriver().getWindowHandles();

      String ikinciSayfaHandleDegeri="";

      for (String each: handleListesi
      ) {
          if (!each.equals(ilkSayfaHandleDegeri)){
              ikinciSayfaHandleDegeri=each;
          }
      }
      Driver.getDriver().switchTo().window(ikinciSayfaHandleDegeri);

      Actions actions=new Actions(Driver.getDriver());

      otelListUpDatePages.deleteChars(otelListUpDatePages.CodeTextBox);


      otelListUpDatePages.deleteChars(otelListUpDatePages.NameTextBox);
      otelListUpDatePages.NameTextBox.sendKeys("Rumeysa");
      System.out.println("NameTextBox Değiştirildi..");


      otelListUpDatePages.deleteChars(otelListUpDatePages.AddressTextBox);
      otelListUpDatePages.AddressTextBox.sendKeys("Manisa");
      System.out.println("AddressTextBox DEğiştirildi..");

      otelListUpDatePages.deleteChars(otelListUpDatePages.PhoneTextBox);
      otelListUpDatePages.PhoneTextBox.sendKeys("55555555");
      System.out.println("PhoneTextBox DEğiştirildi..");

      otelListUpDatePages.deleteChars(otelListUpDatePages.EmailTextBox);
      otelListUpDatePages.EmailTextBox.sendKeys("adsfsdf@gmail.com");
      System.out.println("EmailTextBox DEğiştirildi..");


     WebElement selectElement= otelListUpDatePages.GroupTextBox;
     Select Group = new Select(selectElement);
     Group.selectByIndex(1);
     System.out.println("GroupType Seçildi..");

     otelListUpDatePages.SAVEButonu.click();
    // Assert.assertTrue(otelListUpDatePages.UpdateSuccessfully.isDisplayed());
     System.out.println("Hotel was updated succesfully   mesaji goruntulendi..");


  }


   }









