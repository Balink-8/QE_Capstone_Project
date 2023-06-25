package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class Promo extends PageObject {

    private By menuPromo(){return By.id("promo");}

    private By addPromo(){return By.id("tambahPromo");}
    private By addNamePromo(){return By.id("addNamaPromo");}
    private By addDeskripsiPromo(){return By.id("addDeskripsiPromo");}
    private By addKodePromo(){return By.id("addKodePromo");}
    private By addPotonganHarga(){return By.id("addPotonganHarga");}
    private By clickIconDetail(){return By.xpath("//tr[@class='_tableRow_1irix_169']");}

    private By iconEdit(){return By.id("edit-icon");}

    private By editNamePromo(){return By.id("editNamaPromo");}

    private By editCodePromo(){return By.id("editKodePromo");}

    private By delete(){return By.id("delete-icon");}

    private By notification(){return By.id("modalKonfirmasi");}

    private By yesButton(){return By.id("modalKonfirmasiYesButton");}
    private By simpan(){return By.xpath("//p[@class='body-large-semibold ms-8 mb-0']");}

    @Step
    public void clickMenuPromo(){
        $(menuPromo()).click();
    }

    @Step
    public void clickAddPromo() {
        $(addPromo()).click();
    }

    @Step
    public void inputNamePromo(String namePromo){$(addNamePromo()).type(namePromo);}

    @Step
    public void inputDeskripsiPromo(String deskripsiPromo){
        $(addDeskripsiPromo()).type(deskripsiPromo);
    }

    @Step
    public void inputKodePromo(String kodePromo){
        $(addKodePromo()).type(kodePromo);
    }

    @Step
    public void inputPotonganHarga(String potonganHarga){
        $(addPotonganHarga()).type(potonganHarga);
    }

    @Step
    public void clickButtonSimpan(){
        $(simpan()).click();
    }

    @Step
    public void clickDetailIcon(){
        $(clickIconDetail()).click();
    }

    @Step
    public void clickIconEdit(){
        Actions builder = new Actions(getDriver());
        Actions hoverOverLocationSelector = builder.moveToElement(getDriver().findElement(By.id("edit-icon")));
        hoverOverLocationSelector.perform();
        $(iconEdit()).click();}

    @Step
    public void inputEditNamePromo(String newNamePromo){
        $(editNamePromo()).type(newNamePromo);
    }

    @Step
    public void inputEditCodePromo(String newCodePromo){
        $(editCodePromo()).type(newCodePromo);
    }

    @Step
    public void clickDeleteIcon(){
        Actions builder = new Actions(getDriver());
        Actions hoverOverLocationSelector = builder.moveToElement(getDriver().findElement(By.id("delete-icon")));
        hoverOverLocationSelector.perform();
        $(delete()).click();
    }

    @Step
    public void clickButtonYes(){ $(yesButton()).click();}
}
