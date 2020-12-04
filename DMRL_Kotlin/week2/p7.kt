package DMRL.week2

import java.util.*

fun main() {
    var input = Scanner(System.`in`)
    println("정해진 구간의 짝수들의 합을 구합니다.")
    print("구간 중 가장 작은 수는? ")
    var low = input.nextInt()
    print("구간 중 가장 큰 수는? ")
    var high = input.nextInt()

    var sum : Int = 0

    for(i in low..high) {
        if(i%2 == 0)
            sum += i
    }
    println("$low 부터 $high 까지의 짝수의 합 = $sum")
}