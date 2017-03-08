package com.android.retrofit.Service;

/**
 * Created by hp on 3/8/2017.
 */
public class RestBuilderPro {
    private static UserApi service;
    public static UserApi getService()
    {
        service=ServiceGeneratorpro.createService(UserApi.class);
        return service;
    }
}
