package org.example.classesInKotlin

enum class Directions(private val directionCoordinate: Coordinate) {
    North(Coordinate(0,1)),
    East(Coordinate(1, 0)),
    South(Coordinate(0, -1)),
    West(Coordinate(-1, 0));
    fun updateCoordinate(coordinate: Coordinate) = coordinate + directionCoordinate
//        Coordinate(
//            x = coordinate.x + directionCoordinate.x,
//            y = coordinate.y + directionCoordinate.y
//        )
}

data class Coordinate(val x:Int, val y: Int) {
    operator fun plus(other: Coordinate) = Coordinate(x + other.x, y + other.y)
}
