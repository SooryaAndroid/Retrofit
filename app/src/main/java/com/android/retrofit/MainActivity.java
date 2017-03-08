package com.android.retrofit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.android.retrofit.Service.Example;
import com.android.retrofit.Service.RestBuilderPro;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        RestBuilderPro.getService().authenticate("rashik@gmail.com","123456").enqueue(new Callback<Example>() {
            @Override
            public void onResponse(Call<Example> call, Response<Example> response) {

                Example example=response.body();
                    String msg=example.getMsg();
                Log.d("msg",msg);


            }

            @Override
            public void onFailure(Call<Example> call, Throwable t) {

            }
        });

    }
}
