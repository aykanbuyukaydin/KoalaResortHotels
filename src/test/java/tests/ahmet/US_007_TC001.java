package tests.ahmet;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ahmet.Methods;
import pages.ahmet.ReservationPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ahmet.TestBaseRaporAhmet;
import utilities.aykanbuyukaydin.TestBaseRaporAykan;

public class US_007_TC001 extends TestBaseRaporAhmet {

    @Test
    public void TC_001() throws InterruptedException {
        extentTest=extentReports.createTest("US__007_TC001","Room Reservation");

        Methods.logInKoalaResort();
        extentTest.info("Koala Resort Login olundu");

        Methods.roomReservation();
        extentTest.pass("Room Reservation gerçekleştirildi");

    }
}
