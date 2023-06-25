package starter.pages.Website;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.lastResponse;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class artikel {
    protected String url = "http://167.172.66.247:8002/";
    public String token="";

    @Step("admin set up api endpoint login in Artikel in website")
    public String adminSetUpApiEndpointLoginInArtikelInWebsite(){
        return url + "admin_login";
    }
    @Step("admin send a HTTP request login in Artikel in website")
    public void adminSendAHTTPRequestLoginInArtikelInWebsite(){
        String body = "{\n" +
                "    \"email\": \"BalinkBarong@gmail.com\",\n" +
                "    \"password\": \"123456\"\n" +
                "}";
        JSONObject reqBody = new JSONObject(body);
        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(adminSetUpApiEndpointLoginInArtikelInWebsite());
        token = lastResponse().getBody().jsonPath().get("data.token");
    }
    @Step("admin set the POST api endpoint Artikel")
    public String adminSetThePOSTApiEndpointArtikel(){
        return url + "artikel";
    }

    @Step("admin sent HTTP POST request post Artikel")
    public void adminSentHTTPPOSTRequestPostArtikel(){
        String body = "{\n" +
                "    \"gambar\": \"123\",\n" +
                "    \"judul\": \"Kecak 4\",\n" +
                "    \"isi\": \"abc\"\n" +
                "}";
        JSONObject reqBody = new JSONObject(body);

        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(adminSetThePOSTApiEndpointArtikel());
    }

    @Step("admin receive a valid login and Artikel HTTP response code 200")
    public void adminReceiveAValidLoginAndArtikelHTTPResponseCode200(){
        SerenityRest.given().header("Authorization", "Bearer " + token).get(adminSetThePOSTApiEndpointArtikel());
        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("admin receives valid data to add Artikel data")
    public void adminReceivesValidDataToAddArtikelData(){
        restAssuredThat(response -> response.body("data[0].gambar", equalTo("123")));
    }
    //========@TCArtikel02========
    @Step("admin set the GET api endpoint Artikel")
    public String adminSetTheGETApiEndpointArtikel(){
        return url + "artikel?page=1&limit=5&search=kecak";
    }
    @Step("admin sent HTTP GET request get Artikel by ID")
    public void adminSentHTTPGETRequestGetArtikelByID(){
        SerenityRest.given().get(adminSetTheGETApiEndpointArtikel());
    }
    @Step("admin receive valid data for all Artikel")
    public void adminReceiveValidDataForAllArtikel(){
        restAssuredThat(response -> response.body("data[0].gambar", equalTo("123")));
    }
    //========@TCArtikel03========
    @Step("admin set the PUT api endpoint Artikel")
    public String adminSetThePUTApiEndpointArtikel(){
        return url + "artikel/68";
    }

    @Step("admin sent HTTP PUT request Artikel by ID")
    public void adminSentHTTPPUTRequestArtikelByID(){
        String body = "{\n" +
                "    \"gambar\": \"123 \",\n" +
                "    \"judul\": \"Kecak 1.1 \",\n" +
                "        \"isi\": \"abc\"\n" +
                "}";
        JSONObject reqBody = new JSONObject(body);
        SerenityRest.given().header("Content-Type", "application/json").body("[\n" + reqBody.toString() + "\n]").put(adminSetThePUTApiEndpointArtikel());
    }
    @Step("admin receive valid data for Artikel by ID")
    public void adminReceiveValidDataForArtikelByID(){
        restAssuredThat(response -> response.body("data[0].gambar", equalTo("123")));
    }
    //========@TCArtikel04========
    @Step("admin set the DELETE api endpoint Artikel")
    public String adminSetTheDELETEApiEndpointArtikel(){
        return url + "artikel/89";
    }

    @Step("admin sent HTTP DELETE request Artikel by ID")
    public void adminSentHTTPDELETERequestArtikelByID(){
        SerenityRest.given().delete(adminSetTheDELETEApiEndpointArtikel());
    }
    @Step("admin receive valid data for delete Artikel by ID")
    public void adminReceiveValidDataForDeleteArtikelByID(){
        restAssuredThat(response -> response.body("data[0].message", equalTo("Delete Artikel success")));
    }
}
