package com.doing.androidxground.router

import com.alibaba.android.arouter.facade.template.IProvider

interface DoingService : IProvider {

    fun sayHello(name: String): String
}