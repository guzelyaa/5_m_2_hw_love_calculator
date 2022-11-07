package com.example.a5m2hwlocecalculator

import android.app.Application

class App:Application() {

    companion object{
        lateinit var api:CalculatorApi
    }

    override fun onCreate() {
        super.onCreate()
        val retrofit = RetrofitService()
        api = retrofit.getApi()
    }
}