package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ResultPage {
    public ResultPage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

//click anyone link from selenium webdriver in searchbar
    @FindBy(xpath="//a[@class='_2rpwqI']")
    List<WebElement> results;

    public int CountOfResults()
    {
        return results.size();
    }

    public void getTitle()
    {
        for(WebElement res:results)
        {
            System.out.println(res.getAttribute("title"));
        }
    }


}
