/**
 * Pengganti switch case di java
 * Recommended
 */
fun main() {
    when ("A") {
        // bisa gini
        "A" -> {
            println("AMAZING")
        }
        // bisa gini bebas
        "B" -> println("GOOD")
        "C" -> println("NOT BAD")
        "D" -> println("BAD")
        else -> println("Please Try Next Year.")
    }

    // when multiple
    when ("A") {
        "A", "B", "C" -> println("LULUS")
        else -> println("TIDAK LULUS")
    }

    // when in untuk cek datanya ada atau ga
    val finalExam = "E"
    val nilaiLulus = arrayOf("A", "B", "C")
    when (finalExam) {
        in nilaiLulus -> println("SELAMAT ANDA LULUS")
        !in nilaiLulus -> println("ANDA TIDAK LULUS")
    }

    // when is untuk cek type app.data or something
    val name = "Asqo"
    when (name) {
        is String -> println("Name is String")
        !is String -> println("Name is not String")
    }

    // when pengganti if else
    val nilaiUjian = 90
    when {
        nilaiUjian >= 90 -> println("AMAZING")
        nilaiUjian >= 80 -> println("GOOD JOB")
        nilaiUjian >= 60 -> println("NOT BAD")
        else -> println("Please Try Again Next Year.")
    }
}