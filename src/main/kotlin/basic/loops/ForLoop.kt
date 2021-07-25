package basic.loops

fun main() {
    val names = arrayOf("Asqo", "Sumay", "Althaf", "Muadz")
    for (name in names) {
        println(name)
    }

    for (value in 0..100) {
        println(value)
    }

    for (value in 1000 downTo 0 step 5) {
        println(value)
    }

    for (i in 0..50) {
        println("Index $i")
    }
}