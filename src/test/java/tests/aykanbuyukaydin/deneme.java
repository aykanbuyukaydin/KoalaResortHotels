package tests.giaykanbuyukaydin;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class deneme {
    @Test
    public void test(){
        Driver.getDriver().get(ConfigReader.getProperty("kr_url"));
        System.out.println("hello world");
    }
}