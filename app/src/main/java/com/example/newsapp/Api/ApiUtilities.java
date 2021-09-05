package com.example.newsapp.Api;

import static com.example.newsapp.Api.ApiInterface.BASE_URL;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiUtilities {

    private static Retrofit retrofit = null;


    public static ApiInterface getApiInterface()
    {
        if(retrofit== null)
        {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }

        return retrofit.create(ApiInterface.class);
    }


}
