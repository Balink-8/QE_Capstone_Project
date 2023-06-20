package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class Home extends PageObject {

    private By navbarHome(){return By.xpath("//a[text()='Home']");}

    private By navbarDownload(){return By.xpath("//a[text()='Download']");}
    private By navbarContactUs(){return By.xpath("//a[text()='Hubungi Kami']");}
    private By inputFirstName(){return By.id("namaDepan");}
    private By inputLastName(){return By.id("namaBelakang");}
    private By inputEmail(){return By.id("email");}
    private By inputMessage(){return By.id("pesan");}
    private By buttonSend(){return By.xpath("//button[text()='Kirim']");}

    @Step
    public void onBalinkPage(){
        open();
        $(navbarHome()).shouldBeVisible();
    }

    @Step
    public void clickNavbarHome(){
        $(navbarHome()).click();
    }

    @Step
    public void clickNavbarDownload(){$(navbarDownload()).click();}

    @Step
    public void clickNavbarContactUs(){$(navbarContactUs()).click();}

    @Step
    public void userInputFirstName(String firstName){$(inputFirstName()).type(firstName);}

    @Step
    public void userInputLastName(String lastName){ $(inputLastName()).type(lastName);}

    @Step
    public void userInputEmail(String email){ $(inputEmail()).type(email);}

    @Step
    public void userInputMessage(String message){ $(inputMessage()).type(message);}

    @Step
    public void clickButtonSend(){ $(buttonSend()).click();}
}
