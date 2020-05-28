package part6_Interface

import part5_classCreation.Person

interface PersonMultipleInterfaceWithSingleClass {
    val provideInfo: String

    fun printInfo(person: Person) {
        println(provideInfo)
        person.printInfo()
    }
}

//--------------------------------------------------

interface SessionInfoProvider {
    fun getSessionId() : String
}

class BasicInfoProviderMultipleInterface : PersonMultipleInterfaceWithSingleClass,SessionInfoProvider {


    override val provideInfo: String
        get() = "BasicInfoProviderProperties_Method"


    override fun printInfo(person: Person) {
        super.printInfo(person)
        println("Hello from the BasicInfoProviderProperties_Method")
    }

    override fun getSessionId(): String {
       return "Session"
    }

}

fun main() {

    val provider = BasicInfoProviderMultipleInterface()
    provider.printInfo(Person())
    provider.getSessionId()
}