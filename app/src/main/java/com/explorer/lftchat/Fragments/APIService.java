package com.explorer.lftchat.Fragments;

import com.explorer.lftchat.Notifications.MyResponse;
import com.explorer.lftchat.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAqMA4Bjo:APA91bH6GB9YLU6zkz6VHQK0SGNSH2G1qxL8eS8JQBCP86WLlwr_bffNNQ5M5Ya5XSH-8K6UjDFcn1NhbglU4C5xVkG8Sgt5BCKoIL2jDyNmCDX2PsHCs-zLi01I3PIPXHWPgCxLgYnN"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
