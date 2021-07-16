package pages.nurcan;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.w3c.dom.html.HTMLInputElement;
import utilities.Driver;

public class US_006Pages {



    public  US_006Pages(){
        PageFactory.initElements(Driver.getDriver(),this);

    }


    @FindBy(xpath = "/html/body/div[3]/div[1]/div/ul/li[3]/ul/li[2]/ul/li[2]/a")
    public WebElement HotelRoomsMenu;
///html/body/div[3]/div[2]/div/div[3]/div/div/div[1]/div[2]/a
    @FindBy (xpath = "/html/body/div[3]/div[2]/div/div[3]/div/div/div[1]/div[2]/a")
    public WebElement OtelRoomOlusturmaButonu;

    @FindBy (id ="IDHotel" )
    public WebElement IdOtelText;

    @FindBy(id ="Code" )
    public WebElement CodeText;

    @FindBy (xpath = "//*[@id=\"Name\"]")
    public WebElement NameText;

    @FindBy(xpath = "//*[@id=\"Location\"]")
    public WebElement LocationText;

//@FindBy(xpath = "//*[@id=\"cke_1_contents\"]/textarea\n")
//public WebElement DescriptionText;

    @FindBy(id = "IDGroupRoomType")
    public WebElement RoomTypeText;

    @FindBy(id = "MaxAdultCount")
    public WebElement MaxAdultCountText;

   @FindBy(id = "MaxChildCount")
    public WebElement MaxChildCountText;

   @FindBy(id = "uniform-IsAvailable")
    public WebElement ApprovedText;

   @FindBy(id = "btnSubmit")
    public WebElement SaveText;

   @FindBy(id = "Price")
    public WebElement Pricetext;

    @FindBy(xpath = "//textarea[@dir='ltr']")
    public WebElement DescriptionText;

    @FindBy(xpath = "//*[text()='HotelRoom was inserted successfully']")
    public WebElement kayitmesaji;


    @FindBy(xpath = "/html/body/div[5]/div/div/div[2]/button")
    public WebElement okeyButonu;

}
