package DMRL.week3

import java.util.*

fun main() {

    var input = Scanner(System.`in`)

    println("사칙 연산을 하는 프로그램입니다.")

    print("두 수를 차례로 입력하시오 : ")

    var n = input.nextInt()
    var n2 = input.nextInt()

    print("""두 수에 어떤 연산을 하시겠습니까?
        |+ - * / 중 하나를 입력하시오 : 
    """.trimMargin())

    var operator : String

    operator = input.next()

    when{
        operator == "+" -> println("$n + $n2 = ${n+n2}")
        operator == "-" -> println("$n - $n2 = ${n-n2}")
        operator == "*" -> println("$n * $n2 = ${n*n2}")
        operator == "/" -> println("$n / $n2 = ${n/n2}")

    }

}