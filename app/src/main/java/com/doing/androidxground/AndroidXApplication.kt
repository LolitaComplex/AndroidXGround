package com.doing.androidxground

import android.app.Application
import android.util.Log
import com.alibaba.android.arouter.launcher.ARouter

class AndroidXApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        ARouter.openDebug()
        ARouter.openLog()

        val start = System.currentTimeMillis()
        ARouter.init(this)
        val end = System.currentTimeMillis()
        Log.w("Doing", "ARouter.init: ${end -start} ms")
    }

}