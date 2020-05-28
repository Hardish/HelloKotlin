package part6_Interface

import part5_classCreation.Person

//you can remove { } if the interface doesn't have properties
interface PersonInfoProvider {

    //as we defined method in interface itself, you can omit it in the class which implements the interface
    fun printInfo(person:Person) {
        println("basicInfoProvider")
        person.printInfo()  //calling Person class printInfo()
    }

}

class BasicInfoProvider : PersonInfoProvider { //BasicInfoProvider implements PersonInfoProvider interface
    override fun printInfo(person: Person) {
        //if you remove override from this method, it will give compile time error
       println("Basic Info Provider from the BasicInfoProvider class")
    }

 }

class BasicInfoProvider1 : PersonInfoProvider {

}

fun main() {

    val provider = BasicInfoProvider()
    provider.printInfo(Person())

    //BasicInfoProvider1 call
    val provider1 = BasicInfoProvider1()
    provider1.printInfo(Person())
}