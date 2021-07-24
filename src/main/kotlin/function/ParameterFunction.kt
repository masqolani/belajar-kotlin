package function

fun main() {
    sayHello("Muhammad", "Asqolani")
    sayHelloCanBeNull("Muhammad", null)
    sayHelloDefaultArgument("Muhammad")
    sayHelloNamedArgument(firstName = "Muhammad", lastName = "Sidik", middleName = "Asqolani")
}

fun sayHello(firstName: String, lastName: String) {
    println("Hello $firstName $lastName")
}

fun sayHelloCanBeNull(firstName: String, lastName: String?) {
    println("Hello $firstName $lastName")
}

fun sayHelloDefaultArgument(firstName: String, lastName: String = "") {
    println("Hello $firstName $lastName")
}

fun sayHelloNamedArgument(firstName: String, lastName: String = "", middleName: String) {
    println("Hello $firstName $middleName $lastName")
}


