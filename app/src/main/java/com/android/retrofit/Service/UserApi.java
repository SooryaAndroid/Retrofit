package com.android.retrofit.Service;

/**
 * Created by hp on 3/8/2017.
 */
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Multipart;
import retrofit2.http.POST;



public interface UserApi {


  @POST("loginrequest?/")
  @FormUrlEncoded
  Call<Example> authenticate
          (@Field("email") String email,
          @Field("password") String password
           );

}
