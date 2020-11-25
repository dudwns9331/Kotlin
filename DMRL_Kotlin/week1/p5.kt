package DMRL.week1

import java.util.*

fun main() {
    var input = Scanner(System.`in`)

    print("1부터 얼마까지의 자연수를 더하시겠습니까? ")

    var n = input.nextInt()

    var sum : Int = 0

    for(i in 1..n)
        sum += i
    println("for 이용 : 1부터 $n 까지의 자연수의 합 = $sum")

    sum = 0
    var i : Int = 0

    while(i <= n) {
        sum += i
        i++
    }
    println("while 이용 : 1부터 $n 까지의 자연수의 합 = $sum")
}