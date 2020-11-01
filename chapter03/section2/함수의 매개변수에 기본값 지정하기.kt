package chap03.section2

fun main() {
    val name = "안영준"
    val email = "dudwns1045@naver.com"

    add(name)
    add(name, email)
    add("둘리", "dooly@examle.kr")
    defaultArgs()
    defaultArgs(200)
    defaultArgs(100, 300)
}

fun add(name : String, email : String = "default") {
    val output = "${name} 님의 이메일은 ${email}입니다."
    println(output)
}

fun defaultArgs(x : Int = 100 , y : Int = 200) {
    println(x+y)
}