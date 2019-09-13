package com.example.oppsprint

import com.example.oppsprint.model.Civilizations
import com.example.oppsprint.presenter.ListsOfItems
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
            val list = response.body()!!.civilizations
            for (i in 0..2) {
                ListsOfItems.list.add(list[i])
            }

        } else {
            println("almost")
        }
    }

}
