package DMRL.week1

import java.util.*

fun main() {
    print("정수 두 개를 입력하시오 : ")

    var input = Scanner(System.`in`)

    var a = input.nextInt()
    var b = input.nextInt()

    val sum = a + b

    println("$a + $b = $sum")
}