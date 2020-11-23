package DMRL.week1

import java.util.*

fun main() {
    var input = Scanner(System.`in`)
    print("실수 두 개를 입력하시오 : ")

    var a : Double = input.nextDouble()
    var b : Double = input.nextDouble()

    println("$a + $b = ${a + b}")
    println("$a - $b = ${a - b}")
    println("$a * $b = ${a * b}")
    println("$a / $b = ${a / b}")
}