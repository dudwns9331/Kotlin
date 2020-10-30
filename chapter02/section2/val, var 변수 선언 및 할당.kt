package chap02.section2

fun main() {
    val number = 10 // val은 변하지 않는 변수. number 변수는 int 형으로 추론
    var language = "Korean" //langauage 변수는 String으로 추론
    val secondNumber : Int = 20 //SecondNumber 변수는 자료형을 int형으로 명시적으로 지정
    language = "English" // var 키워드로 선언한 변수는 값을 다시 할당 할 수 있음.

    println("number : $number")
    println("language : $language")
    println("secondNumber : $secondNumber")
}