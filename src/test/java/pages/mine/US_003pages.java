package pages.mine;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;


public class US_003pages {



    public US_003pages(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath ="//*[@id=\"navLogon\"]/a")
    public WebElement logInButonu;

    @FindBy(xpath = "//input[@id='UserName']")
    public WebElement nameTextBox;

    @FindBy(xpath = "//input[@id='Password']")
    public WebElement passwordTextBox;

    @FindBy(id = "btnSubmit")
    public WebElement secondLogIn;


    @FindBy(xpath = "/html/body/div[1]/div/div[2]/ul/li")
    public WebElement managerButonu;

    @FindBy(xpath = "//*[@id=\"menuHotels\"]/span[1]")
   public WebElement hotelManagement;

    @FindBy(xpath = "/html/body/div[3]/div[1]/div/ul/li[3]/ul/li[2]/ul/li[1]/a")
    public WebElement hotelList;

    @FindBy(xpath = "/html/body/div[3]/div[1]/div/ul/li[3]/ul/li[2]/ul/li[2]/a")
    public WebElement hotelRooms;

    @FindBy(xpath = "/html/body/div[3]/div[1]/div/ul/li[3]/ul/li[2]/ul/li[3]/a")
    public WebElement roomReservations;


}
