package basic.function

fun main() {
    var resultSum: Int = sum(1, 2)

    // 2 + 3
    var total = resultSum + div(10, 5)
    println(total)
}

fun sum(a: Int, b: Int): Int {
    return a + b;
}

fun div(a: Int, b: Int): Int {
    return a / b;
}
