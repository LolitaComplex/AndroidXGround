package com.doing.androidxground.router

import android.content.Context
import android.util.Log
import com.alibaba.android.arouter.facade.Postcard
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.facade.service.PretreatmentService

//@Route(path = "/service/PretreatmentService")
//class PretreatmentServiceImpl : PretreatmentService {
//
//    override fun init(context: Context) {
//        Log.v("Doing", "PretreatmentServiceImpl init:")
//
//    }
//
//    override fun onPretreatment(context: Context, postcard: Postcard): Boolean {
//        Log.v("Doing", "PretreatmentServiceImpl onPretreatment: $postcard")
//        if (postcard.path.contains("xxx")) {
//            return false // 跳转前的预处理，这表示要自定义操作
//        }
//        return true
//    }
//}