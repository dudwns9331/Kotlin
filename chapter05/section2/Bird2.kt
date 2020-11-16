package chap05.section2

class Bird2 (var name : String, var wing : Int, var beak :String, var color : String){

    init {
        println("-----------초기화 블럭 시작-----------")
        println("이름은 $name, 부리는 $beak")
        println("-----------초기화 블럭 끝 ------------")
        this.sing(3)
    }
    fun fly() = println("Fly wing : $wing")
    fun sing(vol : Int) = println("Sing vol : $vol")
}

fun main() {
    val coco = Bird2("mybird", 2, "short", "blue")

    coco.color = "yellow"
    println("coco.color = ${coco.color}")
    coco.fly()
}