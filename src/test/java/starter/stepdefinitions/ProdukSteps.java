package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.ProdukPage;

public class ProdukSteps {
    @Steps
    ProdukPage produk;
    @And("admin click Produk menu")
    public void adminClickProdukMenu() { produk.adminClickProdukMenu();
    }

    @Then("admin can see data produk on app")
    public void adminCanSeeDataProdukOnApp() { produk.adminCanSeeProdukOnApp();
    }

    @And("admin click tambah produk button")
    public void adminClickTambahProdukButton() { produk.adminClickTambahProdukBtn();
    }

    @And("admin on tambah produk page")
    public void adminOnTambahProdukPage() { produk.adminOnTambahProdukPages();
    }

    @And("admin input foto produk")
    public void adminInputFotoProduk() { produk.inputForoProduk();
    }

    @And("admin input nama produk")
    public void adminInputNamaProduk() { produk.inputNamaProduk("Produk Alifah");
    }

    @And("admin input kategori produk")
    public void adminInputKategoriProduk() { produk.inputKategoriProduk();
    }

    @And("admin input harga produk")
    public void adminInputHargaProduk() { produk.inputHargaProduk("100000");
    }

    @And("admin input stok produk")
    public void adminInputStokProduk() { produk.inputStokProduk("100");
    }

    @Then("data produk success to created")
    public void dataProdukSuccessToCreated() { produk.validateProdukSuccessCreated();
    }

    @And("admin on edit produk page")
    public void adminOnEditProdukPage() { produk.onEditProdukPage();
    }

    @And("admin click delete produk button")
    public void adminClickDeleteProdukButton() { produk.clickDeleteProdukBtn();
    }

    @Then("admin successfully delete data produk")
    public void adminSuccessfullyDeleteDataProduk() { produk.validateDeleteProduk();
    }

    @Then("data produk success to edited")
    public void dataProdukSuccessToEdited() { produk.validateEditedProduk();
    }

    @And("admin click edit produk button")
    public void adminClickEditProdukButton() { produk.editProdukBtn();
    }

    @Given("admin on login page")
    public void adminOnLoginPage() { produk.onLoginPages();
    }

    @When("admin input valid username in the username field")
    public void adminInputValidUsernameInTheUsernameField() { produk.emailField("BalinkBarong@gmail.com");
    }

    @And("admin input a valid password in the password field")
    public void adminInputAValidPasswordInThePasswordField() { produk.passwordField("123456");
    }

    @And("admin click Login button")
    public void adminClickLoginButton() { produk.clickLoginBtn();
    }
}
