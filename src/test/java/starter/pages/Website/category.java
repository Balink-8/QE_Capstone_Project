package starter.pages.Website;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static org.hamcrest.CoreMatchers.equalTo;
import static net.serenitybdd.rest.SerenityRest.lastResponse;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class category {
    protected String url = "http://167.172.66.247:8002/";
    public String token="";

    @Step("admin set up api endpoint login in category in website")
    public String adminSetUpApiEndpointLoginInCategoryInWebsite(){
        return url + "admin_login";
    }
    @Step("admin send a HTTP request login in category in website")
    public void adminSendAHTTPRequestLoginInCategoryInWebsite(){
        String body = "{\n" +
                "    \"email\": \"BalinkBarong@gmail.com\",\n" +
                "    \"password\": \"123456\"\n" +
                "}";
        JSONObject reqBody = new JSONObject(body);
        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(adminSetUpApiEndpointLoginInCategoryInWebsite());
        token = lastResponse().getBody().jsonPath().get("data.token");
    }
    @Step("admin set the POST api endpoint category")
    public String adminSetThePOSTApiEndpointCategory(){
        return url + "kategori_produk";
    }

    @Step("admin sent HTTP POST request post category")
    public void adminSentHTTPPOSTRequestPostCategory(){
            String body = "{\n" +
                    "    \"nama\": \"Kerajinan Tangan\",\n" +
                    "    \"deskripsi\": \"Patung Naga\"\n" +
                    "}";
            JSONObject reqBody = new JSONObject(body);

            SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(adminSetThePOSTApiEndpointCategory());
        }

    @Step("admin receive a valid login and category HTTP response code 200")
    public void adminReceiveAValidLoginAndCategoryHTTPResponseCode200(){
        SerenityRest.given().header("Authorization", "Bearer " + token).get(adminSetThePOSTApiEndpointCategory());
        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("admin receives valid data to add category data")
    public void adminReceivesValidDataToAddCategoryData(){
        restAssuredThat(response -> response.body("data[0].nama", equalTo("Kerajinan Tangan")));
    }
    //========@TCCATEGORY02========
    @Step("admin set the GET api endpoint category")
    public String adminSetTheGETApiEndpointCategory(){
        return url + "kategori_produk/2";
    }
    @Step("admin sent HTTP GET request get category by ID")
    public void adminSentHTTPGETRequestGetCategoryByID(){
        SerenityRest.given().get(adminSetTheGETApiEndpointCategory());
    }
    @Step("admin receive valid data for all category")
    public void adminReceiveValidDataForAllCategory(){
        restAssuredThat(response -> response.body("data[0].nama", equalTo("Lukisan")));
    }
    //========@TCCATEGORY03========
    @Step("admin set the PUT api endpoint category")
    public String adminSetThePUTApiEndpointCategory(){
        return url + "kategori_produk/1";
    }

    @Step("admin sent HTTP PUT request category by ID")
    public void adminSentHTTPPUTRequestCategoryByID(){
        String body = "{\n" +
                "    \"nama\": \"Perhiasan 2\",\n" +
                "        \"deskripsi\": \"Aksessoris Cantik dan berkualitas tinggi\"\n" +
                "}";
        JSONObject reqBody = new JSONObject(body);
        SerenityRest.given().header("Content-Type", "application/json").body("[\n" + reqBody.toString() + "\n]").put(adminSetThePUTApiEndpointCategory());
    }
    @Step("admin receive valid data for category by ID")
    public void adminReceiveValidDataForCategoryByID(){
        restAssuredThat(response -> response.body("data[0].nama", equalTo("Perhiasan 2")));
    }
    //========@TCCATEGORY04========
    @Step("admin set the DELETE api endpoint category")
    public String adminSetTheDELETEApiEndpointCategory(){
        return url + "kategori_produk/1";
    }

    @Step("admin sent HTTP DELETE request category by ID")
    public void adminSentHTTPDELETERequestCategoryByID(){
        SerenityRest.given().delete(adminSetTheDELETEApiEndpointCategory());
    }
    @Step("admin receive valid data for delete category by ID")
    public void adminReceiveValidDataForDeleteCategoryByID(){
        restAssuredThat(response -> response.body("data[0].message", equalTo("Delete KategoriProduk success")));
    }

}
