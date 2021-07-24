package datatype

fun main() {
    var firstName: String = "Asqo"
    var lastName: String = "Lani"

    var testString = "tes"
    var testInt = 1

    var address: String = """
        Jl. Kalibaru barat IV 
        Gang teratai 
        Jakut"""

    var addressWithTrimMargin: String = """Jl. Kalibaru barat IV 
        |Gang teratai 
        |Jakut""".trimMargin()

    var addressWithTrimMarginWithPrefix: String = """Jl. Kalibaru barat IV 
        >Gang teratai 
        >Jakut""".trimMargin(">")

    var fullName: String = "$firstName $lastName"
    var desc: String = "$fullName length = ${fullName.length}"

    println(firstName)
    println(address)
    println(addressWithTrimMargin)
    println(addressWithTrimMarginWithPrefix)
    println(fullName)
    println(desc)
    println(testString)
    println(testInt)
}