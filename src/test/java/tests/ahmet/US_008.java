package tests.ahmet;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.ahmet.Methods;
import pages.ahmet.ReservationPage;
import utilities.Driver;

public class US_008 {
    @BeforeMethod
    public void reservationSetUp() throws InterruptedException {
        Methods.logInKoalaResort();
        Methods.roomReservation();

    }

    @Test
    public void TC_001(){
        Methods.roomReservationRecordAssert();
    }
}
