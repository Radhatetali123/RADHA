import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static io.restassured.RestAssured.given;

public class demooo {

    @Test
    public void test1() throws IOException {

        Response response = RestAssured.get("https://computer-database.gatling.io/computers");
        System.out.println(response.getStatusCode());
        System.out.println(response.getTime());
        System.out.println(response.getBody().asString());
        System.out.println(response.getStatusLine());
        System.out.println(response.prettyPrint());
//
// RestAssured.baseURI = "http://computer-database.gatling.io/computers";


// RequestSpecification httpRequest = RestAssured.given();
//
// // specify the method type (GET) and the parameters if any.
// //In this case the request does not take any parameters
// Response response = httpRequest.request(Method.GET, "");
//
// // Print the status and message body of the response received from the server
// System.out.println("Status received => " + response.getStatusLine());
// System.out.println("Response=>" + response.prettyPrint());
// //System.out.println(response.header("ACE"));


// //System.out.println(response.getStatusCode());
// //System.out.println(response.getTime());
// //System.out.println(response.getBody().asString());
// RequestSpecification httpRequest = RestAssured.given();
// httpRequest.request(Method.GET, "ibm");
//
// System.out.println(response.getStatusLine());
// System.out.println(response.prettyPrint());
// //System.out.println(response.getHeader(""));
// }
//}
    }}