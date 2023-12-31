fun eatACake() = println("Comeram o bolo")
fun bakeACake() = println("Asse o bolo")

fun main() {
    var cakesEaten = 0
    var cakesBaked = 0

    while (cakesEaten < 5) {
        eatACake()
        cakesEaten ++
    }

    do {
        bakeACake()
        cakesBaked ++
    } while (cakesBaked < cakesEaten)
}