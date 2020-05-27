package part5_classCreation
/*
properties access syntax:
for var : getter and setter generated by the compiler automatically
for val: getter generated by the compiler automatically
 */
fun main() {

    val person = Person("Disha","Patel")  //no "new" keyword required to make instance of the Person class
    // if you do not have properties / arguments defined in primary constructor, then you can omit the primary constructor
    /*
    person will print Init 1 and Init 2
    */

    person.lastName  //properties access syntax (reference properties without getter and setters)
    person.firstName

    //setters
    person.nickName = "dis"
    person.nickName = "dishu"

    //getter
    println(person.nickName)

    //accessing the printInfo()
    person.printInfo()

    val person1 = Person()
    /*
    person1 will print Init 1, Init 2 and secondary constructor
     */

}
