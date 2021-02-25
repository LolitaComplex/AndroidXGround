package com.doing.androidxground.router

import android.content.Context
import android.net.Uri
import android.util.Log
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.facade.service.PathReplaceService

@Route(path = "/service/PathReplaceService")
class PathReplaceServiceImpl : PathReplaceService {

    override fun init(context: Context) {
        Log.v("Doing", "PathReplaceServiceImpl: init")
    }

    override fun forString(path: String): String {
        Log.v("Doing", "PathReplaceServiceImpl: forString: $path")
        if (path == "xxx") {
            return "redirect path"
        }
        return path
    }

    override fun forUri(uri: Uri?): Uri? {
        Log.v("Doing", "PathReplaceServiceImpl: forUri: ${uri.toString()}")
        return uri
    }
}