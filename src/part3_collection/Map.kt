package part3_collection

fun main() {
    val interestingThings = listOf("Kotlin","Programming","Comic books")  //immutable by default


    //key(1,2,3) value(a,b,c) pair goes into map
    val map = mapOf(1 to "a",2 to "b",3 to "c")  //immutable

    //iterate map
    map.forEach() {key,value -> println("$key -> $value")}
    map.forEach { chavi,mulya -> println("$chavi -----  $mulya" ) }

    /*
        kotlin:
        nullable and not nullable handles differently in kotlin
        same way,
        mutable and immutable collection handle differently in kotlin
        in immutable collection, you cannot add item once it is created
     */
}
