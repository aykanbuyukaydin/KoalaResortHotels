package pages.rumeysa;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;

public class HotelRoomDeletePages {

    public HotelRoomDeletePages() {

        PageFactory.initElements(Driver.getDriver(),this);
    }

    public void LoginTesti() {

        Driver.getDriver().get(ConfigReader.getProperty("kr_url"));
        HotelListUpDatePages otelListUpDatePages= new HotelListUpDatePages();

        otelListUpDatePages.LoginButonu1.click();
        otelListUpDatePages.usernameButonu.sendKeys(ConfigReader.getProperty("kr_valid_username"));
        otelListUpDatePages.passwordButonu.sendKeys(ConfigReader.getProperty("kr_valid_password"));
        otelListUpDatePages.LoginButonu2.click();
        System.out.println("Login Olundu..");
    }

    @FindBy(linkText = "Log in")
    public WebElement LoginButonu1;

    @FindBy(xpath = "//input[@class='form-control required']")
    public WebElement usernameButonu;

    @FindBy(xpath = "//input[@class='form-control required password']")
    public WebElement passwordButonu;

    @FindBy(xpath = "//input[@id='btnSubmit']")
    public WebElement LoginButonu2;

    @FindBy(id = "menuHotels")
    public WebElement HotelManagement;

    @FindBy(xpath = "//a[@href='/admin/HotelRoomAdmin']")
    public WebElement RoomList;

    @FindBy(xpath = "//select[@name='datatable_ajax_length']")
    public WebElement View1;

    @FindBy(xpath = "//a[@class='btn btn-xs default']")  //a[@target='_blank']
    public List<WebElement> allDetailsList;

    @FindBy(xpath = "//button[@id='btnDelete']")
    public WebElement DELETEButonu;

    @FindBy(linkText= "Would you like to continue?")
    public WebElement DeleteUyarıMesajı;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement OKButonu;











}
