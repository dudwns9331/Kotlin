package DMRL.week2

import java.util.*

fun main() {
    var input = Scanner(System.`in`)

    print("양의 정수 하나 입력하시오 : ")

    var n = input.nextInt()

    var count = 0

    for(i in n downTo 0) {
        if(count == 10) {
            println()
            count = 0
        }
        print("$i\t")
        count++
    }
}