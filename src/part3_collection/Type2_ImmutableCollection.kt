package part3_collection
/*
    Note:
    mutable array is not possible
    val interestingThings_Arry = mutableArrayOf("Kotlin","Programming","Comic books") // not possible
 */


fun main() {
    //add into list
    val interestingThings_List = mutableListOf("Kotlin","Programming","Comic books")  // mutable
    interestingThings_List.add("Java")

    //add into map
    val interestingThings_Map = mutableMapOf(1 to "a",2 to "b",3 to "c")  // mutable
    interestingThings_Map.put(4,"d")

    //print all elements of the map and list
    printAll(interestingThings_List,interestingThings_Map)
}

fun printAll(interestingthingsList: MutableList<String>, interestingthingsMap: MutableMap<Int, String>) {
    interestingthingsList.forEach { interestingthing ->
        println("$interestingthing")
    }
    interestingthingsMap.forEach { Key, Value ->
        println("$Key -> $Value ")
    }
}
