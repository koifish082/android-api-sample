package com.sample.api.kazuhiro.apisample.view

import javax.inject.Inject

class Pump @Inject constructor(var heater: Heater) {
    fun pumping() {
        println("pumping")
    }
}