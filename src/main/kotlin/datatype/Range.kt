package datatype

fun main() {
    val range = 1..10

    println(range)
    println(range.count())
    println(range.contains(1))
    println(range.first)
    println(range.last)
    // mendapatkan nilai tiap kenaikan
    println(range.step)

    println("############# RANGE DOWN TO #################")
    val rangeDown = 10 downTo 1
    println(rangeDown)
    println(rangeDown.count())
    println(rangeDown.contains(1))
    println(rangeDown.first)
    println(rangeDown.last)
    println(rangeDown.step)

    println("############# RANGE DOWN TO STEP 2 #################")
    val rangeDownStep2 = 10 downTo 1 step 2
    println(rangeDownStep2)
    println(rangeDownStep2.count())
    println(rangeDownStep2.contains(1))
    println(rangeDownStep2.first)
    println(rangeDownStep2.last)
    println(rangeDownStep2.step)
}