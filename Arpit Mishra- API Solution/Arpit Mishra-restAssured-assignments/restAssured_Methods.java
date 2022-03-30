import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.JSONObject;

import static io.restassured.RestAssured.given;


//Assignment :
//        api gorest.co.in
//        1. Try making GET,POST,UPDATE,etc requests using RestAssured.
//        2. Try Authentication in rest-assured.


public class restAssured_Methods {
    public static void main(String[] args) {
        // restAssured_GET();
        // resAssured_POST();
        // restAssured_UPDATE();
        // restAssured_DELETE();
        //just comment these lines accordingly to get, Post and update data
        // please do not run  resAssured_POST(); method twice with same values.
    }
    public static void restAssured_GET(){
        int id = 9125;
        RestAssured.baseURI = "https://gorest.co.in";
        RestAssured.basePath = "/public/v2/users/"+id;
        Response response =  given().header("Authorization","Bearer 7cf300a3954980370df0803705cb1fb157b4dea84eecf0f2d206f41d48c4a8b5").contentType(ContentType.JSON).when().relaxedHTTPSValidation().get();
        System.out.println(response.prettyPrint());

    }
    public static void resAssured_POST(){
        RestAssured.baseURI = "https://gorest.co.in";
        RestAssured.basePath = "/public/v2/users";
        JSONObject requestParams = new JSONObject();
        requestParams.put("name","Ankir Mishra");
        requestParams.put("email","ankit@aarpit1.com");
        requestParams.put("gender","male");
        requestParams.put("status","active");
        System.out.println(requestParams.toString());
        Response response = given()
                .header("Authorization","Bearer 7cf300a3954980370df0803705cb1fb157b4dea84eecf0f2d206f41d48c4a8b5")
                .accept("application/json").contentType("application/json").relaxedHTTPSValidation()
                .body(requestParams.toString()).log().all().when().post();

        System.out.println(response.prettyPrint());
    }
    public static void restAssured_UPDATE(){
        String id = "9125";
        RestAssured.baseURI = "https://gorest.co.in";
        RestAssured.basePath = "/public/v2/users/"+id;
        JSONObject requestParams = new JSONObject();
        requestParams.put("name","Arpit MishraJI");
//        requestParams.put("email","aarpit@arpit11.com");
//        requestParams.put("gender","male");
//        requestParams.put("status","active");
        Response response = given().param("id","9125").
                header("Authorization","Bearer 7cf300a3954980370df0803705cb1fb157b4dea84eecf0f2d206f41d48c4a8b5")
                .accept("application/json").contentType("application/json").relaxedHTTPSValidation()
                .body(requestParams.toString()).log().all().when().put();

        System.out.println(response.statusLine());

    }
    public static void restAssured_DELETE(){
        String id = "6733";
        RestAssured.baseURI = "https://gorest.co.in";
        RestAssured.basePath = "/public/v2/users/"+id;
        Response response = given().param("id","9125").
                header("Authorization","Bearer 7cf300a3954980370df0803705cb1fb157b4dea84eecf0f2d206f41d48c4a8b5")
                .accept("application/json").contentType("application/json").relaxedHTTPSValidation()
                .log().all().when().delete();
        System.out.println(response.statusLine());


    }
}

