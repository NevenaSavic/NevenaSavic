package cybertek;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

public class SimpleGetRequest {

    String url = "http://18.212.188.149:8000/api/spartans";

    @Test
    public void test1(){

        Response response = RestAssured.get(url);//sending request
        System.out.println(response.statusCode()); //printing status code

        //print response body
        System.out.println(response.prettyPrint());

    }
}
