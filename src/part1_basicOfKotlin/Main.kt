package part1_basicOfKotlin//https://www.youtube.com/watch?v=F9UC9DY-vIU
//variables : two types
/*
    1. mutable (var): can be reassigned it
    2. local var(val): cannot update the variable
    3. top level variable: defined outside any method and class.

    In kotlin, variables are not null means you cannot assign any variable null except variable have ? in the string
    In kotlin, we can actually omit the type of variable, it can automatically define by the assign value
 */

val userName: String ="Disha Patel"
var greeting:String? ="Hello" //this can be null or any string...
var Address  = "Bhavana park,karelibaug";  //you cannot make Addree as null as it is not defined nullable
fun main() {
   /* val part1_basicOfKotlin.getName: String = "Namste"
    var country:String = "India"
    country = "Bharat/India"
    println("Hello Kotlin")
    println(part1_basicOfKotlin.getName + country)
    println(part1_basicOfKotlin.getUserName)
    println(part1_basicOfKotlin.getGreeting)
    part1_basicOfKotlin.getGreeting = "Ola"
    println(part1_basicOfKotlin.getGreeting)
    part1_basicOfKotlin.getGreeting = null  // as we defined nullable datatype
    println(part1_basicOfKotlin.getGreeting)
    println(part1_basicOfKotlin.getAddress);*/

//    part1_basicOfKotlin.ControlFlow();
//    part1_basicOfKotlin.whenStatement();
    expression(); whenExpression();
}

