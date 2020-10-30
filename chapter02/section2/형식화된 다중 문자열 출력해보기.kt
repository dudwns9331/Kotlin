package chap02.section2

typealias Username = String
fun main() {
    val user: Username = "Kildong"
    val num = 10
    val formattedString = """
        var a = 6
        var b = "Kotlin"
        println(a + num)
        """
    println(formattedString)
    println(Username)
}
