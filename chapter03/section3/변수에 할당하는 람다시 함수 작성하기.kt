package chap03.section3

fun main() {
    var result: Int
    val multi = { x: Int, y: Int -> x * y } // 람다식을 통하여 변수를 함수처럼 사용가능
    result = multi(10, 20)
    println(result)

    val greet: () -> Unit = {println("Hello World!")}
    val square : (Int) -> Int = {x->x*x}

    println("x = 3, x square = ${square(3)}")
    greet()
}