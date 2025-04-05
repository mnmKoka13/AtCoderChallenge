fun main() {
    val (a, b) = readln().split(" ").map { it.toInt() }

    val product = a * b

    if (product % 2 == 0) {
        println("Even")
    } else {
        println("Odd")
    }
}
