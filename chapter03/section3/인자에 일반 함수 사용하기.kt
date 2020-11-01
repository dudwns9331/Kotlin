package chap03.section3.funargs

fun main() {
    var res1 = chap03.section3.func.sum(2, 3)
    var res2 = mul(chap03.section3.func.sum(3, 3), 3)

    println("res1 : $res1")
    println("res2 : $res2")
}

fun sum(a: Int, b: Int) = a+b
fun mul(a: Int, b: Int) = a*b
