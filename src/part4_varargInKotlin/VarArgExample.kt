package part4_varargInKotlin
/*
    if you dont want to pass second argument in the greetAllArrayItem, then
    1st way: pass null
    2nd way: declare vararg:datatype. (it will create an array of and give flexibility to add parameter with random size)
            eliminating need of passing second argument
 */
fun greetAllArrayItem(greeting:String,itemsToGreet:List<String>) {
    itemsToGreet.forEach { itemToGreet ->
        println("$greeting $itemToGreet")
    }
}

fun sayHello(greeting:String,vararg itemsToGreet:String) {
    itemsToGreet.forEach { itemToGreet ->
        println("$greeting $itemToGreet")
    }
}

fun main() {
    val interestingThings = arrayOf("Kotlin","Programming","Comic books")

    //way 1
    greetAllArrayItem("Hello", listOf());  //empty list

    //way2
    sayHello("Hi")
    sayHello("Hi","Kotlin","Programming","Comic books") //get a array of value instaed of hard coding
    sayHello("Happy",*interestingThings)  //spared operator *


    //limitation of the varArgs
    //sayHello(greeting = "hi",*interstingThings) mix is not allowed. define name for all the parameters of function
    sayHello(greeting = "Fantastic day to learn", itemsToGreet = *interestingThings)
    sayHello( itemsToGreet = *interestingThings,greeting = "Fantastic day to learn")
}