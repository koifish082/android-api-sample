package com.sample.api.kazuhiro.apisample

import javax.inject.Inject

/**
 * Created by ryosuke on 2018/02/14.
 */

class Customer @Inject
constructor() {

    internal var id: Long = 0
    internal var isLogin: Boolean? = false

    fun id(): Long {
        return id
    }

    fun login(): String {
        if (isLogin!!) {
            return "loginしています"
        }

        isLogin = true
        return "loginしました"
    }
}
