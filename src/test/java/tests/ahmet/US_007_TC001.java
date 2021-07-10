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

public class US_007_TC001 {

    @Test
    public void TC_001() throws InterruptedException {

        Methods.logInKoalaResort();

        Methods.roomReservation();

    }
}
