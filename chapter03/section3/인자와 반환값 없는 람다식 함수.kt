package chap03.section3

fun main() {
    val out: () -> Unit = { println("Hello World")}

    //자료형을 함수로 만들어 준다음 반환값이 없는 Unit으로 지정해준다.

    out()
    val new = out
    new()
}

