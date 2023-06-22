package starter.pages.Website;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static com.google.common.base.Predicates.equalTo;
import static net.serenitybdd.rest.SerenityRest.lastResponse;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Account {

    protected String endpoint = "http://167.172.66.247:8002";

    public static String token = "";

    @Step("I have endpoint auth")
    public String setPostEndpointAuth(){
        return endpoint + "/admin_login";
    }

    @Step ("I Send endpoint auth")
    public void sendEndpointAuth(){
        String body = "{\n" +
                "    \"email\": \"BalinkBarong@gmail.com\",\n" +
                "    \"password\": \"123456\"\n" +
                "}";
        JSONObject reqBody = new JSONObject(body);

        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(setPostEndpointAuth());
        token = lastResponse().getBody().jsonPath().get("data.token");
    }

    @Step ("I set Get API endpoint account")
    public String setGETApiEndpointAccount(){
        return endpoint + "/user?page=1&limit=10&order=desc";
    }

    @Step("I send GET HTTP request Get Account")
    public void sendGetHttpRequestGetAccount() {
        SerenityRest.given().header("Authorization","Bearer " + token).get(setGETApiEndpointAccount());
    }

    @Step("I receive valid HTTP response code Get account 200")
    public void validateResponseCodeGetAccount() {
        restAssuredThat(response -> response.statusCode(200));
    }

//    @Step("admin received valid data for event")
//    public void ReceivedValidDataForAccount(){
//        restAssuredThat(response -> response.body("data[0].data[0].ID", equalTo(1)));
//    }
}
