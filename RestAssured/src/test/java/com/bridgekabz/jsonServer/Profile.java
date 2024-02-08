package com.bridgekabz.jsonServer;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Profile {
    @Test
    public void getProfile() {
        Response res = given()
                .header("accept", "application/json")
                .when().get("http://localhost:3000/profile");
        res.prettyPrint();
    }

    @Test
    public void postProfile() {
        Response res = given()
                .header("accept", "application/json")
                .header("content-type", "application/json")
                .body("{\n" +
                        "    \n" +
                        "    \"id\" : 1,\n" +
                        "    \"name\" : \"Adarsh\"\n" +
                        "}")
                .when().post("http://localhost:3000/profile");
        res.prettyPrint();
    }

    @Test
    public void putProfile() {
        Response res = given()
                .header("accept", "application/json")
                .header("content-type", "application/json")
                .body("{\n" +
                        "    \"id\": 1,\n" +
                        "    \"name\": \"Adar\"\n" +
                        "}")
                .when().put("http://localhost:3000/profile/1");
        res.prettyPrint();
    }

    @Test
    public void deleteProfile(){
        Response res = given()
                .header("accept","application/json")
                .when().delete("http://localhost:3000/profile/1");
        res.prettyPrint();
    }
}


