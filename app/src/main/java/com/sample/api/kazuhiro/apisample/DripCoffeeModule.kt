package com.sample.api.kazuhiro.apisample

import javax.inject.Inject
import javax.inject.Singleton

import dagger.Module
import dagger.Provides

/**
 * Created by ryosuke on 2018/02/13.
 */
@Module
internal class DripCoffeeModule {

    @Provides
    fun providePump(pump: Thermosiphon): Pump {
        return pump
    }

    @Singleton
    @Provides
    fun provideHeater(): Heater {
        return ElectricHeater()
    }
}

