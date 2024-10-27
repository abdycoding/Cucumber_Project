package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.And;
import org.testng.Assert;

public class _05_Steps {
    DialogContent dc=new DialogContent();

    @And("Enter into different window")
    public void enterIntoDifferentWindow() {
        GWD.getDriver().switchTo().frame(0);


    }

    @And("Return into main window")
    public void returnIntoMainWindow() {
        GWD.getDriver().switchTo().parentFrame();
    }

    @And("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        Assert.assertTrue(dc.successMessage.getText().contains("success"), "Error message");

    }
}
