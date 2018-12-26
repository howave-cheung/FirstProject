package com.bobo.hyzn.firstproject;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface DouBangService {
    @GET("book/{id}")
    Call<JavaBean> getDouBang (@Path("id") int id);
}
