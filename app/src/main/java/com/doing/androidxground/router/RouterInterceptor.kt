package com.doing.androidxground.router

import android.content.Context
import android.util.Log
import com.alibaba.android.arouter.facade.Postcard
import com.alibaba.android.arouter.facade.annotation.Interceptor
import com.alibaba.android.arouter.facade.callback.InterceptorCallback
import com.alibaba.android.arouter.facade.template.IInterceptor

@Interceptor(name = "拦截测试", priority = 10)
class RouterInterceptor : IInterceptor {

    override fun init(context: Context) {

    }

    override fun process(postcard: Postcard, callback: InterceptorCallback) {
        val path = postcard.path
        Log.v("Doing", "RouterInterceptor process path: $path")
        if (path.contains("xx")) {
            // Do something
            callback.onInterrupt(Exception("自定义异常"))
            return
        }

        callback.onContinue(postcard) // 继续
    }
}