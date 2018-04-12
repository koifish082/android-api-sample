package com.sample.api.kazuhiro.apisample

import javax.inject.Inject

/**
 * Created by ryosuke on 2018/02/13.
 */

class CoffeeMaker @Inject
internal constructor() {


    @Inject
    internal var heater: Heater? = null
    @Inject
    internal var pump: Pump? = null

    fun drip() {
        heater!!.heating()
        pump!!.pumping()
        println("Complete!")
    }

}
