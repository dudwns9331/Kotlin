package DMRL.week3

import java.util.*

fun main() {

    var input = Scanner(System.`in`)

    print("""삼각형을 그리는 프로그램 입니다.
        |삼각형의 크기를 얼마로 할까요? : 1이상의 정수를 입력하세요.
    """.trimMargin())

    var n = input.nextInt()

    for(i in 1..n) {
        for(j in 1..i)
        print("*")
        println()
    }
}