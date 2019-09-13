package com.example.oppsprint.model

import java.io.Serializable

abstract class Resources{
    abstract fun <T> getList(): List<T>
}

abstract class Item{
    abstract fun getNameOfItem(): String
    abstract fun isFavoriteItem(): Boolean
}

interface CivilizationSpecial{
    fun armyType(): String
}



class Civilizations(val civilizations: List<Civilization>)/* : Resources(){
    override fun <T> getList(): List<T> {
        return this.civilizations
    }

}*/
class Civilization(val name: String, val army_type: String, val isFavorite: Boolean = false): Item(), CivilizationSpecial{
    override fun armyType(): String {
        return this.army_type
    }

    override fun getNameOfItem(): String {
        return this.name
    }

    override fun isFavoriteItem(): Boolean {
        return this.isFavorite
    }

}



class Units(val units: List<Unit>)

class Unit(val name: String, val attack: String)