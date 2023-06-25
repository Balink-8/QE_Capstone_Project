package starter.pages.Mobile;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.lastResponse;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class Artikel {
    protected String url = "http://167.172.66.247:8002/";
    public String token="";

    @Step("user set up api endpoint login in Artikel in website")
    public String userSetUpApiEndpointLoginInArtikelInWebsite(){
        return url + "user_login";
    }
    @Step("user send a HTTP request login in Artikel in website")
    public void userSendAHTTPRequestLoginInArtikelInWebsite(){
        String body = "{\n" +
                "    \"email\": \"sean1@gmail.com\",\n" +
                "    \"password\": \"123456\"\n" +
                "}";
        JSONObject reqBody = new JSONObject(body);
        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(userSetUpApiEndpointLoginInArtikelInWebsite());
        token = lastResponse().getBody().jsonPath().get("data.token");
    }
    @Step("user set the POST api endpoint Artikel")
    public String userSetThePOSTApiEndpointArtikel(){
        return url + "artikel";
    }

    @Step("user sent HTTP POST request post Artikel")
    public void userSentHTTPPOSTRequestPostArtikel(){
        String body = "{\n" +
                "    \"gambar\": \"123\",\n" +
                "    \"judul\": \"Kecak 4\",\n" +
                "    \"isi\": \"abc\"\n" +
                "}";
        JSONObject reqBody = new JSONObject(body);

        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(userSetThePOSTApiEndpointArtikel());
    }

    @Step("user receive a valid login and Artikel HTTP response code 200")
    public void userReceiveAValidLoginAndArtikelHTTPResponseCode200(){
        SerenityRest.given().header("Authorization", "Bearer " + token).get(userSetThePOSTApiEndpointArtikel());
        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("user receives valid data to add Artikel data")
    public void userReceivesValidDataToAddArtikelData(){
        restAssuredThat(response -> response.body("data[0].gambar", equalTo("123")));
    }
    //========@TCArtikel02========
    @Step("user set the GET api endpoint Artikel")
    public String userSetTheGETApiEndpointArtikel(){
        return url + "artikel?page=1&limit=5&search=kecak";
    }
    @Step("user sent HTTP GET request get Artikel by ID")
    public void userSentHTTPGETRequestGetArtikelByID(){
        SerenityRest.given().get(userSetTheGETApiEndpointArtikel());
    }
    @Step("user receive valid data for all Artikel")
    public void userReceiveValidDataForAllArtikel(){
        restAssuredThat(response -> response.body("data[0].gambar", equalTo("123")));
    }
    //========@TCArtikel03========
    @Step("user set the PUT api endpoint Artikel")
    public String userSetThePUTApiEndpointArtikel(){
        return url + "artikel/68";
    }

    @Step("user sent HTTP PUT request Artikel by ID")
    public void userSentHTTPPUTRequestArtikelByID(){
        String body = "{\n" +
                "    \"gambar\": \"123 \",\n" +
                "    \"judul\": \"Kecak 1.1 \",\n" +
                "        \"isi\": \"abc\"\n" +
                "}";
        JSONObject reqBody = new JSONObject(body);
        SerenityRest.given().header("Content-Type", "application/json").body("[\n" + reqBody.toString() + "\n]").put(userSetThePUTApiEndpointArtikel());
    }
    @Step("user receive valid data for Artikel by ID")
    public void userReceiveValidDataForArtikelByID(){
        restAssuredThat(response -> response.body("data[0].gambar", equalTo("123")));
    }
    //========@TCArtikel04========
    @Step("user set the DELETE api endpoint Artikel")
    public String userSetTheDELETEApiEndpointArtikel(){
        return url + "artikel/89";
    }

    @Step("user sent HTTP DELETE request Artikel by ID")
    public void userSentHTTPDELETERequestArtikelByID(){
        SerenityRest.given().delete(userSetTheDELETEApiEndpointArtikel());
    }
    @Step("user receive valid data for delete Artikel by ID")
    public void userReceiveValidDataForDeleteArtikelByID(){
        restAssuredThat(response -> response.body("data[0].message", equalTo("Delete Artikel success")));
    }

}
