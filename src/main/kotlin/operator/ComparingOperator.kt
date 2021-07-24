package operator

fun main() {
    val a = 100
    val b = 200
    val c = 100

    val moreThan = a > b
    val moreThanEqual = a >= c

    println("More than $moreThan")
    println("More than equal $moreThanEqual")
    println("$a" > "$b")
    println("Calculation ${calculation(a, b)}")
}

fun calculation(a: Int, b: Int): Int {
    return a * b;
}