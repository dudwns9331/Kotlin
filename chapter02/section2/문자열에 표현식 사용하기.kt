package chap02.section2

fun main() {
    var a = 1
    val str1 = "a = $a"
    val str2 = "a = ${a + 2}"

    println("str1 : \"$str1\", str2 : \"$str2\"")
    val special = "\"hello\" , I have \$15"
    val special2 = "${'"'}${'$'}9.99${'"'}"
    println(special)

    println(special2)
}