package starter.pages.Mobile;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.lastResponse;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class Cart {
    protected String url = "http://167.172.66.247:8002/";
    public String token="";

    @Step("user set up api endpoint login in Cart in website")
    public String userSetUpApiEndpointLoginInCartInWebsite(){
        return url + "user_login";
    }
    @Step("user send a HTTP request login in Cart in website")
    public void userSendAHTTPRequestLoginInCartInWebsite(){
        String body = "{\n" +
                "    \"email\": \"sean1@gmail.com\",\n" +
                "    \"password\": \"123456\"\n" +
                "}";
        JSONObject reqBody = new JSONObject(body);
        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(userSetUpApiEndpointLoginInCartInWebsite());
        token = lastResponse().getBody().jsonPath().get("data.token");
    }
    @Step("user set the POST api endpoint Cart")
    public String userSetThePOSTApiEndpointCart(){
        return url + "keranjang";
    }

    @Step("user sent HTTP POST request post Cart")
    public void userSentHTTPPOSTRequestPostCart(){
        String body = "{\n" +
                "    \"user_id\": \"2\",\n" +
                "    \"produk_id\": \"1\",\n" +
                "    \"jumlah\": \"2\"\n" +
                "}";
        JSONObject reqBody = new JSONObject(body);

        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(userSetThePOSTApiEndpointCart());
    }

    @Step("user receive a valid login and Cart HTTP response code 200")
    public void userReceiveAValidLoginAndCartHTTPResponseCode200(){
        SerenityRest.given().header("Authorization", "Bearer " + token).get(userSetThePOSTApiEndpointCart());
        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("user receives valid data to add Cart data")
    public void userReceivesValidDataToAddCartData(){
        restAssuredThat(response -> response.body("data[0].user_id", equalTo(2)));
    }
    //========@TCCart02========
    @Step("user set the GET api endpoint Cart")
    public String userSetTheGETApiEndpointCart(){
        return url + "keranjang?page=1&limit=5&order=desc";
    }
    @Step("user sent HTTP GET request get Cart by ID")
    public void userSentHTTPGETRequestGetCartByID(){
        SerenityRest.given().get(userSetTheGETApiEndpointCart());
    }
    @Step("user receive valid data for all Cart")
    public void userReceiveValidDataForAllCart(){
        restAssuredThat(response -> response.body("data[0].user_id", equalTo(2)));
    }
    //========@TCCart03========
    @Step("user set the PUT api endpoint Cart")
    public String userSetThePUTApiEndpointCart(){
        return url + "keranjang/1";
    }

    @Step("user sent HTTP PUT request Cart by ID")
    public void userSentHTTPPUTRequestCartByID(){
        String body = "{\n" +
                "    \"nama\": \"Perhiasan 2\",\n" +
                "        \"deskripsi\": \"Aksessoris Cantik dan berkualitas tinggi\"\n" +
                "}";
        JSONObject reqBody = new JSONObject(body);
        SerenityRest.given().header("Content-Type", "application/json").body("[\n" + reqBody.toString() + "\n]").put(userSetThePUTApiEndpointCart());
    }
    @Step("user receive valid data for Cart by ID")
    public void userReceiveValidDataForCartByID(){
        restAssuredThat(response -> response.body("data[0].user_id", equalTo(1)));
    }
    //========@TCCart04========
    @Step("user set the DELETE api endpoint Cart")
    public String userSetTheDELETEApiEndpointCart(){
        return url + "keranjang/1";
    }

    @Step("user sent HTTP DELETE request Cart by ID")
    public void userSentHTTPDELETERequestCartByID(){
        SerenityRest.given().delete(userSetTheDELETEApiEndpointCart());
    }
    @Step("user receive valid data for delete Cart by ID")
    public void userReceiveValidDataForDeleteCartByID(){
        restAssuredThat(response -> response.body("data[0].message", equalTo("Delete Keranjang success")));
    }
}
