package com.example.oppsprint.presenter

import com.example.oppsprint.model.Civilizations
import com.example.oppsprint.model.Units
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

object RetroFit {

    private const val BASE_URL = "https://age-of-empires-2-api.herokuapp.com/api/v1/"

    val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(MoshiConverterFactory.create())
        .build()

    fun getCivilizations(): Call<Civilizations> {
        return retrofit.create(GetApi::class.java).getCivilization()
    }

    fun getUnits(): Call<Units> {
        return retrofit.create(GetApi::class.java).getUnit()
    }
}