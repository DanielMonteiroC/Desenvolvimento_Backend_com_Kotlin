fun main() {
    cases("Hello")
    cases(1)
    cases(0L)
    cases(MyClass())
    cases("hello")
}

fun cases(obj: Any){
    when (obj) {
        1 -> println("Um")
        "Hello" -> println("Saudacao")
        is Long -> println("numero longo")
        !is String -> println("nao e string")
        else -> println("Desconhecido")
    }
}

class MyClass