package com.example.logonrm.notepadshiftapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private Retrofit getRetrofit(){
        return new Retrofit.Builder()
                .baseUrl("https://notepadcloudiasj.herokuapp.com")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
}
