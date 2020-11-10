package chap03.section3

fun main() {
    val result = CallbyName(otherLambda)
    println(result)
}

fun CallbyName(b: () -> Boolean) : Boolean {
    println("이름에 의한 호출 함수")
    return b()
}

val otherLambda: () -> Boolean = {
    println("다른 람다식 함수")
    false
}