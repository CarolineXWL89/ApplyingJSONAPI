package com.example.caroline.applyingjsonapi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private CryptocurrencyAdapter cryptocurrencyAdapter;
    private List<Cryptocurrency> cryptocurrencies;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(DataMuse.baseURL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        //instantiate an API
        DataMuse api = retrofit.create(DataMuse.class);

        Call<List<Cryptocurrency>> call = api.getNumInfosRanked(10);

        call.enqueue(new Callback<List<Cryptocurrency>>() {
            @Override
            public void onResponse(Call<List<Cryptocurrency>> call, Response<List<Cryptocurrency>> response) {
                cryptocurrencies.clear();
            }

            @Override
            public void onFailure(Call<List<Cryptocurrency>> call, Throwable t) {

            }
        });

        /*
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(DataMuseAPI.baseURL) //put the baseURL there in interface so we don't have to remember it
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        //instantiate an API
        DataMuseAPI api = retrofit.create(DataMuseAPI.class); //parameter is name of interface we used

        Call<List<WordObject>> call = api.getSoundsLike("success");
         */
    }
}
