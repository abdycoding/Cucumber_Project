package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.And;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class _04_MessagingSteps {
    DialogContent dc=new DialogContent();
    @And("Hover over the messsaging menu")
    public void hoverOverTheMesssagingMenu() {
        Actions actions=new Actions(GWD.getDriver());
        Action aksiyon=actions.moveToElement(dc.messaging).build();
        aksiyon.perform();

    }
}
