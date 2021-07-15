package tests.rumeysaUS_005;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;
import pages.rumeysa.HotelListUpDatePages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;
import utilities.rumeysa.TestBaseRaporRumeysa;
import utilities.rumeysa.TestBaseRum;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class TestCase01HotelListBigisiDegistirme extends TestBaseRum{


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

    public static void main(String[] args) {
        System.out.println(System.getProperty("user.dir"));
    }

    @Test
    public void test01() throws InterruptedException {

        setUpTest();
        HotelListUpDatePages hotelListUpDatePages=new HotelListUpDatePages();
        extentTest = extentReports.createTest("Hotel bilgisi Update","dfjksehfdkjfghj");
        hotelListUpDatePages.LoginTesti();

        String ilkSayfaHandleDegeri= Driver.getDriver().getWindowHandle();

        hotelListUpDatePages.HotelManagement.click();
        hotelListUpDatePages.HotelList.click();
         extentTest.info("List of hotels sayfası goruntulendi.");

        WebElement selectElementView = hotelListUpDatePages.view1;
        Select View = new Select(selectElementView);
        View.selectByIndex(5);

        Thread.sleep(3000);

        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        hotelListUpDatePages.allDetailsList.get(4).click();
        //System.out.println(hotelListUpDate.size());

        Set<String> handleListesi = Driver.getDriver().getWindowHandles();

        String ikinciSayfaHandleDegeri="";

        for (String each: handleListesi
        ) {
            if (!each.equals(ilkSayfaHandleDegeri)){
                ikinciSayfaHandleDegeri=each;
            }
        }

      Driver.getDriver().switchTo().window(ikinciSayfaHandleDegeri);

      hotelListUpDatePages.CodeTextBox.clear();
      hotelListUpDatePages.CodeTextBox.sendKeys(ConfigReader.getProperty("kr_Hotel_Data_Code1"));
       extentTest.info("CodeTextBox alanı guncellendi");

      hotelListUpDatePages.NameTextBox.clear();
      hotelListUpDatePages.NameTextBox.sendKeys(ConfigReader.getProperty("kr_Hotel_Data_Name1"));
       extentTest.info("NameTextBox alanı guncellendi");

      hotelListUpDatePages.AddressTextBox.clear();
      hotelListUpDatePages.AddressTextBox.sendKeys(ConfigReader.getProperty("kr_Hotel_Data_Address1"));
       extentTest.info("AddressTextBox alanı guncellendi");

      hotelListUpDatePages.PhoneTextBox.clear();
      hotelListUpDatePages.PhoneTextBox.sendKeys(ConfigReader.getProperty("kr_Hotel_Data_Phone1"));
       extentTest.info("PhoneTextBox alanı guncellendi");

      hotelListUpDatePages.EmailTextBox.clear();
      hotelListUpDatePages.EmailTextBox.sendKeys(ConfigReader.getProperty("kr_Hotel_Data_Email1"));
       extentTest.info("EmailTextBox alanı guncellendi");

      WebElement selectElementGrup= hotelListUpDatePages.GroupTextBox;
      Select Group = new Select(selectElementGrup);
      Group.selectByIndex(1);
       extentTest.info("GruopTypeTextBox alanı guncellendi");

      hotelListUpDatePages.SAVEButonu.click();
       extentTest.info("SAVE butonu tıklandı");

      WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(),3000);
      wait2.until(ExpectedConditions.visibilityOf(hotelListUpDatePages.UpdateSuccessfully));
       extentTest.info("asert edebilmek icin gerekli sure verildi");

      Assert.assertTrue(hotelListUpDatePages.UpdateSuccessfully.isDisplayed());
       extentTest.pass("SAVE butonuna basildigi test edildi");
       tearDownTest();




      }

}



