package DMRL.week2

fun main() {
    var sum : Int = 0

    for(i in 1..100) {
        if(i % 3 == 0)
            sum += i
    }
    println("i를 1씩 증가시키면서 i가 3의 배수일 때만 더하는 방식으로 계산")
    println("1 이상 100 이하 3의 배수들의 합 = $sum")

    println()

    sum = 0
    for(i in 0..100 step 3){
        sum += i
    }

    println("i를 3씩 증가시키면서 i를 더하는 방식으로 계산")
    println("1 이상 100 이하 3의 배수들의 합 = $sum")
}