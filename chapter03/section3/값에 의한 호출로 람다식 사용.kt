package chap03.section3

fun main() {
    val result = callByValue(lambda())
    println(result)
}

fun callByValue(b: Boolean) : Boolean {
    println("값에 의한 호출 함수")
    return b
}

val lambda: () -> Boolean = {
    println("람다식 함수")
    true // 마지막 표현식의 값이 리턴된다.
}