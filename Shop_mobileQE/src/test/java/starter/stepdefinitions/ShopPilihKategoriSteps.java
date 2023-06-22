package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.screen.ShopPilihKategoriPage;

public class ShopPilihKategoriSteps {
    @Steps
    ShopPilihKategoriPage pilihKategori;
    @Given("user click field email")
    public void userClickFieldEmail() { pilihKategori.clickFieldEmail();
    }

    @And("user click field password")
    public void userClickFieldPassword() { pilihKategori.clickFieldPassword();
    }

    @And("user click menu Shop")
    public void userClickMenuShop() { pilihKategori.clickMenuShop();
    }

    @And("user click produk kategori pakaian")
    public void userClickProdukKategoriPakaian() { pilihKategori.clickKategoriPakaian();
    }

    @And("user click produk {int}")
    public void userClickProduk(int arg0) { pilihKategori.clickProduk();
    }

    @Then("user see detail produk")
    public void userSeeDetailProduk() { pilihKategori.seeDetailProduk();
    }

    @And("user input valid email")
    public void userInputValidEmail() { pilihKategori.inputValidEmail("alifah@gmail.com");
    }

    @And("user input valid password")
    public void userInputValidPassword() { pilihKategori.inputValidPassword("alifah123");
    }

    @And("user click masuk button")
    public void userClickMasukButton() { pilihKategori.clickBtnMasuk();
    }

    @And("user can login and go to home page")
    public void userCanLoginAndGoToHomePage() { pilihKategori.seeHomePage();
    }
}
