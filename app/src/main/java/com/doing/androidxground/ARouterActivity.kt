package com.doing.androidxground

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.alibaba.android.arouter.facade.annotation.Autowired
import com.alibaba.android.arouter.facade.annotation.Route

@Route(path = "/activity/ARouterActivity")
class ARouterActivity : AppCompatActivity() {

    @Autowired(name = "deviceId")
    var uid: Int = -1

    @Autowired(name = "username")
    var name: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_login)
    }
}