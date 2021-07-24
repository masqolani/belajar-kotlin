package operator

fun main() {
    val plus = 10 + 2
    val plusDouble = 10.0 + 2.0
    val minus = 10 - 2
    val divider = 10 / 2
    val multi = 10 * 2

    var plusAssignment = 10

    // for augmented assignment
    plusAssignment += 10

    // for unary assignment
    plusAssignment++

    println("plus $plus")
    println("plusDouble $plusDouble")
    println("minus $minus")
    println("divider $divider")
    println("multi $multi")
    println("Plus Assignment $plusAssignment")
    println("Plus Unary $plusAssignment")
}