package pages.rumeysaUS_005;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class OtelListUpDatePages {

    public OtelListUpDatePages() {

        PageFactory.initElements(Driver.getDriver(),this);
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




}



