package com.sample.api.kazuhiro.apisample.view

import javax.inject.Inject

class Heater @Inject constructor() {

    var isHot: Boolean = false

    fun heating() {
        isHot = true
        println("heating")
    }
}