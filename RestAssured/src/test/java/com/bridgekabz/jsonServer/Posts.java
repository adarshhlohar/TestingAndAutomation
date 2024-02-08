package com.bridgekabz.jsonServer;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;


public class Posts {
        @Test
        public void get(){
            Response res = given()
                    .header("accept","application/json")
                    .when().get("http://localhost:3000/posts");
            res.prettyPrint();
        }

        @Test
        public void post(){
            Response res = given()
                    .header("accept","application/json")
                    .header("content-type","application/json")
                    .body("{\n" +
                            "    \"id\": 5,\n" +
                            "    \"title\": \"json-server\",\n" +
                            "    \"author\": \"Dhiraj\"\n" +
                            "  }")
                    .when().post("http://localhost:3000/posts");

            res.prettyPrint();
        }

        @Test
        public void put(){
            Response res = given()
                    .header("accept","application/json")
                    .header("content-type","application/json")
                    .body("{\n" +
                            "        \"id\": 4,\n" +
                            "        \"title\": \"json-server\",\n" +
                            "        \"author\": \"Adarsh Lohar\"\n" +
                            "}")
                    .when().put("http://localhost:3000/posts/4");
            res.prettyPrint();
        }

        @Test
        public  void delete(){
            Response res = given()
                    .header("accept","application/json")
                    .when().delete("http://localhost:3000/posts/2");
            res.prettyPrint();
        }

        @Test
        public void patch(){
            Response res = given()
                    .header("accept","application/json")
                    .header("content-type","application/json")
                    .body("{\n" +
                            "    \"author\" : \"Addi\"\n" +
                            "}")
                    .when().patch("http://localhost:3000/posts/4");
            res.prettyPrint();
        }
}
