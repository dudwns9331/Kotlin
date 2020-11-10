package chap03.section3

fun main() {
    twoLambda({a, b -> "첫번째 $a $b"}, {"두번째 $it"})
    twoLambda({a, b -> "첫번째 $a $b"}) {"두번째 $it"} // 위의 식과 동일하다.

}

fun twoLambda(first : (String, String)-> String , second: (String)->String) {
    println(first("첫번째 파라미터", "두번째 파라미터"))
    println(second("첫번째 파라미터"))
}