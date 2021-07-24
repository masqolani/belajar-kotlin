package function

fun main() {
    println("Total is ${calculateTotal(1,2,3,4)}")
}

// like args java (like array)
fun calculateTotal(vararg values: Int): Int {
    var total = 0

    for (value in values) {
        total += value
    }

    return total;
}