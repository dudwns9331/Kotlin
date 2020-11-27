package DMRL.week1

import java.util.*

fun main() {
    var input = Scanner(System.`in`)

    print("정수를 두 개 입력하시오 : ")

    var a = input.nextInt()
    var b = input.nextInt()

    when {
        a > b -> println("더 큰 수는 $a 입니다.")
        a < b -> println("더 큰 수는 $b 입니다.")
        a == b -> println("두 수는 같습니다.")
    }
}