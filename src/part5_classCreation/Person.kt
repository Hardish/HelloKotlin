package part5_classCreation
//class Person  ---> is same as below two lines
//class Person()
//class Person constructor() ----> empty primary constructor

//way 1 : initialize properties
//instead of passing parameters in the constructor, pass the properties name
//way 2.1 : default value in primary constructor
class Person(val firstName:String = "Peter",val lastName:String ="Parker"){

    var nickName: String? = null
    //defining your own setter for nickName
    set(value) {
        field = value // to update the new value to current variable
        println("new value of the NickName is $value ")
    }

    //define your custom getter
    get() {
        println("the returned value is $field")
        return field
    }

    //define method in the class
    fun printInfo() {
        //to check null and replace it with some valid value
        //way 1:
        // val nickNameToPrint = if(nickName != null) nickName else "No nickname"
        //way 2:
        val nickNameToPrint = nickName ?: "no nick name" // elvish operator : return nick name in case not null else
                                                                //return "no nick name"
        println("$firstName ($nickNameToPrint) $lastName")
    }
}

/*
//way 2: initialize property
class Person(_firstName:String,_lastName:String){
    val firstName:String = _firstName
    val lastName:String =_lastName
}*/

/*
//way 3: initializing property
class Person(_firstName:String,_lastName:String){
    //can have multiple init block and run in sequence
    init {
        firstName = _firstName
        lastName = _lastName
    }
}*/

/* way 2.2 : default value in secondary constructor
class Person(val firstName:String,val lastName:String){

        init {  //all init block will always run in sequence defined in the class body before secondary constructor
            println("Init 1")
        }
        //empty secondary constructor
        constructor(): this("Peter","Parker") {
            println("Secondary constructor")
        }

        init {
            println("Init 2")
        }
}
 */
