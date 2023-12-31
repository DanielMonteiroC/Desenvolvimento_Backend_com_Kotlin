class Animal(val name: String)

class Zoo(val animals: List<Animal>) {
    
    operator fun iterator(): Iterator<Animal> {
        return animals.iterator()
    }
}

//fun main() {
//    val zoo = Zoo(listOf(Animal("zebra"), Animal("leoa")))
    
//    for (animal in zoo) {
//        println("O mato balançou, é uma ${animal.name}")
//    }
//}

fun main() {
    val animals = listOf(Animal("zebra"), Animal("leoa"));
    val zoo = Zoo(animals)
    
    for (animal in zoo) {
        println("O mato balançou mais uma vez, é uma ${animal.name}")
    }
}