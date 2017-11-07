package com.honghuaguoji.mypaydemo;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private WebSettings webSettings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        WebViewClient主要用来辅助WebView处理各种通知、请求等事件，通过setWebViewClient方法设置。
//
//        （1）更新历史记录
//
//        doUpdateVisitedHistory(WebView view, String url, boolean isReload)
//
//        （2）应用程序重新请求网页数据
//
//        onFormResubmission(WebView view, Message dontResend, Message resend)
//
//        （3）在加载页面资源时会调用，每一个资源（比如图片）的加载都会调用一次。
//
//        onLoadResource(WebView view, String url)
//
//        （4）开始载入页面调用，通常我们可以在这设定一个loading的页面，告诉用户程序在等待网络响应。
//
//        onPageStarted(WebView view, String url, Bitmap favicon)
//
//        （5）在页面加载结束时调用。同样道理，我们知道一个页面载入完成，于是我们可以关闭loading 条，切换程序动作。
//
//        onPageFinished(WebView view, String url)
//
//        （6）报告错误信息
//
//        onReceivedError(WebView view, int errorCode, String description, String failingUrl)
//
//        （7）获取返回信息授权请求
//
//        onReceivedHttpAuthRequest(WebView view, HttpAuthHandler handler, String host,String realm)
//
//        （8）重写此方法可以让webview处理https请求。
//
//        onReceivedSslError(WebView view, SslErrorHandler handler, SslError error)
//
//        （9）WebView发生改变时调用
//
//        onScaleChanged(WebView view, float oldScale, float newScale)
//
//        （10）Key事件未被加载时调用
//
//        onUnhandledKeyEvent(WebView view, KeyEvent event)
//
//        （11）重写此方法才能够处理在浏览器中的按键事件。
//
//        shouldOverrideKeyEvent(WebView view, KeyEvent event)
//
//        （12）在网页跳转时调用，这个函数我们可以做很多操作，比如我们读取到某些特殊的URL，于是就可以不打开地址，取消这个操作，进行预先定义的其他操作，这对一个程序是非常必要的。
//
//        shouldOverrideUrlLoading(WebView view, String url)
//
//        （13）在加载某个网页的资源的时候多次调用（已过时）
//
//        shouldInterceptRequest(WebView view, String url)
//
//        （14）在加载某个网页的资源的时候多次调用
//
//        shouldInterceptRequest(WebView view, WebResourceRequest request)
//
//        注意：
//
//        shouldOverrideUrlLoading在网页跳转的时候调用，且一般每跳转一次只调用一次。
//        shouldInterceptRequest只要是网页加载的过程中均会调用，资源加载的时候都会回调该方法，会多次调用。
//



//        WebChromeClient主要用来辅助WebView处理Javascript的对话框、网站图标、网站标题以及网页加载进度等。通过WebView的setWebChromeClient()方法设置。
//
//        （1）监听网页加载进度
//
//        onProgressChanged(WebView view, int newProgress)
//
//        （2）监听网页标题 : 比如百度页面的标题是“百度一下，你就知道”
//
//        onReceivedTitle(WebView view, String title)
//
//        （3）监听网页图标
//
//        onReceivedIcon(WebView view, Bitmap icon)


//        JS调java
//
//                配置Javascript接口
//
//        webView.addJavascriptInterface(new JSInterface (),"Android");
//
//        1
//        2
//
//        实现Javascript接口类
//
//        class JSInterface {
//            @JavascriptInterface
//            public void showToast(String arg){
//                Toast.makeText(MainActivity.this,arg,Toast.LENGTH_SHORT).show();
//            }
//        }
//        JS中调用java代码
//                <input type="button" value="点击Android被调用" onclick="window.Android.showToast('JS中传来的参数')"/>

//        支持缩放
//        settings.setSupportZoom(true);
//        设置支持缩放
//        settings.setBuiltInZoomControls(true);
//        支持内容重新布局
//        settings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
//        将图片调整到适合webview的大小
//        settings.setUseWideViewPort(false);
//        多窗口
//        settings.supportMultipleWindows();
//        设置可以访问文件
//        settings.setAllowFileAccess(true);
//        当webview调用requestFocus时为webview设置节点
//        settings.setNeedInitialFocus(true);
//        支持通过JS打开新窗口
//        settings.setJavaScriptCanOpenWindowsAutomatically(true);
//        缩放至屏幕的大小
//        settings.setLoadWithOverviewMode(true);
//        支持自动加载图片
//        settings.setLoadsImagesAutomatically(true);
//        .WebView硬件加速导致页面渲染闪烁问题
//        关于Android硬件加速 开始于Android 3.0 (API level 11),开启硬件加速后，WebView渲染页面更加快速，拖动也更加顺滑。但有个副作用就是容易会出现页面加载白块同时界面闪烁现象。解决这个问题的方法是设置WebView暂时关闭硬件加速 代码如下：
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
//            webview.setLayerType(View.LAYER_TYPE_SOFTWARE, null);
//        }

        // setAllowFileAccess 启用或禁止WebView访问文件数据
        // setBlockNetworkImage 是否显示网络图像
        // setBuiltInZoomControls 设置是否支持缩放
        // setDefaultFontSize 设置默认的字体大小
        // setDefaultTextEncodingName 设置在解码时使用的默认编码
        // setFixedFontFamily 设置固定使用的字体
        // setJavaScriptEnabled 设置是否支持JavaScript
        // setLayoutAlgorithm 设置布局方式
        // setLightTouchEnabled 设置用鼠标激活被选项
        // setSupportZoom 设置是否支持变焦
        // setUseWideViewPort 方法设置webview推荐使用的窗口。是否可任意比例缩放
        // setLoadWithOverviewMode 方法是设置webview加载的页面的模式。
        // setSavePassword
        // setSaveFormData 保存表单数据
        // setJavaScriptEnabled
        // setRenderPriority
        // setGeolocationEnabled 启用地理定位
        // setGeolocationDatabasePath 设置定位的数据库路径
        // setCacheMode 设置缓冲的模式
        // setDomStorageEnabled 开启 DOM storage API 功能
        // setDatabaseEnabled 开启 database storage API 功能
        // setDatabasePath 设置数据库缓存路径
        // webSettings.setAppCachePath 设置 Application Caches 缓存目录
        // webSettings.setAppCacheEnabled 开启 Application Caches 功能



        WebView webView = ((WebView) findViewById(R.id.webviewtest));
        //获取WebSettings对象
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
//        设置默认编码
        settings.setDefaultTextEncodingName("UTF-8");
        webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        webView.setWebChromeClient(new WebChromeClient());


        webSettings = webView.getSettings();




        webSettings.setLoadWithOverviewMode(true);
        //设置与支持JavaScript
        webSettings.setJavaScriptEnabled(true);
