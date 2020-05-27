package part1_basicOfKotlin
fun expression() {
    val greetingToPrint = if(greeting != null) greeting else "Hi"
    println(greetingToPrint)
    println(name)
}

fun whenExpression() {
    val greetingToPrint = when (greeting) {
        null -> "Hi"
        else -> greeting
    }
    println(greetingToPrint)
    println(name)
}