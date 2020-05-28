package part6_Interface

import part5_classCreation.Person

interface PersonInfoProviderProperties_Method {

    //all class have to provide the below String
    val provideInfo: String

    //as we defined method in interface itself, you can omit it in the class which implements the interface
    fun printInfo(person: Person) {
        println(provideInfo)
        person.printInfo()  //calling Person class printInfo()
    }
}

class BasicInfoProviderProperties_Method : PersonInfoProviderProperties_Method {

    //to provide value to the string variable provideInfo
    override val provideInfo: String
        get() = "BasicInfoProviderProperties_Method" //BasicInfoProvider implements PersonInfoProvider interface

    //override interface printInfo()
    override fun printInfo(person: Person) {
        super.printInfo(person) //to call interface printInfo() method
        println("Hello from the BasicInfoProviderProperties_Method")
    }

}

fun main() {

    val provider = BasicInfoProviderProperties_Method()
    provider.printInfo(Person())
}