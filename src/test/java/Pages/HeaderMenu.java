package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HeaderMenu  extends ParentPage{

    public HeaderMenu() {
        PageFactory.initElements(GWD.getDriver(), this);

    }
    @FindBy(xpath = "//div[@class='ng-star-inserted']/img")
    public WebElement TechnoStudyLink;

    @FindBy(css = "[page='COURSES']>button")
    public WebElement Courses;

    @FindBy(css = "[page='CALENDAR']>button")
    public WebElement Calendar;

    @FindBy(xpath = "//student-toolbar-horizontal//button")
    public List<WebElement> buttonsHeader;
}
