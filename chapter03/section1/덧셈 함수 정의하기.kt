package chap03.section1

import java.util.*

//fun sum(a : Int, b : Int) : Int {
//    var sum = a + b
//    return sum
//}

fun sum(a : Int, b : Int) = a + b

fun main() {
    var a = 1
    var b = 2

    if (sum(a, b) is Int)
    print(sum(a, b))
}

