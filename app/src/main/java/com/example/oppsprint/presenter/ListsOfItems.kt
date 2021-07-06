package com.example.oppsprint.presenter

import com.example.oppsprint.model.Civilization
import com.example.oppsprint.model.Item
import com.example.oppsprint.model.Unit

object ListsOfItems{
    val hashMap: MutableMap<String, Item> = HashMap()

    val fakeUnitOne = Unit("kevin", "FireBall")
    val fakeUnitTwo = Unit("kevinTwo", "FireBallTwo")
    val fakeCivilizationOne = Civilization("bob", "naruto runners")
    val fakeCivilizationTwo = Civilization("bobTwo", "kyle's")

    val list = arrayListOf<Item>(
        fakeUnitOne,
        fakeUnitTwo,
        fakeCivilizationOne,
        fakeCivilizationTwo
    )





    init {
        list.forEach {
            hashMap[it.name] = it
        }
    }

}