package basic.loops

fun main() {
    var i = 0

    while (true) {
        println("i ke $i")
        i++

        if (i > 1000) {
            println("break")
            break
        }
    }

    for (i in 1..100) {
        if (i % 2 == 0) {
            continue
        }

        println("bilangan ganjil $i")
    }
}