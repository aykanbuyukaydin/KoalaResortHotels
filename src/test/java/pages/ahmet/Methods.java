package pages.ahmet;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import utilities.ConfigReader;
import utilities.Driver;

public class Methods {

    public static  void logInKoalaResort(){
        Driver.getDriver().get(ConfigReader.getProperty("kr_url"));
        ReservationPage reservationPage=new ReservationPage();
        reservationPage.logInPage.click();
        reservationPage.userNameTextBox.sendKeys(ConfigReader.getProperty("kr_valid_username"));
        reservationPage.passwordTextBox.sendKeys(ConfigReader.getProperty("kr_valid_password"));
        reservationPage.logInButton.click();
        Assert.assertEquals(reservationPage.managerText.getText(),"manager");
    }


   public  static String email="";
    public static void roomReservation() throws InterruptedException {
        ReservationPage reservationPage=new ReservationPage();
        reservationPage.hotelManagementButton.click();
        reservationPage.roomReservationButton.click();
        reservationPage.addRoomReservation.click();


        Faker faker=new Faker();
        Select selectIdUser=new Select(reservationPage.areas.get(0));
        selectIdUser.selectByIndex(3);
        Select selectIdHotelRoom=new Select(reservationPage.areas.get(1));
        selectIdHotelRoom.selectByIndex(8);
        reservationPage.areas.get(2).sendKeys(faker.number().digit());
        reservationPage.areas.get(3).sendKeys(faker.date().toString()+ Keys.ENTER);
        reservationPage.areas.get(4).sendKeys(faker.date().toString()+Keys.ENTER);
        reservationPage.areas.get(5).sendKeys(faker.number().digit());
        reservationPage.areas.get(6).sendKeys(faker.number().digit());
        reservationPage.areas.get(7).sendKeys(faker.name().lastName());
        reservationPage.areas.get(8).sendKeys(faker.phoneNumber().phoneNumber());
        email=faker.internet().emailAddress();
        reservationPage.areas.get(9).sendKeys(email);
        reservationPage.areas.get(10).sendKeys(faker.country().capital());
        reservationPage.approved.click();
        reservationPage.isPaid.click();
        reservationPage.saveButton.click();

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", Driver.getDriver().findElement(By.cssSelector("div.bootbox-body")));


        //System.out.println(reservationPage.saveMessageText.getText());
        String expectedSaveMessage="RoomReservation was inserted successfully";


        reservationPage.okButton.click();
        // Assert.assertEquals(reservationPage.saveMessageText.getText(),expectedSaveMessage);

        js.executeScript("arguments[0].scrollIntoView();", Driver.getDriver().findElement(By.className("remove")));
    }

    public static void roomReservationRecordAssert(){

        ReservationPage reservationPage=new ReservationPage();
        reservationPage.roomReservationButton.click();
        reservationPage.contactEmailTextBox.sendKeys(Methods.email);

        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
        Assert.assertEquals(reservationPage.recordText.getText(),"|Found total 1 records");
    }
}
