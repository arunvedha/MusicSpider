package com.example.android.musicspider;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private RecyclerAdapter adapter;
    private List<Track> tracks;
    private ApiInterface apiInterface;
    private static final String API_KEY = "1078558f9e52bc62f807b36f322bdd91";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (API_KEY.isEmpty()) {
            Toast.makeText(getApplicationContext(), "Please obtain your API KEY first ", Toast.LENGTH_LONG).show();
            return;
        }

        recyclerView = (RecyclerView)findViewById(R.id.RecycleView);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);

        apiInterface = ApiClient.getClient().create(ApiInterface.class);
        Call<List<Track>> call = apiInterface.getTrack(API_KEY);
        call.enqueue(new Callback<List<Track>>() {
            @Override
            public void onResponse(Call<List<Track>> call, Response<List<Track>> response) {
                tracks = response.body();
                adapter = new RecyclerAdapter(tracks);
                recyclerView.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<List<Track>> call, Throwable t) {

            }
        });

    }
}
