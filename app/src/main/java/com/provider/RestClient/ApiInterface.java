package com.provider.RestClient;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;


public interface ApiInterface {
    @GET("movie/top_rated")
    Call<ResponseBody> getTopRatedMovies(@Path("api_key") String apiKey);

}