package com.example.oppsprint.presenter

import com.example.oppsprint.model.Civilizations
import com.example.oppsprint.model.Units
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface GetApi {

    @GET("civilizations")
    fun getCivilization(): Call<Civilizations>

    @GET("units")
    fun getUnit(): Call<Units>



}