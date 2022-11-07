package com.example.a5m2hwlocecalculator

import com.google.gson.annotations.SerializedName

//fname:"John"
//sname:"Alice"
//percentage:"46"
//result:"Can choose someone better."
data class CalculateModel(
    @SerializedName("fname")
    val firstName: String,
    @SerializedName("sname")
    val secondName: String,
    val percentage: String,
    val result: String,
)
