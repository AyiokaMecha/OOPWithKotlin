package org.example.classesInKotlin


class Human(
    name: String,
    val homeTown: String,
    var healthPoints: Int
) {
    var name = name
        get() = field.replaceFirstChar { it.uppercase() }
        set(value) {
            field = value.trim()
        }

    init {
        require(healthPoints > 0) { "Health points must be greater that zero" }
        require(name.isNotBlank()) { "You must have a name" }
    }

    //Lazy initializations you won't be around until I need you
    val prophecy by lazy {
        "Won't stop can't stop that's me"
    }

    constructor(name: String, homeTown: String): this(
    name = name,
        homeTown = homeTown,
        healthPoints = 100
    )


    val weapon: Weapon? = Weapon("Humility")
    fun printWeaponName() {
//        if(weapon != null){
//            println(weapon.name)
//        }
        weapon?.let {
            it -> println(it.name)
        }
    }
}

data class Weapon(val name: String)