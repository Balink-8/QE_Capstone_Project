package starter.pages.Website;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.lastResponse;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class cart {
    protected String url = "http://167.172.66.247:8002/";
    public String token="";

    @Step("admin set up api endpoint login in Cart in website")
    public String adminSetUpApiEndpointLoginInCartInWebsite(){
        return url + "admin_login";
    }
    @Step("admin send a HTTP request login in Cart in website")
    public void adminSendAHTTPRequestLoginInCartInWebsite(){
        String body = "{\n" +
                "    \"email\": \"BalinkBarong@gmail.com\",\n" +
                "    \"password\": \"123456\"\n" +
                "}";
        JSONObject reqBody = new JSONObject(body);
        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(adminSetUpApiEndpointLoginInCartInWebsite());
        token = lastResponse().getBody().jsonPath().get("data.token");
    }
    @Step("admin set the POST api endpoint Cart")
    public String adminSetThePOSTApiEndpointCart(){
        return url + "keranjang";
    }

    @Step("admin sent HTTP POST request post Cart")
    public void adminSentHTTPPOSTRequestPostCart(){
        String body = "{\n" +
                "    \"admin_id\": \"2\",\n" +
                "    \"produk_id\": \"1\",\n" +
                "    \"jumlah\": \"2\"\n" +
                "}";
        JSONObject reqBody = new JSONObject(body);

        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(adminSetThePOSTApiEndpointCart());
    }

    @Step("admin receive a valid login and Cart HTTP response code 200")
    public void adminReceiveAValidLoginAndCartHTTPResponseCode200(){
        SerenityRest.given().header("Authorization", "Bearer " + token).get(adminSetThePOSTApiEndpointCart());
        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("admin receives valid data to add Cart data")
    public void adminReceivesValidDataToAddCartData(){
        restAssuredThat(response -> response.body("data[0].admin_id", equalTo(2)));
    }
    //========@TCCart02========
    @Step("admin set the GET api endpoint Cart")
    public String adminSetTheGETApiEndpointCart(){
        return url + "keranjang?page=1&limit=5&order=desc";
    }
    @Step("admin sent HTTP GET request get Cart by ID")
    public void adminSentHTTPGETRequestGetCartByID(){
        SerenityRest.given().get(adminSetTheGETApiEndpointCart());
    }
    @Step("admin receive valid data for all Cart")
    public void adminReceiveValidDataForAllCart(){
        restAssuredThat(response -> response.body("data[0].admin_id", equalTo(2)));
    }
    //========@TCCart03========
    @Step("admin set the PUT api endpoint Cart")
    public String adminSetThePUTApiEndpointCart(){
        return url + "keranjang/1";
    }

    @Step("admin sent HTTP PUT request Cart by ID")
    public void adminSentHTTPPUTRequestCartByID(){
        String body = "{\n" +
                "    \"nama\": \"Perhiasan 2\",\n" +
                "        \"deskripsi\": \"Aksessoris Cantik dan berkualitas tinggi\"\n" +
                "}";
        JSONObject reqBody = new JSONObject(body);
        SerenityRest.given().header("Content-Type", "application/json").body("[\n" + reqBody.toString() + "\n]").put(adminSetThePUTApiEndpointCart());
    }
    @Step("admin receive valid data for Cart by ID")
    public void adminReceiveValidDataForCartByID(){
        restAssuredThat(response -> response.body("data[0].admin_id", equalTo(1)));
    }
    //========@TCCart04========
    @Step("admin set the DELETE api endpoint Cart")
    public String adminSetTheDELETEApiEndpointCart(){
        return url + "keranjang/1";
    }

    @Step("admin sent HTTP DELETE request Cart by ID")
    public void adminSentHTTPDELETERequestCartByID(){
        SerenityRest.given().delete(adminSetTheDELETEApiEndpointCart());
    }
    @Step("admin receive valid data for delete Cart by ID")
    public void adminReceiveValidDataForDeleteCartByID(){
        restAssuredThat(response -> response.body("data[0].message", equalTo("Delete Keranjang success")));
    }
}
