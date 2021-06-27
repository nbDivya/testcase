package pageObjectModel;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage
{
    public HomePage HomePage(WebDriver driver) {
    PageFactory.initElements(driver,this);
    return this;
}
@FindBy(xpath="//div[@class='_2QfC02']/button")
WebElement closeBtn;

    //Searchbar
    @FindBy(xpath="//input[@name='q']")
    WebElement searchBar;


    public void setCloseBtn()
    {
        closeBtn.click();
    }


    public void searchtxt(String search)
    {
        searchBar.sendKeys(search + Keys.ENTER);
        // searchEle.sendKeys(search + Keys.ENTER);

    }
}
