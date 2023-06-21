package starter.pages.Website;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class login {
    public String endpoint = "http://167.172.66.247:8002/admin_login";

    @Step("I have endpoint login")
    public String setPostEndpointLogin() {
        return endpoint;
    }

    @Step("i send method post endpoint login")
    public void sendPostHttpRequestLogin() {

        String body = "{\n" +
                "    \"email\": \"BalinkBarong@gmail.com\",\n" +
                "    \"password\": \"123456\"\n" +
                "}";


        JSONObject reqBody = new JSONObject(body);

        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(setPostEndpointLogin());
    }

    @Step("i see response code login")
    public void validateResponseCodeLogin() {
        restAssuredThat(response -> response.statusCode(200));
    }

}
