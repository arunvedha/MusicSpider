package com.example.android.musicspider;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public abstract class ApiInterface {
    @GET("movie/top_rated")
    abstract Call<List<Track>> getTrack(@Query("api_key") String apikey);
}
