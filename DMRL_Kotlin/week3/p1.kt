package DMRL.week3

import java.util.*

fun main() {

    var input = Scanner(System.`in`)

    println("""양수들의 평균을 구하는 프로그램입니다.
        |입력을 마치려면 0 이하의 수를 입력하시오
    """.trimMargin())

    println()

    var sum : Int = 0
    var count : Int = 0
    while(true) {
        print("숫자를 입력하시오 : ")
        var n = input.nextInt()

        if(n <= 0) break
        sum += n
        count++
    }

    var result = sum/count.toDouble()

    if(count != 0)
    println("평균 : ${result}")
    else println("양수가 하나도 입력되지 않았습니다.")
}