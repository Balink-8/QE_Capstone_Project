package starter.pages.Mobile;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.lastResponse;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class Category {
    protected String url = "http://167.172.66.247:8002/";
    public String token="";

    @Step("user set up api endpoint login in category in website")
    public String userSetUpApiEndpointLoginInCategoryInWebsite(){
        return url + "user_login";
    }
    @Step("user send a HTTP request login in category in website")
    public void userSendAHTTPRequestLoginInCategoryInWebsite(){
        String body = "{\n" +
                "    \"email\": \"sean1@gmail.com\",\n" +
                "    \"password\": \"123456\"\n" +
                "}";
        JSONObject reqBody = new JSONObject(body);
        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(userSetUpApiEndpointLoginInCategoryInWebsite());
        token = lastResponse().getBody().jsonPath().get("data.token");
    }
    @Step("user set the POST api endpoint category")
    public String userSetThePOSTApiEndpointCategory(){
        return url + "kategori_produk";
    }

    @Step("user sent HTTP POST request post category")
    public void userSentHTTPPOSTRequestPostCategory(){
        String body = "{\n" +
                "    \"nama\": \"Kerajinan Tangan\",\n" +
                "    \"deskripsi\": \"Patung Naga\"\n" +
                "}";
        JSONObject reqBody = new JSONObject(body);

        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(userSetThePOSTApiEndpointCategory());
    }

    @Step("user receive a valid login and category HTTP response code 200")
    public void userReceiveAValidLoginAndCategoryHTTPResponseCode200(){
        SerenityRest.given().header("Authorization", "Bearer " + token).get(userSetThePOSTApiEndpointCategory());
        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("user receives valid data to add category data")
    public void userReceivesValidDataToAddCategoryData(){
        restAssuredThat(response -> response.body("data[0].nama", equalTo("Kerajinan Tangan")));
    }
    //========@TCCATEGORY02========
    @Step("user set the GET api endpoint category")
    public String userSetTheGETApiEndpointCategory(){
        return url + "kategori_produk/2";
    }
    @Step("user sent HTTP GET request get category by ID")
    public void userSentHTTPGETRequestGetCategoryByID(){
        SerenityRest.given().get(userSetTheGETApiEndpointCategory());
    }
    @Step("user receive valid data for all category")
    public void userReceiveValidDataForAllCategory(){
        restAssuredThat(response -> response.body("data[0].nama", equalTo("Lukisan")));
    }
    //========@TCCATEGORY03========
    @Step("user set the PUT api endpoint category")
    public String userSetThePUTApiEndpointCategory(){
        return url + "kategori_produk/1";
    }

    @Step("user sent HTTP PUT request category by ID")
    public void userSentHTTPPUTRequestCategoryByID(){
        String body = "{\n" +
                "    \"nama\": \"Perhiasan 2\",\n" +
                "        \"deskripsi\": \"Aksessoris Cantik dan berkualitas tinggi\"\n" +
                "}";
        JSONObject reqBody = new JSONObject(body);
        SerenityRest.given().header("Content-Type", "application/json").body("[\n" + reqBody.toString() + "\n]").put(userSetThePUTApiEndpointCategory());
    }
    @Step("user receive valid data for category by ID")
    public void userReceiveValidDataForCategoryByID(){
        restAssuredThat(response -> response.body("data[0].nama", equalTo("Perhiasan 2")));
    }
    //========@TCCATEGORY04========
    @Step("user set the DELETE api endpoint category")
    public String userSetTheDELETEApiEndpointCategory(){
        return url + "kategori_produk/1";
    }

    @Step("user sent HTTP DELETE request category by ID")
    public void userSentHTTPDELETERequestCategoryByID(){
        SerenityRest.given().delete(userSetTheDELETEApiEndpointCategory());
    }
    @Step("user receive valid data for delete category by ID")
    public void userReceiveValidDataForDeleteCategoryByID(){
        restAssuredThat(response -> response.body("data[0].message", equalTo("Delete KategoriProduk success")));
    }

}
