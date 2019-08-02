package com.thangnc.l5chatter.api;

import com.thangnc.l5chatter.model.Messenger;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {
    @GET("comments")
    Call<List<Messenger>> getMessenger(@Query("page")int page, @Query("per_page")int per_page);
}
