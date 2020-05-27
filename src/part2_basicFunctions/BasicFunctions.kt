package part2_basicFunctions
/*
below example are free function example or top level function example
as they are not enclosing inside any class
function can be independent of any associated class or associated with a class
 */
import part1_basicOfKotlin.userName

fun getGreeting(): String? {  //can return null also
    return "Hello Kotlin"
}

fun sayHello():Unit {   //Unit as a return type shows you are not returning any useful thing, so you can omit it in case
                        //if you want to
    println(getGreeting())
}
fun main() {   //part1_basicOfKotlin.main never return anything
    println("Hello World")
    println(getGreeting())
    sayHello()
    println(getName())

    //function parameter
    sayHelloToString("World from parameterize function")
    sayHelloToString1("from Single part1_basicOfKotlin.expression function")
    twoParameterSayHello("Touch the","Sky")
}

//single part1_basicOfKotlin.expression function : As compiler know it will return one string only, we can omit :String return type
fun getName() = userName

//function parameter
fun sayHelloToString(itemToGreet:String) {
    //String template
    val message = "Hello$itemToGreet";
    println(message)
}

fun sayHelloToString1(itemToGreet: String) = println("Hello $itemToGreet")

fun twoParameterSayHello(greeting: String, itemToGreet: String) = println("$greeting $itemToGreet")
