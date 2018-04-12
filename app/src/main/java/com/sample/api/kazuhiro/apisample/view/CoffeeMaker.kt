package com.sample.api.kazuhiro.apisample.view

import javax.inject.Inject

class CoffeeMaker @Inject constructor() {

    @Inject private lateinit var heater: Heater
    @Inject private lateinit var pump: Pump

    fun drip () {
        heater.heating()
        pump.pumping()
        println("Complete!")
    }
}