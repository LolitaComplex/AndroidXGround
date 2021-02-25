package com.doing.androidxground.router

import android.content.Context
import android.util.Log
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.facade.service.SerializationService
import com.google.gson.GsonBuilder
import java.lang.reflect.Type

@Route(path = "/serialization/json/JsonTransform")
class JsonTransform : SerializationService {

    private val mGson = GsonBuilder().create()

    override fun init(context: Context) {
        Log.v("Doing", "JsonTransform: init")
    }

    override fun <T : Any?> json2Object(input: String?, clazz: Class<T>?): T {
        Log.v("Doing", "JsonTransform: json2Object")
        return mGson.fromJson(input, clazz)
    }

    override fun object2Json(instance: Any?): String {
        Log.v("Doing", "JsonTransform: object2Json")
        return mGson.toJson(instance)
    }

    override fun <T : Any?> parseObject(input: String?, clazz: Type?): T {
        Log.v("Doing", "JsonTransform: parseObject")
        return mGson.fromJson(input, clazz)
    }
}