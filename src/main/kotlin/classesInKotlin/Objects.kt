package org.example.classesInKotlin

//oject declaration
object Game {
    init {
        println("I am getting created")
    }
}

//object expression
val abandonedTownSquare = object : TownSquare("The Abandoned town Square") {
    override fun enterRoom() {
        println("There no one")
    }
}