package org.example;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Playlist {
    String token = "BQAAedPd7YijA-R1OzI5jOHPxFnPdImMQSEeETPeMpOcqf0eJCxBrz25GYj1IcQWGtwWxfH-sQAxbTbCFkOziql67zS3cMyzW3uocXY7iPBAE0NcLUl9DZwnaPG3AN-AX_a2jVn6wN74XBHkBmjXfDsQW2ODdyrjtgACi1er3hC4vdZ8sCHd8K-87XCDg8rJ83bSiNILnavnxshbAwj3surmBBCT2QI1yLT7sx1ZrN8o7ewyEXGx3YdtYwQJUwqHIiF5shLHLHhEAWlZb0R9fCPGhHvsAb1trfshaw";

    @Test(priority = 0)
    public void getPlaylistById() {
        Response res = given()
                .header("accept", "application/json")
                .header("Authorization", "Bearer " + token)
                .when()
                .get("https://api.spotify.com/v1/playlists/1GXpUQ5JiFu0iQXhh8c7lU");
        res.prettyPrint();
        Assert.assertEquals(res.statusCode(), 200);
    }


    @Test(priority = 0)
    public void changePlaylistDetail() {
        Response res = given()
                .header("accept", "application/json")
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)
                .body("{\n" +
                        "    \"name\": \"Marathi List\",\n" +
                        "    \"description\": \"Updated playlist description \",\n" +
                        "    \"public\": false\n" +
                        "}")
                .when()
                .put("https://api.spotify.com/v1/playlists/1GXpUQ5JiFu0iQXhh8c7lU");
        res.prettyPrint();
        Assert.assertEquals(res.statusCode(), 200);
    }


    @Test(priority = 0)
    public void getPlaylistItem() {
        Response res = given()
                .header("accept", "application/json")
                .header("Authorization", "Bearer " + token)
                .when()
                .get("https://api.spotify.com/v1/playlists/1GXpUQ5JiFu0iQXhh8c7lU/tracks?limit=2");
        res.prettyPrint();
        Assert.assertEquals(res.statusCode(), 200);
    }

    @Test
    public void createPlaylist() {
        Response res = given()
                .header("accept", "application/json")
                .header("content-type", "application/json")
                .header("Authorization", "Bearer " + token)
                .body("{\n" +
                        "    \"name\": \"addi Bhai playlist\",\n" +
                        "    \"description\": \"This is my fav Adarsh playlist\",\n" +
                        "    \"public\": false\n" +
                        "}")
                .when()
                .post("https://api.spotify.com/v1/users/31prsrcv35zht4ycrrekv26vp3bu/playlists");
    }

    @Test
    public void addItemInPlaylist() {
        Response res = given()
                .header("accept", "application/json")
                .header("content-type", "application/json")
                .header("Authorization", "Bearer " + token)
                .body("{\n" +
                        "    \"uris\": [\n" +
                        "        \"spotify:track:44FmJZhQSghzLkKd2E5kMy\"\n" +
                        "    ],\n" +
                        "    \"position\": 0\n" +
                        "}")
                .when()
                .post("https://api.spotify.com/v1/playlists/4XGYzEIsaOijEaKFiuegXw/tracks");
        res.prettyPrint();
        Assert.assertEquals(res.statusCode(), 201);
    }


    @Test
    public void removeItemFromPlaylist() {
        Response res = given()
                .header("accept", "application/json")
                .header("Authorization", "Bearer " + token)
                .body("{\n" +
                        "    \"tracks\": [\n" +
                        "        {\"uri\": \"spotify:track:44FmJZhQSghzLkKd2E5kMy\"}\n" +
                        "    ]\n" +
                        "}")
                .when()
                .delete("https://api.spotify.com/v1/playlists/4XGYzEIsaOijEaKFiuegXw/tracks");
        res.prettyPrint();
        Assert.assertEquals(res.statusCode(), 200);
    }


    @Test
    public void getCurrentUserPlaylist() {
        Response res = given()
                .header("accept", "application/json")
                .header("Authorization", "Bearer " + token)
                .when()
                .get("https://api.spotify.com/v1/me/playlists");
        res.prettyPrint();
        Assert.assertEquals(res.statusCode(), 200);
    }
}
