package DMRL.week2

import java.util.*

fun main() {
    var input = Scanner(System.`in`)

    print("양의 정수 하나 입력하시오 : ")
    var n = input.nextInt()

    var count : Int = 0
    for(i in 0..n) {
        if(count == 10) {
            println()
            count = 0
        }
        print("$i\t")
        count++
    }
    println()
    println()
    println("두번째 방법")

    for(i in 0..n) {
        if(i > 0 && i%10 == 0)
            println()
        print("$i\t")
    }
}