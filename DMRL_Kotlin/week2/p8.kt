package DMRL.week2

import java.util.*

fun main() {
    var input = Scanner(System.`in`)

    var intro : String = """평균을 구하는 프로그램
        |0 이상 정수를 여러개 입력하시오.
        |입력을 마치려면 음의 정수를 입력하시오.
    """.trimMargin()

    println(intro)

    var count : Int = 0
    var sum : Int = 0
    while(true) {
        var n = input.nextInt()
        if(n < 0) break
        count++
        sum += n
    }
    if(count != 0)
    println("""입력된 0이상 정수 갯수 = $count
        |정수의 합 = $sum
        |평균 = ${sum/count.toDouble()}
    """.trimMargin())
    else
        print("입력된 0 이상 정수 갯수 = 0")
}