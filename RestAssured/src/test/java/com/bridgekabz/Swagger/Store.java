package com.bridgekabz.Swagger;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.awt.image.RescaleOp;

import static io.restassured.RestAssured.given;

public class Store {
    @Test
    public void postOrderTo(){
        Response res = given()
                .header("accept","application/json")
                .header("content-type","application/json")
                .body("{\n" +
                        "  \"id\": 2,\n" +
                        "  \"petId\": 9,\n" +
                        "  \"quantity\": 1,\n" +
                        "  \"shipDate\": \"2024-01-03T11:20:11.764+0000\",\n" +
                        "  \"status\": \"placed\",\n" +
                        "  \"complete\": true\n" +
                        "}")
                .when().post("https://petstore.swagger.io/v2/store/order");
        res.prettyPrint();
    }

    @Test
    public void getOrderById(){
        Response res = given()
                .header("accept","application/json")
                .when().get("https://petstore.swagger.io/v2/store/order/2");
        res.prettyPrint();
    }

    @Test
    public void deleteOrderById(){
        Response res = given()
                .header("accept","application/json")
                .when().delete("https://petstore.swagger.io/v2/store/order/2");
        res.prettyPrint();
    }

    @Test
    public void inventoriesByStatus(){
        Response res = given()
                .header("accept","application/json")
                .when().get("https://petstore.swagger.io/v2/store/inventory");
        res.prettyPrint();
    }
}
