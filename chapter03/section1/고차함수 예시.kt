package chap03.section1

fun main() {
    println(highfunc({ x, y -> x + y }, 10, 20))
}

fun highfunc(sum : (Int, Int)-> Int, a: Int, b: Int) : Int = sum(a,b) // sum이라는 변수에  x+y 람다식을 인자로.

// a와 b를 인자로 10 20 대입 반환값은 Int가 되고 sum에서 정의된 a+b의 값이 리턴된다.