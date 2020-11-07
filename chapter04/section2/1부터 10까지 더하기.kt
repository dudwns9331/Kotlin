package chap04.section2

fun main() {
    var sum : Int = 0

    for(x in 1..10) {
        sum += x
    }

    println("sum : $sum")
}