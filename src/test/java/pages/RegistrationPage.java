package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RegistrationPage {
    public RegistrationPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
 @FindBy(id = "UserName")
    public WebElement username;
  @FindBy(xpath = "//input[@id='Password']")
    public WebElement password;
  @FindBy(xpath = "//input[@name='Email']")
    public WebElement email;
  @FindBy(xpath = "//input[@id='NameSurname']")
    public WebElement fullName;
  @FindBy(xpath = "//input[@name='PhoneNo']")
    public WebElement phoneNo;
  @FindBy(xpath = "//input[@id='SSN']" )
    public WebElement ssn;
  @FindBy(xpath = "//input[@id='DrivingLicense']")
    public WebElement drivingLicense;
  @FindBy(id="IDCountry")
    public WebElement idCountry;
  @FindBy(id="IDState")
    public WebElement state;
  @FindBy(xpath = "//input[@id='Address']")
    public WebElement address;
  @FindBy(xpath = "//input[@id='WorkingSector']")
    public WebElement workingSector;
  @FindBy(xpath = "//input[@id='BirthDate']")
    public  WebElement birthDate;
  @FindBy(xpath = "//input[@id='btnSubmit']")
    public WebElement saveButonu;
  @FindBy(xpath = "//label[@for='UserName']")
    public WebElement username_error;
  @FindBy(xpath = "//label[@for='Password']")
    public WebElement password_error;
    @FindBy(xpath = "//label[@for='Email']")
    public WebElement email_error;
    @FindBy(xpath = "//label[@for='NameSurname']")
    public WebElement fullName_error;
    @FindBy(xpath = "//label[@for='PhoneNo']")
    public WebElement phoneNum_error;
    @FindBy(xpath = "//label[@for='SSN']")
    public WebElement ssn_error;
    @FindBy(xpath = "//label[@for='DrivingLicense']")
    public WebElement driving_error;
    @FindBy(xpath = "//label[@for='IDCountry']")
    public WebElement idCountry_error;
    @FindBy(xpath = "//label[@for='Address']")
    public WebElement address_error;
    @FindBy(xpath = "//label[@for='WorkingSector']")
    public WebElement WorkingSector_error;
    @FindBy(xpath = "//label[@for='BirthDate']")
    public WebElement birthDate_error;



}
