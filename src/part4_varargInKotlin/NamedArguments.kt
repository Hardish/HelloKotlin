package part4_varargInKotlin

fun greetPerson(greeting:String ="Hello",name:String="Disha") = println("$greeting $name")

fun main() {
    greetPerson("Stay Positive","Disha Patel")
    greetPerson(greeting ="Stay Positive",name = "Disha Patel")
    greetPerson(name = "Disha Patel",greeting ="Stay Positive")
    greetPerson(name = "Disha Patel")  //default parameter value
    greetPerson()

}
