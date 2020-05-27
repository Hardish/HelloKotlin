package part1_basicOfKotlin

val nameWhenStatement = "Disha";
var greetingWhenStatement: String? = "Namste From When Statement"
/*
    when statement is like a switch statement in java
 */
fun whenStatement() {

        when(greetingWhenStatement) {
            null -> println("Hi")
            else -> println(greetingWhenStatement)
        }
    println(nameWhenStatement)
}