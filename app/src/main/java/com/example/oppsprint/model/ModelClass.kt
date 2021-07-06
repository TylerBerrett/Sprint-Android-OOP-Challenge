package com.example.oppsprint.model

import java.io.Serializable

abstract class Resources{
    abstract fun <T> getList(): List<T>
}

abstract class Item(val name: String, var isFavorite: Boolean)





class Civilizations(val civilizations: List<Civilization>)/* : Resources(){
    override fun <T> getList(): List<T> {
        return this.civilizations
    }

}*/
class Civilization(name: String, val army_type: String, isFavorite: Boolean = false): Item(name, isFavorite)

class Units(val units: List<Unit>)

class Unit(name: String, val attack: String, isFavorite: Boolean = false) :Item(name, isFavorite)