package com.example.a5m2hwlocecalculator

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

//url: 'https://love-calculator.p.rapidapi.com/getPercentage',
//params: {sname: 'Alice', fname: 'John'},
//headers: {
//'X-RapidAPI-Key': '15e9d93c13msh3ba3acd5f7aba0dp19c3b7jsn6aba108e20a9',
//    'X-RapidAPI-Host': 'love-calculator.p.rapidapi.com'

interface CalculatorApi {

    @GET("getPercentage")
    fun getPercentage(
        @Query("sname") secondName: String,
        @Query("fname") firstName: String,
        @Header("X-RapidAPI-Key") key:String = "15e9d93c13msh3ba3acd5f7aba0dp19c3b7jsn6aba108e20a9",
        @Header("X-RapidAPI-Host") host:String = "love-calculator.p.rapidapi.com"
    ):  Call<CalculateModel>
}