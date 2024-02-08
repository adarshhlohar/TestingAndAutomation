package com.bridgekabz.Swagger;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.io.File;

import static io.restassured.RestAssured.given;

public class Pet {

    @Test
    public  void postPet(){
        Response res = given()
                .header("accept","application/json")
                .header("content-type","application/json")
                .body("{\n" +
                        "  \"id\": 2,\n" +
                        "  \"category\": {\n" +
                        "    \"id\": 1232,\n" +
                        "    \"name\": \"555\"\n" +
                        "  },\n" +
                        "  \"name\": \"Jimmy\",\n" +
                        "  \"photoUrls\": [],\n" +
                        "  \"tags\": [\n" +
                        "    {\n" +
                        "      \"id\": 2,\n" +
                        "      \"name\": \"54\"\n" +
                        "    }\n" +
                        "  ],\n" +
                        "  \"status\": \"available \"\n" +
                        "}")
                .when().post("https://petstore.swagger.io/v2/pet");
        res.prettyPrint();
    }

    @Test
    public void getPet(){
        Response res = given()
                .header("accept","application/json")
                .when().get("https://petstore.swagger.io/v2/pet/2");
        res.prettyPrint();
    }

    @Test
    public void findByStatus(){
        Response res = given()
                .header("accept","application/json")
                .when().get("https://petstore.swagger.io/v2/pet/findByStatus?status=available");
        res.prettyPrint();
    }

    @Test
    public  void updatePet(){
        Response res = given()
                .header("accept","application/json")
                .header("content-type","application/json")
                .body("{\n" +
                        "  \"id\": 2,\n" +
                        "  \"category\": {\n" +
                        "    \"id\": 1232,\n" +
                        "    \"name\": \"555\"\n" +
                        "  },\n" +
                        "  \"name\": \"Jimmy2\",\n" +
                        "  \"photoUrls\": [],\n" +
                        "  \"tags\": [\n" +
                        "    {\n" +
                        "      \"id\": 2,\n" +
                        "      \"name\": \"54\"\n" +
                        "    }\n" +
                        "  ],\n" +
                        "  \"status\": \"available \"\n" +
                        "}")
                .when().put("https://petstore.swagger.io/v2/pet");
        res.prettyPrint();
    }

    @Test
    public void addNewPet(){
        Response res = given()
        .header("accept","application/json")
                .header("content-type","application/json")
                .body("{\n" +
                        "  \"id\": 1,\n" +
                        "  \"category\": {\n" +
                        "    \"id\": 0,\n" +
                        "    \"name\": \"string\"\n" +
                        "  },\n" +
                        "  \"name\": \"doggie12\",\n" +
                        "  \"photoUrls\": [\n" +
                        "    \"string\"\n" +
                        "  ],\n" +
                        "  \"tags\": [\n" +
                        "    {\n" +
                        "      \"id\": 0,\n" +
                        "      \"name\": \"string\"\n" +
                        "    }\n" +
                        "  ],\n" +
                        "  \"status\": \"available\"\n" +
                        "}")
                .when().post("https://petstore.swagger.io/v2/pet");
            res.prettyPrint();

    }

    @Test
    public  void  addAboutPet(){
        File file = new File("C:\\Users\\Adarsh\\OneDrive\\Pictures\\Screenshot (125).png");
        Response res = given()
                .header("accept","application/json")
                .header("content-type","multipart/form-data")
                .multiPart(file)
                .when().post("https://petstore.swagger.io/v2/pet/2/uploadImage");
        res.prettyPrint();
    }

    @Test
    public void deletePet(){
        Response res = given()
                .header("accept","application/json")
                .when().delete("https://petstore.swagger.io/v2/pet/2");
        res.prettyPrint();
    }
}
