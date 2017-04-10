package com.bourne.quickhttprequest;


import retrofit2.Call;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * 请求参数接口
 */
public interface IHttpInfo {

    //(请手动修改)
    @POST("/iromkoear")
    Call<String> getResult(@Query("viewmode") String viewmode);
}
