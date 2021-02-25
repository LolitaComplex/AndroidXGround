package com.doing.androidxground.model

data class UserModel(val sex: String, val age: Int) {
    override fun toString(): String {
        return "UserModel: {sex: $sex, age: $age}"
    }
}
