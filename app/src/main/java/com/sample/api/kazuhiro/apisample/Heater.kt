package com.sample.api.kazuhiro.apisample

import javax.inject.Inject

/**
 * Created by ryosuke on 2018/02/12.
 */

open class Heater @Inject constructor() {

    var isHot: Boolean = false

    fun heating() {
        isHot = true
        println("heating")
    }
}