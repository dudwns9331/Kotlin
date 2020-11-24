package DMRL.week3

import java.util.*

fun main() {

    var input = Scanner(System.`in`)

    print("""역삼각형을 그리는 프로그램입니다.
        |역삼각형의 크기를 얼마로 할까요? 1이상의 정수를 입력하세요.
    """.trimMargin())

    var n = input.nextInt()

    for(i in n downTo 1) {
        for(j in 1..i)
            print("*")
        println()
    }
}