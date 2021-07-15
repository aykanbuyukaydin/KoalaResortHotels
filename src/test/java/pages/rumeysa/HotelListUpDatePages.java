package pages.rumeysa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.rumeysa.TestBaseRaporRumeysa;

import java.util.List;

public class HotelListUpDatePages extends TestBaseRaporRumeysa {

    public HotelListUpDatePages()  {

        WebDriver driver;
        PageFactory.initElements(Driver.getDriver(),this);
    }


    public void LoginTesti(){
       // extentTest=extentReports.createTest("HotelBilgisiDegistirme","Hotel bilgisi guncellendi");
        Driver.getDriver().get(ConfigReader.getProperty("kr_url"));
        HotelListUpDatePages otelListUpDatePages= new HotelListUpDatePages();

        otelListUpDatePages.LoginButonu1.click();
        otelListUpDatePages.usernameButonu.sendKeys(ConfigReader.getProperty("kr_valid_username"));
        otelListUpDatePages.passwordButonu.sendKeys(ConfigReader.getProperty("kr_valid_password"));
        otelListUpDatePages.LoginButonu2.click();
        System.out.println("Login Olundu..");
    }

/*
    public void deleteChars(WebElement element){
        Actions actions = new Actions(Driver.getDriver());
        actions.click(element).
                keyDown(Keys.LEFT_CONTROL).
                sendKeys("a").sendKeys("x").
                keyUp(Keys.COMMAND).build().perform();
        }
*/

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

    @FindBy(xpath= "(//select)[1]")
    public WebElement view1;

    @FindBy(xpath = "//a[@target='_blank']")
    public List<WebElement> allDetailsList;

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

    @FindBy(xpath = "(//button[@class='btn green'])[1]")
    public WebElement SAVEButonu;

    @FindBy(className = "bootbox-body")
    public WebElement UpdateSuccessfully;

    @FindBy(className = "btn btn-primary")
    public WebElement OKButonu;



}

