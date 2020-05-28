package part6_Interface

import part5_classCreation.Person

interface TypeCastingAndTypeCheckingUsingPerson {
    val provideInfo: String

    fun printInfo(person: Person) {
        println(provideInfo)
        person.printInfo()
    }
}


interface SessionInfoProviderTypeCasting {
    fun getSessionId() : String
}

class BasicInfoProviderTypeCasting : TypeCastingAndTypeCheckingUsingPerson,SessionInfoProviderTypeCasting {


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

    val provider = BasicInfoProviderTypeCasting()
    provider.printInfo(Person())
    provider.getSessionId()

    checkTypes(provider)
    checkTypes2(provider)
}

fun checkTypes2(infoProvider: TypeCastingAndTypeCheckingUsingPerson) {
    if(infoProvider !is SessionInfoProviderTypeCasting) {
        println("not session Info Provider")
    } else {
        println("it is a session Info provider")

        //type casting way 1
        (infoProvider as SessionInfoProvider).getSessionId()
        //type casting way 2: by smart compiler
        infoProvider.getSessionId()
    }
}

fun checkTypes(infoProvider: TypeCastingAndTypeCheckingUsingPerson) {
        if(infoProvider is SessionInfoProviderTypeCasting) {
            println("Session Info Provider")
        } else {
            println("not a session Info provider")
        }
}