package org.kotlinlang.play


//    fun printMessage(message:String): Unit{
//        println(message)
//    }
//    fun printMessageWithPrefix(message:String, prefix: String = "Info"){
//        println("[$prefix] $message")
//    }
//    fun sum (x: Int, y: Int): Int{
//        return x + y;
//    }
//    fun multiply (x: Int, y: Int) = x * y

fun main(){
    var neverNull: String = "This can't be bull"
    //neverNull=null  //Não pode ser nula
    var nullable: String? = "This can keep null here"// A ? permite a nulidade
   nullable=null
var inferredNonNull = "The compiler assumes non-null"//Var inferida não pode ser nula
    //inferredNonNull=null
    fun strLength(str: String?): Int {

        return str?.length ?:0
    }
    println( "exemplo 1: " + strLength(neverNull))
    println( "exemplo 2: " + strLength(nullable))

    fun describeString(maybeString: String?): String{
        if (maybeString !=null && maybeString.length>0){
            return "String of length ${maybeString.length}"
        }else{
            return "Empty ou null string"
        }
    }

    println(describeString(null))
    println(describeString(""))
    println(describeString("Gustavo"))
//    printMessage("Hello")
//    printMessageWithPrefix("Hello")
//    printMessageWithPrefix(prefix="Log",message="Hello")
//    println(sum(2,5))
//    println(multiply(2,5))
//    var a ="Initial"
//    println(a)
//    a="Final"
//    println(a)
//    val b: Int=1 // val é imutável, não pode se atribuir outro valor
//    val c=3
//    println(b)
//    println(c)
    }