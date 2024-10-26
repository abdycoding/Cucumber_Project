package StepDefinitions;

import Pages.DialogContent;
import Pages.HeaderMenu;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DataTableSteps {


    HeaderMenu hd = new HeaderMenu();
    DialogContent dc = new DialogContent();

    @And("Click on the Element in HeaderMenu")
    public void clickOnTheElementInHeaderMenu(DataTable dtLinkler) {
        List<String> linkler = dtLinkler.asList();

        for (int i = 0; i < linkler.size(); i++) {
            hd.myClick(hd.getWebElement(linkler.get(i)));
        }

    }

    @And("Click on the Element in DialogContent")
    public void clickOnTheElementInDialog(DataTable dtButonlar) {
        List<String> butonlar = dtButonlar.asList();

        for (int i = 0; i < butonlar.size(); i++) {
            hd.myClick(dc.getWebElement(butonlar.get(i)));
        }
    }

    @And("User sending the keys in Dialog")
    public void userSendingTheKeysInDialog(DataTable dtKutuVeYazilar) {
        List<List<String>> kutuVeYazilar = dtKutuVeYazilar.asLists();

        for (int i = 0; i < kutuVeYazilar.size(); i++) {
            WebElement kutu = dc.getWebElement(kutuVeYazilar.get(i).get(0));
            dc.mySendKeys(kutu, kutuVeYazilar.get(i).get(1));
            //kutuya yazıyı gönder
        }

    }

//    @And("User delete the element from dialog")
//    public void userDeleteTheElementFromDialog(DataTable dtSilinecekler) {
//        List<String> silinecekler = dtSilinecekler.asList();
//
//        for (int i = 0; i < silinecekler.size(); i++) {
//            dc.deleteItem(silinecekler.get(i));
//        }
//    }
}

