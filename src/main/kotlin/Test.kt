package org.kotlinlang.play


    fun printMessage(message:String): Unit{
        println(message)
    }
    fun printMessageWithPrefix(message:String, prefix: String = "Info"){
        println("[$prefix] $message")
    }
    fun sum (x: Int, y: Int): Int{
        return x + y;
    }
    fun multiply (x: Int, y: Int) = x * y

fun main(){
    printMessage("Hello")
    printMessageWithPrefix("Hello")
    printMessageWithPrefix(prefix="Log",message="Hello")
    println(sum(2,5))
    println(multiply(2,5))
    var a ="Initial"
    println(a)
    a="Final"
    println(a)
    val b: Int=1 // val é imutável, não pode se atribuir outro valor
    val c=3
    println(b)

    println(c)
}