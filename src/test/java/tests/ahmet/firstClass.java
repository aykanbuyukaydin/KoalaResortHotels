package tests.ahmet;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class firstClass {
    @Test
    public void test(){
        Driver.getDriver().get(ConfigReader.getProperty("kr_url"));
    }
}
