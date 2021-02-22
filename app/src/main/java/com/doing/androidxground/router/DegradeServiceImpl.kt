package com.doing.androidxground.router

import android.content.Context
import com.alibaba.android.arouter.facade.Postcard
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.facade.service.DegradeService

@Route(path = "/service/DegradeService")
class DegradeServiceImpl : DegradeService {

    override fun init(context: Context) {

    }

    override fun onLost(context: Context, postcard: Postcard?) {

    }

}