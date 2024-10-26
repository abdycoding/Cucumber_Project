package Pages;

import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class DialogContent extends ParentPage{
    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "//input[@placeholder='Kullanıcı Adı']")
    public WebElement username;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement password;

    @FindBy(xpath = "//button/span[text()]")
    public WebElement loginButton;

    @FindBy(xpath = "//*[@class='logo-text ng-star-inserted']")
    public WebElement entryText;
//
//
//    public void verifyMessageContainsText(String value){
//        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//hot-toast-container/div/div/div//*"),0));
//        Assert.assertTrue( this.messageBox.getAttribute("innerHTML").toLowerCase().contains(value.toLowerCase()));
//
//        //sayfaya ESC tuşu gönderildi, açık mesaj kalmasın diye
//        new Actions(GWD.getDriver()).sendKeys(Keys.ESCAPE).build().perform();
//    }
//
//    public void deleteItem(String deleteName)
//    {
//        mySendKeys(searchInput,deleteName);
//        myClick(searchButton);
//
//        //sayfa yenilenen kadar bekle, arama sonuçlanana kadar bekle
//        wait.until(ExpectedConditions.elementToBeClickable(this.searchButton));
//
//        myClick(deleteImageBtn);
//        myClick(deleteDialogBtn);
//    }

    public WebElement getWebElement(String strElementName){

        switch (strElementName.trim())
        {

        }

        return null;
    }


}

