package com.bourne.quickhttprequest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    /**
     * Log标志
     */
    private  String TAG;

    /**
     * 服务器地址(请手动修改)
     */
    public  static String BASEURL="http://blog.csdn.net/";

    /**
     * 网络请求
     */
    private HttpInfoModel httpInfoModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TAG = getLocalClassName();
        //初始化网络请求
        httpInfoModel = HttpInfoModel.getInstance(this);
    }

    /**
     * 请求的参数实体(请手动修改)
     */
    public class MyParams {
        /**
         * 参数
         */
        public String viewmode;

    }

    /**
     * 开始请求
     */
    public void startHttpRequest(View view) {

        MyParams myParams = null;
        myParams = new MyParams();
        myParams.viewmode ="contents";

        Call<String > infoCall = httpInfoModel.getIHttpInfo().getResult(myParams.viewmode);

        infoCall.enqueue(new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {
                String result = response.body().trim();
                Log.i(TAG, "请求成功！结果如下：");
                Log.i(TAG,  result);
            }

            @Override
            public void onFailure(Call<String> call, Throwable t) {
                Log.i(TAG, "请求失败！");
            }
        });
    }

}
