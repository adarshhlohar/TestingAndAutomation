package org.example;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class User {

    String token = "BQChN_66m2HFtvW4xqFLYvZJTHIZG_Vekxay8CDdkkUUmkqgPfT1Qd2V67rs0GVWsQkGeIyuOwmvPaiba7VzMgZFLdOffmJ8vW9M3JfwaASUryqlsxKXBK5YArEuuk9m7Cy1mKLN5rRwwr_S8CRYfsDRKaLm2KuJVk8dNbK5eJVwtSUOyRlzWy9_yiMEMjE3USUUX1OuWNTOCI4ZQ5NViveJPzUfFecpnscNbDy-sdWUEFnI9gRXNtkHC_18e_pkN19iWgNvW8BvYGg0qbTUiJI3ZZy994QlBkmUcg";

    @Test
    public void getCurrentUserProfile() {
        Response res = given()
                .header("accept", "application/json")
                .header("Authorization", "Bearer " + token)
                .when()
                .get("https://api.spotify.com/v1/me");
        res.prettyPrint();
        Assert.assertEquals(res.statusCode(), 200);
    }


    @Test
    public void getUserProfileByUsingId() {
        Response res = given()
                .header("accept", "application/json")
                .header("Authorization", "Bearer " + token)
                .when()
                .get("https://api.spotify.com/v1/users/31prsrcv35zht4ycrrekv26vp3bu");
        res.prettyPrint();
        Assert.assertEquals(res.statusCode(), 200);
    }

    @Test
    public void followPlaylist() {
        Response res = given()
                .header("accept", "application/json")
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)
                .when()
                .put("https://api.spotify.com/v1/playlists/37i9dQZF1DWZ2bQuX4pBHH/followers");
        res.prettyPrint();
        Assert.assertEquals(res.statusCode(), 200);
    }


    @Test
    public void followArtistOrUser() {
        Response res = given()
                .header("accept", "application/json")
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)

                .when()
                .put("https://api.spotify.com/v1/me/following?type=artist&ids=4HQeSXwG2BVH0KvxHE5oCf");
        res.prettyPrint();
        Assert.assertEquals(res.statusCode(), 204);
    }


    @Test
    public void getUserIfFollowsArtistOrUser() {
        Response res = given()
                .header("accept", "application/json")
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)
                .when()
                .get("https://api.spotify.com/v1/me/following/contains?type=artist&ids=4HQeSXwG2BVH0KvxHE5oCf");
        res.prettyPrint();
        Assert.assertEquals(res.statusCode(), 200);
    }

    @Test
    public void unfollowArtistOrUser() {
        Response res = given()
                .header("accept", "application/json")
                .header("Authorization", "Bearer " + token)
                .when()
                .delete("https://api.spotify.com/v1/me/following?type=artist&ids=2CIMQHirSU0MQqyYHq0eOx");
        res.prettyPrint();
        Assert.assertEquals(res.statusCode(), 204);
    }

    @Test
    public void UnfollowPlaylist() {
        Response res = given()
                .header("accept", "application/json")
                .header("Authorization", "Bearer " + token)
                .when()
                .delete("https://api.spotify.com/v1/playlists/37i9dQZF1DWZ2bQuX4pBHH/followers");
        res.prettyPrint();
        Assert.assertEquals(res.statusCode(), 200);
    }

    @Test
    public void getIfUserFollowsPlaylist() {
        Response res = given()
                .header("accept", "application/json")
                .header("Authorization", "Bearer " + token)
                .when()
                .get("https://api.spotify.com/v1/playlists/3cEYpjA9oz9GiPac4AsH4n/followers/contains?ids=jmperezperez,thelinmichael,wizzler");
        res.prettyPrint();
        Assert.assertEquals(res.statusCode(), 200);
    }

    @Test
    public void getFollowArtist() {
        Response res = given()
                .header("accept", "application/json")
                .header("Authorization", "Bearer " + token)
                .when()
                .get("https://api.spotify.com/v1/me/following?type=artist&after=0I2XqVXqHScXjHhk6AYYRe&limit=10");
        res.prettyPrint();
        Assert.assertEquals(res.statusCode(), 200);
    }
}
