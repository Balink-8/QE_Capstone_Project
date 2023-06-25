package starter.pages.Website;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.lastResponse;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class promo {
    protected String url = "http://167.172.66.247:8002/";
    public String token="";

    @Step("admin set up api endpoint login in promo")
    public String adminSetUpApiEndpointLoginInPromo(){
        return url + "admin_login";
    }
    @Step("admin send a HTTP request login in promo")
    public void adminSendAHTTPRequestLoginInPromo(){
        String body = "{\n" +
                "    \"email\": \"BalinkBarong@gmail.com\",\n" +
                "    \"password\": \"123456\"\n" +
                "}";
        JSONObject reqBody = new JSONObject(body);
        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(adminSetUpApiEndpointLoginInPromo());
        token = lastResponse().getBody().jsonPath().get("data.token");
    }
    @Step("admin set the POST api endpoint promo")
    public String adminSetThePOSTApiEndpointPromo(){
        return url + "promo";
    }
    @Step("admin sent HTTP POST request post promo")
    public void adminSentHTTPPOSTRequestPostPromo(){
        String body = "{\n" +
                "    \"nama\": \"Promo 1\",\n" +
                "    \"kode\": \"123def\",\n" +
                "    \"deskripsi\": \"lorem ipsum\",\n" +
                "    \"potongan_harga\": 20000\n" +
                "}";
        JSONObject reqBody = new JSONObject(body);
        SerenityRest.given().header("Content-Type", "application/json").body("[\n" + reqBody.toString() + "\n]").post(adminSetThePOSTApiEndpointPromo());
    }
    @Step("admin receive a valid login and promo HTTP response code 200")
    public void adminReceiveAValidLoginAndPromoHTTPResponseCode200(){
        SerenityRest.given().header("Authorization", "Bearer " + token).get(adminSetThePOSTApiEndpointPromo());
        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("admin received valid data for promo")
    public void adminReceivedValidDataForPromo(){
        restAssuredThat(response -> response.body("data[0].artikel_id", equalTo(1)));
    }

    //========@TCPROMO02========
    @Step("admin set the GET api endpoint promo")
    public String adminSetTheGETApiEndpointPromo(){
        return url + "promo?page=1&limit=10";
    }

    @Step("admin sent HTTP GET request get promo")
    public void adminSentHTTPGETRequestGetPromo(){
        SerenityRest.given().get(adminSetTheGETApiEndpointPromo());
    }
    @Step("admin receive valid data for all promo")
    public void adminReceiveValidDataForAllPromo(){
        restAssuredThat(response -> response.body("data[0].artikel_id", equalTo(1)));
    }

    //========@TCPROMO03========
    @Step("admin set the PUT api endpoint promo")
    public String adminSetThePUTApiEndpointPromo(){
        return url + "promo/16";
    }
    @Step("admin sent HTTP PUT request get promo by ID")
    public void adminSentHTTPPUTRequestGetPromoByID(){
        String body = "{\n" +
                "    \"nama\": \"Promo 1\",\n" +
                "    \"kode\": \"123def\",\n" +
                "    \"deskripsi\": \"lorem ipsum\",\n" +
                "    \"potongan_harga\": 30000\n" +
                "}";
        JSONObject reqBody = new JSONObject(body);
        SerenityRest.given().header("Content-Type", "application/json").body("[\n" + reqBody.toString() + "\n]").put(adminSetThePUTApiEndpointPromo());
    }
    @Step("admin receive valid data for promo by ID")
    public void adminReceiveValidDataForPromoByID(){
        restAssuredThat(response -> response.body("data[0].artikel_id", equalTo(1)));
    }

    //========@TCPROMO04========
    @Step("admin set the DEL api endpoint promo")
    public String adminSetTheDELApiEndpointPromo(){
        return url + "promo/16";
    }

    @Step("admin sent HTTP DEL request promo by ID")
    public void adminSentHTTPDELRequestPromoByID(){
        SerenityRest.given().delete(adminSetTheDELApiEndpointPromo());
    }
    @Step("admin receive valid data for delete promo")
    public void adminReceiveValidDataForDeletePromo(){
        restAssuredThat(response -> response.body("data[0].artikel_id", equalTo(1)));
    }
}
