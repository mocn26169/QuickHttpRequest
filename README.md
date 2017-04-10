# QuickHttpRequest

请求链接：

```
http://blog.csdn.net/iromkoear?viewmode=contents
```

使用方式：

1、在MainActivity里面修改服务器地址
```
 /**
     * 服务器地址(请手动修改1)
     */
    public static String BASEURL = "http://blog.csdn.net/";
```

2、在MainActivity里面修改参数对象
```
 /**
     * 请求的参数实体(请手动修改2)
     */
    public class MyParams {
        /**
         * 参数
         */
        public String viewmode;
    }
```

3、在IHttpInfo里面修改接口参数
```
  /**
     * 接口参数(请手动修改3)
     */
    @POST("/iromkoear")
    Call<String> getResult(@Query("viewmode") String viewmode);
```
