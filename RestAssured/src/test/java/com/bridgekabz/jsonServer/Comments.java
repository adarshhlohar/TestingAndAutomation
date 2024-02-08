package com.bridgekabz.jsonServer;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Comments {
    @Test
    public void getComments(){
        Response res = given()
                .header("accept","application/json")
                .when().get("http://localhost:3000/comments");
            res.prettyPrint();
    }

    @Test
    public void postCommets(){
        Response res = given()
                .header("accept","application/json")
                .header("content-type","application/json")
                .body("{\n" +
                        "        \"id\": 5,\n" +
                        "        \"body\": \"some extra comment\",\n" +
                        "        \"postId\": 5\n" +
                        "    }")
                .when().post("http://localhost:3000/comments");
            res.prettyPrint();
    }

    @Test
    public void putComments(){
        Response res = given()
                .header("accept","application/json")
                .header("content-type","application/json")
                .body("{\n" +
                        "        \"id\": 4,\n" +
                        "        \"body\": \"add comment\",\n" +
                        "        \"postId\": 4\n" +
                        "    }")
                        .when().put("http://localhost:3000/comments/4");
            res.prettyPrint();
    }

    @Test
    public void patchComments(){
        Response res = given()
                .header("accept","application/json")
                .header("content-type","application/json")
                .body("{\n" +
                        "        \"body\": \"something in comment\"\n" +
                        "    }")
                .when().patch("http://localhost:3000/comments/1");
        res.prettyPrint();
    }

    @Test
    public void deleteComments(){
        Response res = given()
                .header("accept","application/json")
                .when().patch("http://localhost:3000/comments/3");
        res.prettyPrint();
    }
}
