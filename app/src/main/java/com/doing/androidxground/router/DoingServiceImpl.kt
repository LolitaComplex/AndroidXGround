package com.doing.androidxground.router

import android.content.Context
import com.alibaba.android.arouter.facade.annotation.Route

@Route(path = "/service/DoingService")
class DoingServiceImpl : DoingService {

    override fun sayHello(name: String): String {
        return "$name say hello"
    }

    override fun init(context: Context) {

    }
}