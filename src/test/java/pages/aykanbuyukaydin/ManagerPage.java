package pages.aykanbuyukaydin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ManagerPage {

    public ManagerPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//span[@class='title'])[3]")
    public WebElement hotelManagementButonu;

    @FindBy(xpath = "(//i[@class='icon-calendar'])[2]")
    public WebElement hotelListButonu;

    @FindBy(xpath = "//span[@class='hidden-480']")
    public WebElement addHotelButonu;

    @FindBy(xpath = "//div[@class='caption']")
    public WebElement createHotelWebElementiYazisi;

    @FindBy(xpath = "(//input[@class='form-control input-lg required'])[1]")
    public WebElement codeTextBox;

    @FindBy(xpath = "(//input[@class='form-control input-lg required'])[2]")
    public WebElement nameTextBox;

    @FindBy(xpath = "(//input[@class='form-control input-lg required'])[3]")
    public WebElement addressTextBox;

    @FindBy(xpath = "(//input[@class='form-control input-lg required'])[4]")
    public WebElement phoneTextBox;

    @FindBy(xpath = "(//input[@class='form-control input-lg required'])[5]")
    public WebElement emailTextBox;

    @FindBy(xpath = "//select[@class='form-control input-lg required']")
    public WebElement idGroupDropDown;

    @FindBy(xpath = "(//button[@class='btn blue'])[2]")
    public WebElement saveButonu;

    @FindBy(xpath = "//div[@class='bootbox-body']")
    public WebElement successfullyMesaji;




}
