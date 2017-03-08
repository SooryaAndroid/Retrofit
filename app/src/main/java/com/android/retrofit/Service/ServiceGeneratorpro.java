package com.android.retrofit.Service;

/**
 * Created by hp on 3/8/2017.
 */

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by hp on 2/20/2017.
 */

public class ServiceGeneratorpro {

    private final static String BASEURL="http://45.33.43.51/psc_project/public/";

    public static<S> S createService(Class<S> service){
        Gson gson= new GsonBuilder()
                .setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ")
                .create();

        Retrofit adapter=new Retrofit.Builder()
                .baseUrl(BASEURL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
        return adapter.create(service);
    }
}
