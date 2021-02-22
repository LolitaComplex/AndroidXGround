package com.doing.androidxground

import android.app.Application
import com.alibaba.android.arouter.launcher.ARouter

class AndroidXApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        ARouter.openDebug()
        ARouter.openLog()

        ARouter.init(this)
    }

}