package com.example.benawad.walkthroughretrofitlol;


import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Path;
import retrofit.http.Query;

public interface Riot {

    @GET("/api/lol/na/v1.4/summoner/by-name/{summonerName}")
    void getSummonerId(
            @Path("summonerName") String summonerName,
            @Query("api_key") String apiKey,
            Callback<Summoner> cb
    );

    @GET("/api/lol/na/v1.3/stats/by-summoner/{sumId}/ranked")
    void getRankedStats(
            @Path("sumId") String sumId,
            @Query("api_key") String apiKey,
            Callback<Champions> cb
    );

}
