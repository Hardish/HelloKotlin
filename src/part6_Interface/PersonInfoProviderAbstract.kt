package part6_Interface

import part5_classCreation.Person

interface PersonInfoProviderAbstract {
    fun PrintInfo(person: Person)
}


//-------------------------------------------------------------

abstract class BasicInfoProviderAbstract : PersonInfoProviderAbstract  //BasicInfoProvider implements PersonInfoProvider interface


//------------------------------------------------------------
fun main() {

    /*
        you cannot create instance of abstract class
        if abstract class BasicInfoProvider : PersonInfoProvider  then below line
        val provider = BasicInfoProvider() --> will give compile time error
     */


}