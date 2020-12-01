package DMRL.week2

import java.util.*

fun main() {
    var input = Scanner(System.`in`)
    
    print("어떤 수의 배수들을 출력할까요? ")

    var n = input.nextInt()

    println("1 이상 100 이하 수 중 $n 의 배수들")

    for(i in 1..100) {
        if(i % n == 0)
            print("$i ")
    }
}