package DMRL.week3

import java.util.*

fun main() {
    var input = Scanner(System.`in`)

    print("2의 몇 제곱까지 구할까요? ")

    var n = input.nextInt()

    for(i in 0..n)
        println("2의 $i 제곱 : ${Math.pow(2.0, i.toDouble())}")
}