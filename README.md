# Retrofit

###gradle dependencies
```gradle
compile 'com.squareup.retrofit2:retrofit:2.1.0'
compile 'com.squareup.retrofit2:converter-gson:2.1.0'
compile 'com.google.code.gson:gson:2.8.0'
```

###Java code
```java

        RestBuilderPro.getService().authenticate("example@gmail.com","123456").enqueue(new Callback<Example>() {
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
```
