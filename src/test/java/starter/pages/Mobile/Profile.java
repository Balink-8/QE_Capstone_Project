package starter.pages.Mobile;

import io.cucumber.java.en.And;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.lastResponse;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class Profile {
    protected String url = "http://167.172.66.247:8002/";
    public String token="";

    @Step("admin set up api endpoint login in profile user")
    public String adminSetUpApiEndpointLoginInProfileUser(){
        return url + "user_login";
    }
    @Step("admin send a HTTP request login in profile user")
    public void adminSendAHTTPRequestLoginInProfileUser(){
        String body = "{\n" +
                "    \"email\": \"sean1@gmail.com\",\n" +
                "    \"password\": \"123456\"\n" +
                "}";
        JSONObject reqBody = new JSONObject(body);
        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(adminSetUpApiEndpointLoginInProfileUser());
        token = lastResponse().getBody().jsonPath().get("data.token");
    }
    @Step("admin set the GET api endpoint profile user")
    public String adminSetTheGETApiEndpointProfileUser(){
        return url + "user?page=1&limit=10&order=desc";
    }

    @Step("admin sent HTTP GET request post profile user")
    public void adminSentHTTPGETRequestPostProfileUser(){
        SerenityRest.given().get(adminSetTheGETApiEndpointProfileUser());
    }
    @Step("admin receive a valid login and profile user HTTP response code 200")
    public void adminReceiveAValidLoginAndProfileUserHTTPResponseCode200(){
        SerenityRest.given().header("Authorization", "Bearer " + token).get(adminSetTheGETApiEndpointProfileUser());
        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("admin received valid data for profile user")
    public void adminReceivedValidDataForProfileUser(){
        restAssuredThat(response -> response.body("data[0].artikel_id", equalTo(1)));
    }

    //=======TCPROFILE04========
    @Step("admin set the PUT api endpoint profile user")
    public String adminSetThePUTApiEndpointProfileUser(){
        return url + "user/1";
    }
    @Step("admin sent HTTP PUT request post profile user")
    public void adminSentHTTPPUTRequestPostProfileUser(){
        String body = "{\n" +
                "    \"nama\": \"Sean 2\",\n" +
                "    \"foto_profile\": \"123\",\n" +
                "    \"email\": \"sean2@gmail.com\",\n" +
                "    \"password\": \"123456\",\n" +
                "    \"no_telepon\": \"0811111111111\",\n" +
                "    \"alamat\": \"Jl. 123\"\n" +
                "}";
        JSONObject reqBody = new JSONObject(body);
        SerenityRest.given().header("Content-Type", "application/json").body("[\n" + reqBody.toString() + "\n]").put(adminSetThePUTApiEndpointProfileUser());
    }
    @Step("admin received valid data for profile user edit")
    public void adminReceivedValidDataForProfileUserEdit(){
        restAssuredThat(response -> response.body("data[0].artikel_id", equalTo(1)));
    }

    //=======TCPROFILE05========
    @Step("admin set the DEL api endpoint profile user")
    public String adminSetTheDELApiEndpointProfileUser(){
        return url + "user/91";
    }

    @Step("admin sent HTTP DEL request post profile user")
    public void adminSentHTTPDELRequestPostProfileUser(){
        SerenityRest.given().delete(adminSetTheDELApiEndpointProfileUser());
    }
    @Step("admin received valid data for profile user delete")
    public void adminReceivedValidDataForProfileUserDelete(){
        restAssuredThat(response -> response.body("data[0].artikel_id", equalTo(1)));
    }
}
