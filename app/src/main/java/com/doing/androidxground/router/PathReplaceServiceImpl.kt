package com.doing.androidxground.router

import android.content.Context
import android.net.Uri
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.facade.service.PathReplaceService

@Route(path = "/service/PathReplaceService")
class PathReplaceServiceImpl : PathReplaceService {

    override fun init(context: Context) {
    }

    override fun forString(path: String): String {
        if (path == "xxx") {
            return "redirect path"
        }
        return path
    }

    override fun forUri(uri: Uri?): Uri? {
        return uri
    }
}