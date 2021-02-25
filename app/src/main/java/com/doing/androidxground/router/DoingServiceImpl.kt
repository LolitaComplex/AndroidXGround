package com.doing.androidxground.router

import android.content.Context
import android.util.Log
import com.alibaba.android.arouter.facade.annotation.Route

@Route(path = "/service/DoingService")
class DoingServiceImpl : DoingService {

    override fun sayHello(name: String): String {
        Log.v("Doing", "DoingServiceImpl: sayHello")
        return "$name say hello"
    }

    override fun init(context: Context) {
        Log.v("Doing", "DoingServiceImpl: init")
    }
}