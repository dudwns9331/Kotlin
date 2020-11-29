package DMRL.week2

import java.util.*

fun main() {
    var input = Scanner(System.`in`)
    var sum = 0

    println("정수를 몇 개 더하시겠습니까?")

    var n = input.nextInt()


    println("$n 개의 정수를 차례로 입력하시오 : ")

    for(i in 1..n) {
        var n2 = input.nextInt()
        sum += n2;
    }
    println("정수의 합 = $sum")
    println("평균 = ${sum/n.toDouble()}")
}