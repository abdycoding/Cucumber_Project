package Pages;

import Utilities.GWD;
import org.openqa.selenium.support.PageFactory;

public class HeaderMenu {

    public HeaderMenu() {
        PageFactory.initElements(GWD.getDriver(), this);

    }
}
