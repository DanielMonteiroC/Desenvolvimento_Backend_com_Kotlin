fun main(){
    val x = 2
    if (x in 1..5){
        print("x está entre 1 a 5.")
    }
    println()

    if (x !in 6..10){
        print("x não está entre 6 a 10")
    }
    println()

    for (c in 'a'..'d'){
        print(c)
    }
    println()

    for (c in 'z' downTo 's' step 2){
        print(c)
    }
}