package com.example.oppsprint.model

import java.io.Serializable

abstract class Resources{
    abstract fun <T> getList(): List<T>
}

abstract class Item(val name: String)





class Civilizations(val civilizations: List<Civilization>)/* : Resources(){
    override fun <T> getList(): List<T> {
        return this.civilizations
    }

}*/
class Civilization(name: String, val army_type: String, val isFavorite: Boolean = false): Item(name)

class Units(val units: List<Unit>)

class Unit(name: String, val attack: String) :Item(name)