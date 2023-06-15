package starter.pages;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.By;

public class Produk  {

    Login login;
    Produk  produk;



    //====== @TCProduct01==========
    @Given("admin on the dashboard page")
    public void adminOnTheDashboardPage() {
        login.onLoginPage();
        login.inputEmail("ekaameliaputri17@gmail.com");
        login.inputPassword("ekaa123");
        login.clickLoginButton();
        produk.adminOnTheDashboardPage();
    }


    @When("admin clicks on the produk menu")
    public void adminclicksontheprodukmenu() {
        produk.adminclicksontheprodukmenu();
    }

    @Then("admin can see all produk data")
    public void admincanseeallprodukdata() {
        produk.admincanseeallprodukdata();


}


    /*
    ====== @TCProduct02==========
     @Given("admin on Dashabord Product")
        public void ThenadminonDashabordProduct() {
        }
        @When("admin click Product menu")
        public void adminclickProductmenu() {
        }
    */

    @And("admin on the Product page")
    public void adminontheProductpage() {
        produk.adminontheProductpage();
    }

    @And("admin click the add Product button")
    public void adminclicktheaddProductbutton() {
        produk.adminclicktheaddProductbutton();
    }

    @And("admin click the select photo button")
    public void adminClickTheSelectPhotoButton() {
        produk.adminClickTheSelectPhotoButton();
    }

    @And("admin on the add Product page")
    public void adminontheaddProductpage() {
        produk.adminontheaddProductpage();
    }

    @And("admin click the Product photo button")
    public void adminclicktheProductphotobutton() {
        produk.adminclicktheProductphotobutton();
    }

    @And("admin Successfully add Product photo")
    public void adminSuccessfullyaddProductphoto() {
        produk.adminSuccessfullyaddProductphoto();
    }

    @And("admin fill in the product name")
    public void adminfillintheproductname() {
        produk.adminfillintheproductname();
    }

    @And("admin fill in then Product description")
    public void adminfillinthenProductdescription() {
        produk.adminfillinthenProductdescription();
    }

    @And("admin fill in the Product catagory")
    public void adminfillintheProductcatagory() {
        produk.adminfillintheProductcatagory();
    }

    @And("admin fill in then Product price")
    public void adminfillinthenProductprice() {
        produk.adminfillinthenProductprice();
    }

    @And("admin replenish product stock")
    public void adminreplenishproductstock() {
        produk.adminreplenishproductstock();
    }

    @And("admin click save button")
    public void adminclicksavebutton() {
        produk.adminclicksavebutton();
    }

//    @Then("Then admin successfully add a new Product")
//    public void Then adminsuccessfullyaddanewProduct() {
//    }

    //======TCProduct03==========
    @And("admin click edit on one of the product")
    public void adminclickeditononeoftheproduct() {
        produk.adminclickeditononeoftheproduct();
    }

    @And("admin change Product category")
    public void adminchangeProductcategory() {
        produk.adminchangeProductcategory();
    }


    @And("admin click to save button")
    public void adminclicktosavebutton() {
    }

    @Then("admin successfully add a new Product")
    public void adminsuccessfullyaddanewProduct() {
    }


    //======TCProduct04==========
    @And("admin click delete the product want to delete")
    public void adminclickdeletetheproductwanttodelete() {
        produk.adminclickdeletetheproductwanttodelete();
    }

}
