package com.demo.mvvm.http;

import com.demo.mvvm.bean.NewsBean;

import okhttp3.RequestBody;
import retrofit2.http.Body;
import retrofit2.http.POST;
import rx.Observable;

/**
 * @author yayun.xia.
 * @class IHttpRequest.java
 * @explain 存放请求api
 * @create time 2020/9/27 14:42.
 */
public interface IHttpRequest {
    @POST("/app/news")
    Observable<NewsBean> postNews(@Body RequestBody body);
}
