package com.bridgekabz.Swagger;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class User {
    @Test
    public void createUser(){
        Response res = given()
                .header("accept","application/json")
                .header("content-type","application/json")
                .body("{\n" +
                        "  \"id\": 5,\n" +
                        "  \"username\": \"Adarsh\",\n" +
                        "  \"firstName\": \"string\",\n" +
                        "  \"lastName\": \"string\",\n" +
                        "  \"email\": \"string\",\n" +
                        "  \"password\": \"Adarsh\",\n" +
                        "  \"phone\": \"string\",\n" +
                        "  \"userStatus\": 0\n" +
                        "}")
                .when().post("https://petstore.swagger.io/v2/user");
        res.prettyPrint();
    }

    @Test
    public void loginUser(){
        Response res = given()
                .header("accept","application/json")
                .pathParam("username","Adarsh")
                .pathParam("password","Adarsh")
                .when().get("https://petstore.swagger.io/v2/user/login?username={username}&password={password}");
                res.prettyPrint();
       }

       @Test
        public void updateUser(){
        Response res = given()
                .header("accept","application/json")
                .header("content-type","application/json")
                .body("{\n" +
                        "  \"id\": 5,\n" +
                        "  \"username\": \"Adarsh\",\n" +
                        "  \"firstName\": \"string\",\n" +
                        "  \"lastName\": \"string\",\n" +
                        "  \"email\": \"string\",\n" +
                        "  \"password\": \"Adars\",\n" +
                        "  \"phone\": \"string\",\n" +
                        "  \"userStatus\": 0\n" +
                        "}")
                .when().put("https://petstore.swagger.io/v2/user/Adarsh");
        res.prettyPrint();
       }

        @Test
        public void getUser() {
            Response res = given()
                    .header("accept", "application/json")
                    .when().get("https://petstore.swagger.io/v2/user/Adarsh");
            res.prettyPrint();
        }

        @Test
        public void deleteUser(){
            Response res = given()
                    .header("accept", "application/json")
                    .when().delete("https://petstore.swagger.io/v2/user/Adarsh");
            res.prettyPrint();
        }
}
