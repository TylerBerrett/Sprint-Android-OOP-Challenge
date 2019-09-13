package com.example.oppsprint.presenter

import com.example.oppsprint.model.Civilizations
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

object CivilizationsObject :Callback<Civilizations> {
    override fun onFailure(call: Call<Civilizations>, t: Throwable) {
        println(t)
    }

    override fun onResponse(
        call: Call<Civilizations>,
        response: Response<Civilizations>
    ) {
        if (response.isSuccessful){
            val list = response.body()?.civilizations
            list?.forEach {
                println(it.getNameOfItem())
            }

        } else {
            println("almost")
        }
    }

}
