package part7_Inheritance

import part5_classCreation.Person


interface PersonInfoProvider {

    val provideInfo: String

    fun printInfo(person: Person) {
        println(provideInfo)
        person.printInfo()
    }
}


interface SessionInfoProvider {
    fun getSessionId() : String
}

open class BasicInfoProvider : PersonInfoProvider, SessionInfoProvider {


    override val provideInfo: String
        get() = "Basic Info Provider"


    override fun printInfo(person: Person) {
        super.printInfo(person)
        println("Hello from the BasicInfoProviderProperties_Method")
    }

    override fun getSessionId(): String {
        return "Session"
    }

}

fun main() {

    val provider = FancyInfoProvider()
    provider.printInfo(Person())
    provider.getSessionId()

    checkTypes(provider)
    checkTypes2(provider)
}

fun checkTypes2(infoProvider: part7_Inheritance.PersonInfoProvider) {
    if(infoProvider !is part7_Inheritance.SessionInfoProvider) {
        println("not session Info Provider")
    } else {
        println("it is a session Info provider")

        //type casting way 1
        (infoProvider as SessionInfoProvider).getSessionId()
        //type casting way 2: by smart compiler as it is know it will be only SessionInfoProvider Type
        infoProvider.getSessionId()
    }
}

fun checkTypes(infoProvider: part7_Inheritance.PersonInfoProvider) {
    if(infoProvider is part7_Inheritance.SessionInfoProvider) {
        println("Session Info Provider")
    } else {
        println("not a session Info provider")
    }
}
