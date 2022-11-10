package com.example.a5m2hwlocecalculator

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel:ViewModel() {
    val repository = Repository()

    fun getRequest(firstName: String, secondName: String):LiveData<CalculateModel>{
        return repository.getRequest(firstName, secondName)
    }
}