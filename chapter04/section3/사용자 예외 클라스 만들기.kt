package chap04.section3

class InvalidNameExecption(message : String) : Exception(message)

fun main() {
    var name = "안영준123"

    try {
        validateName(name)
    }catch (e : InvalidNameExecption) {
        println(e.message)
    }catch (e : Exception) {
        println(e.message)
    }
}

fun validateName(name : String) {
    if(name.matches(Regex(".*\\d+.*"))) {
        throw InvalidNameExecption("Your name : $name : contains numerals")
    }
}
