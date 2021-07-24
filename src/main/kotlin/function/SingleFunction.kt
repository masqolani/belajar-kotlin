package function

fun main() {
    println("Single expression function ${double(2)}")
    say("Asqolani")
}

fun double(a: Int): Int = a * 2

// like void in java
fun say(name: String): Unit = println("your name is $name")