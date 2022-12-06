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
class Animal(val name: String)

class Zoo(val animals: List<Animal>) {

    operator fun iterator(): Iterator<Animal> {             // 1
        return animals.iterator()                           // 2
    }
}

fun main() {

    val zoo = Zoo(listOf(Animal("zebra"), Animal("lion")))

    for (animal in zoo) {                                   // 3
        println("Watch out, it's a ${animal.name}")
    }

}