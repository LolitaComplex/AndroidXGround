package com.doing.androidxground.router

import android.content.Context
import android.util.Log
import com.alibaba.android.arouter.facade.Postcard
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.facade.service.DegradeService

@Route(path = "/service/DegradeService")
class DegradeServiceImpl : DegradeService {

    override fun init(context: Context) {
        Log.v("Doing", "DegradeServiceImpl: init")
    }

    override fun onLost(context: Context, postcard: Postcard?) {
        Log.v("Doing", "DegradeServiceImpl: onLost $postcard")
    }

}