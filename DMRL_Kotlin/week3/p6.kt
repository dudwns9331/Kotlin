package DMRL.week3

import java.util.*

fun main() {

    var input = Scanner(System.`in`)
    print("자연수 하나를 입력하시오 : ")

    var n = input.nextInt()
    var count : Int = 0
    var result : Double = 0.0

    while(true) {
        if(result <= n) {
            count++
            result = Math.pow(2.0, count.toDouble())
        }
        else {
            count--
            result = Math.pow(2.0, count.toDouble())
            break
        }
    }
    println("$n 보다 작거나 같은 2의 거듭제곱수 중 가장 큰 수 = $result")
}