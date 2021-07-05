package pages.ahmet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class ReservationPage {
    WebDriver driver;
    public ReservationPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (linkText = "Log in")
    public WebElement logInPage;

    @FindBy(id = "UserName")
    public WebElement userNameTextBox;

    @FindBy(id = "Password")
    public WebElement passwordTextBox;

    @FindBy(id = "btnSubmit")
    public WebElement logInButton;

    @FindBy(css = "span.username")
    public  WebElement managerText;

    @FindBy(xpath = "//span[text()='Hotel Management']")
    public  WebElement hotelManagementButton;

    @FindBy(xpath = "(//i[@class='icon-calendar'])[4]")
    public  WebElement roomReservationButton;

    @FindBy(className = "hidden-480")
    public  WebElement addRoomReservation;

    @FindBy(id = "IDUser")
    public WebElement idUser;

    @FindBy(id = "IDHotelRoom")
    public WebElement idHotelRoom;

    @FindBy(className = "form-control")
    public List<WebElement> areas;

    @FindBy(id = "uniform-Approved")
    public WebElement approved;

    @FindBy(id = "uniform-IsPaid")
    public WebElement isPaid;

    @FindBy(id="btnSubmit")
    public WebElement saveButton;

    @FindBy(css = "div.bootbox-body")
    public WebElement saveMessageText;

    @FindBy(xpath = "//button[@data-bb-handler='ok']")
    public WebElement okButton;

    @FindBy(xpath = "//input[@name='ContactEmail']")
    public WebElement contactEmailTextBox;

    @FindBy(linkText = "Search")
    public WebElement searchButton;

    @FindBy(xpath = "//*[text()='Found total 1 records']")
    public WebElement recordText;


}
