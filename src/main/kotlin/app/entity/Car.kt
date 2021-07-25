package app.entity

/**
 * Constructor entity example
 */
class Car(brand: String, year: Int = 2020) {

    // initializer block
    init {
        println("Object $brand dibuat")
    }

    var brand: String = brand
    var year: Int = year
}