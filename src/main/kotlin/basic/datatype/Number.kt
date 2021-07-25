package basic.datatype

fun main() {
    // var is mutable in Kotlin
    // val is immutable

    // Number
    var age: Byte = 25

    // floating
    var valueFloat: Float = 9999.999F
    var valueDouble: Double = 9999.999

    // literals
    var binary: Int = 0b010101011

    // underscore in number (for separator like java)
    var price: Double = 1_000_000_000.0
    var int: Int = 1_9

    // conversion
    var number: Int = 100
    var convertToDouble: Double = number.toDouble()

    println("Byte => $age")
    println("Float => $valueFloat")
    println("Double => $valueDouble")
    println("Binary => $binary")
    println("Double Price => $price")
    println("Integer int => $int")
    println("Convert Integer to Double => $convertToDouble")
}