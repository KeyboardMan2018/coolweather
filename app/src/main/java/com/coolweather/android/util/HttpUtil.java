package com.coolweather.android.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by yujianzhong on 2018/6/21.
 */
public class HttpUtil {
    /**
     * 使用okhttp发送http请求
     * @param address 请求地址
     * @param callback 响应回调对象
     */
    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
