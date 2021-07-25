package app

import app.entity.Person

/**
 * Object access
 */
fun main() {
    val personAsqo = Person()
    personAsqo.firstName = "Asqo"
    personAsqo.middleName = "Lani"
    personAsqo.lastName = "Muhammad"

    println(personAsqo.firstName)
    println(personAsqo.middleName)
    println(personAsqo.lastName)
}