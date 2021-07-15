package pages.rumeysa;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;

public class HotelRoomBilgisiDegistirmePages {

    public HotelRoomBilgisiDegistirmePages() {

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
    public WebElement HotelRooms;

    @FindBy(xpath = "//select[@name='datatable_ajax_length']")
    public WebElement view1;

    @FindBy(xpath = "//a[@class='btn btn-xs default']")
    public List<WebElement> allDetailsList;

    @FindBy(xpath = "//*[@id=\"IDHotel\"]")
    public WebElement HotelTextBox;

    @FindBy(xpath = "//input[@class='form-control input-lg required'][1]")
    public WebElement CodeTextBox;

    @FindBy(xpath = "//input[@value='kr_new_name']")
    public WebElement NameTextBox; ;

    @FindBy(xpath = "//*[@id=\"Location\"]")
    public WebElement LocationTextBox;

    @FindBy(xpath = "//*[@id=\"cke_1_contents\"]/textarea")
    public WebElement DescriptionTextBox;

    @FindBy(xpath = "//*[@id=\"Price\"]")
    public WebElement PriceTextBox;

    @FindBy(xpath = "//*[@id=\"IDGroupRoomType\"]")
    public WebElement RoomTypeTextBox;

    @FindBy(xpath = "//*[@id=\"MaxAdultCount\"]")
    public WebElement MaxAdultCountTexBox;

    @FindBy(xpath = "//*[@id=\"MaxChildCount\"]")
    public WebElement MaxChildCountTextBox;

    @FindBy(xpath = "//*[@id=\"IsAvailable\"]")
    public WebElement IsAvailableTextBox;

    @FindBy(xpath = "//button[@class='btn green']")
    public WebElement SAVEButonu;




}
