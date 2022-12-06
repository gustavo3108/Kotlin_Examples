package org.kotlinlang.play
//Instead of the widely used switch statement, Kotlin provides the more flexible and clear when construction. It can be used either as a statement or as an expression.
//fun main() {
//    cases("Hello")
//    cases(1)
//    cases(0L)
//    cases(MyClass())
//    cases("hello")
//}


//
//fun cases(obj: Any) {
//    when (obj) {                                     // 1
//        1 -> println("One")                          // 2
//        "Hello" -> println("Greeting")               // 3
//        is Long -> println("Long")                   // 4
//        !is String -> println("Not a string")        // 5
//        else -> println("Unknown")                   // 6
//    }
//}
//
//class MyClass
//
//for in Kotlin works the same way as in most languages.
//fun main() {
//
//    val cakes = listOf("carrot", "cheese", "chocolate")
//
//    for (cake in cakes) {                               // 1
//        println("Yummy, it's a $cake cake!")
//    }
//
//}
//
//
//fun main() {
//
//    for(i in 0..3) {             // 1
//        print(i)
//    }
//    print(" ")
//
//    for(i in 0 until 3) {        // 2
//        print(i)
//    }
//    print(" ")
//
//    for(i in 2..8 step 2) {      // 3
//        print(i)
//    }
//    print(" ")
//
//    for (i in 3 downTo 0) {      // 4
//        print(i)
//    }
//    print(" ")
//}
//fun main() {
//
//    for (c in 'a'..'d') {        // 1
//        print(c)
//    }
//    print(" ")
//
//    for (c in 'z' downTo 'k' step 3) { // 2
//        print(c)
//    }
//    print(" ")
//    println()
//    val x = 2
//    if (x in 1..5) {            // 1
//        print("x is in range from 1 to 5")
//    }
//    println()
//
//    if (x !in 6..10) {          // 2
//        print("x is not in range from 6 to 10")
//    }
//}
//Kotlin uses == for structural comparison and === for referential comparison.
//More precisely, a == b compiles down to if (a == null) b == null else a.equals(b).
//fun main() {
//
//
//    val authors = setOf("Shakespeare", "Hemingway", "Twain")
//    val writers = authors//setOf("Twain", "Shakespeare", "Hemingway")
//
//    println(authors == writers)   // 1
//    println(authors === writers)  // 2
//
//}
//There is no ternary operator condition ? then : else in Kotlin. Instead, if may be used as an expression:
fun main() {

    fun max(a: Int, b: Int) = if (a > b) a else b         // 1

    println(max(-99, -42))

}


