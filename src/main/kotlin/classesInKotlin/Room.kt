package org.example.classesInKotlin


//to make a class open to subclassing we have to mark it with the open keyword
open class Room(val name: String) {

    protected open val status = "Calm"
    fun description() = name
    open fun enterRoom() {
        println("There is nothing to do here")
    }
}

open class TownSquare(desp: String): Room(desp) {
    override val status = "Ecstatic"
    override fun enterRoom() {
        println("And the crowd goes wild")
    }
}