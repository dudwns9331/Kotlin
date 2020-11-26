package DMRL.week1

import java.util.*

fun main() {
    var input = Scanner(System.`in`)
    print("정수를 몇 개 더하시겠습니까?")

    var n = input.nextInt()

    print("$n 개의 정수를 차례로 입력하시오 : ")

    var sum : Int = 0

    for(i in 1..n) {
        var a = input.nextInt()
        sum += a
    }

    println("정수의 합 = $sum")
}