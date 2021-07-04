package pages.mine;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US_003pages {
    WebDriver driver;
    public US_003pages(WebDriver driver){

        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath ="(//a[@class='nav-link'])[7]")
    WebElement logInButonu;
}
