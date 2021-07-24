import java.util.*

fun main() {
    // this example not initial with data type
    // immutable
    val firstName = "Asqo"
    val age = 26
    val emptyString: String = ""

    // nullable variable example
    // is not recommend
    val emptyStringNullable: String? = null

    println(firstName)
    println(age)
    println(emptyString)
    println(emptyStringNullable)

    // access without NPE add question tag in variable
    println(emptyStringNullable?.length)
}