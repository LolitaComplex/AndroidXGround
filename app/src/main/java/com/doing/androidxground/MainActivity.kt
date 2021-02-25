package com.doing.androidxground

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.alibaba.android.arouter.facade.Postcard
import com.alibaba.android.arouter.facade.callback.NavigationCallback
import com.alibaba.android.arouter.launcher.ARouter
import com.doing.androidxground.model.UserModel

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.mBtnARouterTest).setOnClickListener {
            ARouter.getInstance().build("/activity/ARouterActivity")
                .withInt("uid", 12345)
                .withString("username", "MadProgrammer")
                .withObject("user", UserModel("male", 28))
                .navigation(this, object : NavigationCallback {

                    // 匹配成功
                    override fun onFound(postcard: Postcard) {
                        Log.d("Doing", "onFound: $postcard")
                    }

                    // 匹配失败
                    override fun onLost(postcard: Postcard) {
                        Log.d("Doing", "onLost: $postcard")
                    }


                    // 路由成功
                    override fun onArrival(postcard: Postcard) {
                        Log.d("Doing", "onArrival: $postcard")
                    }

                    // 路由挂了
                    override fun onInterrupt(postcard: Postcard) {
                        Log.d("Doing", "onInterrupt: $postcard")
                    }
                })
        }
    }
}