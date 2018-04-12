package com.sample.api.kazuhiro.apisample

import javax.inject.Inject

/**
 * Created by ryosuke on 2018/02/13.
 */

class Thermosiphon @Inject
internal constructor(private val heater: Heater) : Pump {

    override fun pumping() {
        if (heater.isHot) {
            println("pumping")
        }
    }

}
