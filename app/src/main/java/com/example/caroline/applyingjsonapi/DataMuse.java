package com.example.caroline.applyingjsonapi;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by princ on 17/01/2018.
 */

public interface DataMuse {

    String baseURL = "https://api.coinmarketcap.com/v1/ticker/";

    @GET("limits")
    Call<List<Cryptocurrency>> getNumInfosRanked(@Query("limit=") int numShown);
}

