package part1_basicOfKotlin

val name = "Disha";
var greetingCon: String? = "Namste From part1_basicOfKotlin.ControlFlow"
/*16:27*/
fun ControlFlow() {

    if (greetingCon != null) {
        println(greetingCon);
    } else {
        println("Hello")
    }
    println(name)
}