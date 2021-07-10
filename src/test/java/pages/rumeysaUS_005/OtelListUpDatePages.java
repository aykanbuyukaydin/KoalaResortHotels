package pages.rumeysaUS_005;

import org.apache.poi.sl.usermodel.TextBox;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

public class OtelListUpDatePages {

    public OtelListUpDatePages() {

        PageFactory.initElements(Driver.getDriver(),this);
    }

    public void LoginTesti() {

        Driver.getDriver().get(ConfigReader.getProperty("kr_url"));
        OtelListUpDatePages otelListUpDatePages= new OtelListUpDatePages();

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

    @FindBy(xpath = "//a[@href=\"/admin/HotelAdmin\"][1]")
    public WebElement HotelList;

    @FindBy(xpath = "(//a[@target='_blank'])[3]")
    public WebElement DETAİLS;


    @FindBy(xpath = "//input[@placeholder='Code']")
    public WebElement CodeTextBox;

    @FindBy(xpath = "//input[@placeholder='Name']")
    public WebElement NameTextBox;

    @FindBy(xpath = "//input[@placeholder='Address']")
    public WebElement AddressTextBox;

    @FindBy(xpath ="//input[@name='Phone']" )
    public WebElement PhoneTextBox;

    @FindBy(xpath = "//input[@name='Email']")
    public WebElement EmailTextBox;

    @FindBy(xpath = "//select[@name='IDGroup']")
    public WebElement GroupTextBox;

    @FindBy(xpath = "//button[@class='btn green'][1]")
    public WebElement SAVEButonu;

    @FindBy(linkText = "Hotel was updated successfully")
    public WebElement UpdateSuccessfully;

    @FindBy(className = "btn btn-primary")
    public WebElement OKButonu;



}

