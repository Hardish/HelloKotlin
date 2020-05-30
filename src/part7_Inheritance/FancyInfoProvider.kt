package part7_Inheritance

import part5_classCreation.Person


//By default, all classes are close/final in kotlin, so you cannot extend/inheritate it. You have to declare open in front of class declaration
// extend class
class FancyInfoProvider : BasicInfoProvider()
{
    override val provideInfo: String
        //get() = super.procideInfo  by default
        get() = "Fancy Info Provider"

    override fun printInfo(person: Person) {
        //super.printInfo(person)
        println("Fancy Info")

    }
}