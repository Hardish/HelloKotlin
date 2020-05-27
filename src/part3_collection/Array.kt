package part3_collection

fun greetAllArrayItem(greeting:String,itemsToGreet:Array<String>) {
    itemsToGreet.forEach { itemToGreet ->
        println("$greeting $itemToGreet")
    }
}
fun main() {
    val interestingThings = arrayOf("Kotlin","Programming","Comic books") // immutable

    //printing size
    println(interestingThings.size)

    //first index
    println(interestingThings.get(0))
    println(interestingThings[0])

    //iterating array
    //way1
    for(interestingThing in interestingThings) {
        println(interestingThing)
    }
    //way2
    //more function approach
    println("more functional approach, below foreach return unit and it is in-build")
    interestingThings.forEach {
        println(it)   //it- default name
    }

    //lambda function
    interestingThings.forEach { interestingThing ->
        println(interestingThing)
    }

    //way3: index data
    interestingThings.forEachIndexed(){ index, interestingThing ->
        println("$interestingThing is at index $index")
    }

    //using function
    greetAllArrayItem("Hello",interestingThings)
}