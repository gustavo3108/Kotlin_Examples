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

//    println(describeString(null))
//    println(describeString(""))
//    println(describeString("Gustavo"))
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

//val customer= Customer()
//val contact = Contact(1, "gustavo@gmail.com")
//    println("id: " + contact.id + " email: "+ contact.email)
//    contact.email= "gugu@hotmail.com"
//    println("id: " + contact.id + " email: "+ contact.email)
    val stack = MutableStack(0.62, 3.14, 2.7)
    stack.push(9.87)
    println(stack)

    println("peek(): ${stack.peek()}")
    println(stack)

    for (i in 1..stack.size()) {
        println("pop(): ${stack.pop()}")
        println(stack)
    }

}
class Customer
class Contact (val id: Int, var email: String)
class MutableStack<E>(vararg items: E) {              // 1 Declaração de genéricos que recebe um vararg(array)

    private val elements = items.toMutableList()

    fun push(element: E) = elements.add(element)        // 2

    fun peek(): E = elements.last()                     // 3

    fun pop(): E = elements.removeAt(elements.size - 1)

    fun isEmpty() = elements.isEmpty()

    fun size() = elements.size

    override fun toString() = "MutableStack(${elements.joinToString()})"
}