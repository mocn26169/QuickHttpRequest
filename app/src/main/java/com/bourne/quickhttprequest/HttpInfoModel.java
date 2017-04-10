package com.bourne.quickhttprequest;

import android.content.Context;

/**
 * 网络请求单例
 */
public class HttpInfoModel {
    private static HttpInfoModel famousInfoModel;
    private IHttpInfo mIHttpInfo;


    public HttpInfoModel(Context context) {
        mIHttpInfo = RetrofitWrapper.getInstance(MainActivity.BASEURL).create(IHttpInfo.class);
    }

    public static HttpInfoModel getInstance(Context context) {
        if (famousInfoModel == null) {
            famousInfoModel = new HttpInfoModel(context);
        }
        return famousInfoModel;
    }

    public IHttpInfo getIHttpInfo() {
        return mIHttpInfo;
    }

}
