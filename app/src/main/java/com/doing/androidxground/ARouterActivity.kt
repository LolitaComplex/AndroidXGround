package com.doing.androidxground

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.alibaba.android.arouter.facade.annotation.Autowired
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter
import com.doing.androidxground.model.UserModel

@Route(path = "/activity/ARouterActivity")
class ARouterActivity : AppCompatActivity() {

    @JvmField
    @Autowired
    var uid: Int = -1

    @JvmField
    @Autowired
    var username: String? = null

    @JvmField
    @Autowired
    var user: UserModel? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        ARouter.getInstance().inject(this)

        setContentView(R.layout.activity_login)

        Log.d("Doing", "ARouterActivity: uid: $uid name: $username user: $user")
    }
}