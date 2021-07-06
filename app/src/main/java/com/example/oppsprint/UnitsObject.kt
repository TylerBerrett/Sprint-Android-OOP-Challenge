package com.example.oppsprint

import com.example.oppsprint.model.Units
import com.example.oppsprint.presenter.ListsOfItems
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

object UnitsObject :Callback<Units> {
    override fun onFailure(call: Call<Units>, t: Throwable) {
        println(t)
    }

    override fun onResponse(
        call: Call<Units>,
        response: Response<Units>
    ) {
        if (response.isSuccessful){
            val list = response.body()!!.units
            for (i in 0..2) {
                ListsOfItems.list.add(list[i])
            }

        } else {
            println("almost")
        }
    }

}
