package basic.datatype

fun main() {
    val families: Array<String> = arrayOf("Asqo", "Sumay", "Althaf", "Muadz")
    val familiesCanNull: Array<String?> = arrayOf("Asqo", "Sumay", "Althaf", "Muadz", null)
    val ages: Array<Int> = arrayOf(26, 26, 3, 0)
    val emptyArray: Array<String> = emptyArray()

    for (family in families) {
        println(family)
    }

    for (family in familiesCanNull) {
        println(family)
    }

    families.forEach { s ->  println(s)}

    println(families[1])
    println(ages)
    println("Family Size ${families.size}")
}