//        设置Application Caches缓存目录
        webSettings.setAppCacheEnabled(true);
//        设置缓存方式，主要有以下几种：
//        LOAD_CACHE_ONLY: 不使用网络，只读取本地缓存数据。
//        LOAD_DEFAULT: 根据cache-control决定是否从网络上取数据。
//        LOAD_CACHE_NORMAL: API level 17中已经废弃, 从API level 11开始作用同LOAD_DEFAULT模式。
//        LOAD_NO_CACHE: 不使用缓存，只从网络获取数据。
//        LOAD_CACHE_ELSE_NETWORK：只要本地有，无论是否过期，或者no-cache，都使用缓存中的数据。
        webSettings.setCacheMode(WebSettings.LOAD_DEFAULT);

        webView.setWebChromeClient(new WebChromeClient());
        webSettings.setPluginState(WebSettings.PluginState.ON);
        webSettings.setDefaultTextEncodingName("utf-8");
//        开启DOM storage API功能（HTML5 提供的一种标准的接口，主要将键值对存储在本地，在页面加载完毕后可以通过 JavaScript 来操作这些数据。）
        webSettings.setDomStorageEnabled(true);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            webSettings.setMixedContentMode(WebSettings.MIXED_CONTENT_ALWAYS_ALLOW);
        }

        webSettings.setAllowFileAccess(true);
//        设置数据库缓存路径
        webSettings.setDatabaseEnabled(true);
        webSettings.setGeolocationEnabled(true);
        webView.requestFocus();
        //打开网页时不调用系统浏览器， 而是在本WebView中显示
        webView.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {

                if (url.contains("weixin://wap/pay?")) {
                    Log.i("aaaa", "shouldOverrideUrlLoading: —————"+url);
                    Log.i("zhu","----weixin-------微信支付url--------------"+url);
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);

                    return true;
                }
                else {
                    //   return true;
                    return false;
                }
            }
        });
//        webView.loadUrl("http://p.oasiscare.cn/health/mobilefront/index.html?token=66cc7ff38e2caa340a2ef8c5d6e7edad");
        webView.loadUrl("http://p.oasiscare.cn/health/mobilefront/index.html?token=23f8b676cd1072aec7aae50afc54d023");










//        WebViewClient webViewClient = new WebViewClient() {
//            @Override
//            public boolean shouldOverrideUrlLoading(WebView view, String url) {
//                Log.i("zhu","--------url------------"+url);
//                // 如下方案可在非微信内部WebView的H5页面中调出微信支付
//                if (url.startsWith("weixin://wap/pay?")) {
//                    Log.i("zhu","--------url------------"+url);
//                    Intent intent = new Intent();
//                    intent.setAction(Intent.ACTION_VIEW);
//                    intent.setData(Uri.parse(url));
//                    startActivity(intent);
//                    return true;
//                } else {
//                    Map<String, String> extraHeaders = new HashMap<String, String>();
//                    extraHeaders.put("Referer", "http://wxpay.wxutil.com");
//                    view.loadUrl(url, extraHeaders);
//                }
//                return true;
//            }
//
//            @Override
//            public void onReceivedSslError(WebView view, SslErrorHandler handler, android.net.http.SslError error) { // 重写此方法可以让webview处理https请求
//                handler.proceed();
//            }
//        };
//        webView.setWebViewClient(webViewClient);
//        webView.loadUrl("http://wxpay.wxutil.com/mch/pay/h5.v2.php");
//        webView.loadUrl("http://p.oasiscare.cn/health/mobilefront/index.html?token=66cc7ff38e2caa340a2ef8c5d6e7edad");
//        webView.loadUrl("http://p.oasiscare.cn/health/mobilefront/html/app_pay.html?user_id=&goods_id=34&is_real=1");
//        webView.loadUrl("http://p.oasiscare.cn/health/mobilefront/html/success.html");









    }
}
