package com.sample.api.kazuhiro.apisample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.webkit.JavascriptInterface

import javax.inject.Inject

import javax.inject.Singleton

import dagger.Component

class MainActivity : AppCompatActivity() {

    private var coffeeShop: CoffeeShop? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        coffeeShop = DaggerMainActivity_CoffeeShop.builder()
                .dripCoffeeModule(DripCoffeeModule())
                .build()

        coffeeShop!!.open().drip()

        val customerComponent = coffeeShop!!.customerBuilder().build()

        var customer = customerComponent.enter()

        println("客が入店しました")
        System.out.println(customer!!.login())

        println("客が退出しました。")
//        customer = null


    }

    @Singleton
    @Component(modules = arrayOf(DripCoffeeModule::class, HogeModule::class))
    internal interface CoffeeShop {
        fun open(): CoffeeMaker
        fun customerBuilder(): CustomerComponent.Builder

    }


}
