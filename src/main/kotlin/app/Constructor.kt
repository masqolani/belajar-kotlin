package app

import app.entity.Car

/**
 * constructor access
 */
fun main() {
    val avanza = Car("Toyota")
    val almaz = Car("Wuling", 2021)

    println("${avanza.brand} - ${avanza.year}")
    println("${almaz.brand} - ${almaz.year}")
}