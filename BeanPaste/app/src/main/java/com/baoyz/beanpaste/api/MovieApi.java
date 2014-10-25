package com.baoyz.beanpaste.api;

import com.baoyz.beanpaste.model.Movie;
import com.baoyz.beanpaste.model.Top250;

import java.util.List;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Path;

/**
 * Created by baoyz on 14-10-19.
 */
public interface MovieApi {

    @GET("/top250")
    void getTop250(Callback<Top250> callback);

    @GET("/us_box")
    void getUSBox(Callback<Top250> callback);

    @GET("/subject/{id}")
    void getMoive(@Path("id") String id, Callback<Movie> callback);

}
