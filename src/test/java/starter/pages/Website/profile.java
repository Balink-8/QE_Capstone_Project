package starter.pages.Website;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.lastResponse;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class profile {
    protected String url = "http://167.172.66.247:8002/";
    public String token="";

    @Step("admin set up api endpoint login in profile admin")
    public String adminSetUpApiEndpointLoginInProfileAdmin(){
        return url + "admin_login";
    }
    @Step("admin send a HTTP request login in profile admin")
    public void adminSendAHTTPRequestLoginInProfileAdmin(){
        String body = "{\n" +
                "    \"email\": \"BalinkBarong@gmail.com\",\n" +
                "    \"password\": \"123456\"\n" +
                "}";
        JSONObject reqBody = new JSONObject(body);
        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(adminSetUpApiEndpointLoginInProfileAdmin());
        token = lastResponse().getBody().jsonPath().get("data.token");
    }
    @Step("admin set the GET api endpoint profile admin")
    public String adminSetTheGETApiEndpointProfileAdmin(){
        return url + "event?page=1&limit=5&order=desc";
    }

    @Step("admin sent HTTP GET request post profile admin")
    public void adminSentHTTPGETRequestPostProfileAdmin(){
        SerenityRest.given().get(adminSetTheGETApiEndpointProfileAdmin());
    }
    @Step("admin receive a valid login and profile admin HTTP response code 200")
    public void adminReceiveAValidLoginAndProfileAdminHTTPResponseCode200(){
        SerenityRest.given().header("Authorization", "Bearer " + token).get(adminSetTheGETApiEndpointProfileAdmin());
        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("admin received valid data for profile admin")
    public void adminReceivedValidDataForProfileAdmin(){
        restAssuredThat(response -> response.body("data[0].artikel_id", equalTo(1)));
    }

    //==========TCPROFILE02========
    @Step("admin set the PUT api endpoint profile admin")
    public String adminSetThePUTApiEndpointProfileAdmin(){
        return url + "admin";
    }
    @Step("admin sent HTTP PUT request post profile admin")
    public void adminSentHTTPPUTRequestPostProfileAdmin(){
        String body = "{\n" +
                "    \"nama\": \"Sean 2\",\n" +
                "    \"foto_profile\": \"123\",\n" +
                "    \"email\": \"BalinkBarong@gmail.com\",\n" +
                "    \"password\": \"123456\",\n" +
                "    \"no_telepon\": \"0811111111111\",\n" +
                "    \"alamat\": \"Jl. 123\"\n" +
                "}";
        JSONObject reqBody = new JSONObject(body);
        SerenityRest.given().header("Content-Type", "application/json").body("[\n" + reqBody.toString() + "\n]").put(adminSetThePUTApiEndpointProfileAdmin());
    }
    @Step("admin received valid data for profile admin edit")
    public void adminReceivedValidDataForProfileAdminEdit(){
        restAssuredThat(response -> response.body("data[0].artikel_id", equalTo(1)));
    }
}
