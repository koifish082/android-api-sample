package com.sample.api.kazuhiro.apisample.view

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.sample.api.kazuhiro.apisample.R
import dagger.Component

class MainActivity(private var coffeeShop: CoffeeShop) : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        coffeeShop = DaggerMainActivity_CoffeeShop.create()
//        coffeeShop.maker().drip()
    }

    @Component
    interface CoffeeShop {
        fun maker(): CoffeeMaker
    }

}
