fun main() {
    val (n, a, b) = readln().split(" ").map { it.toInt() }

    var result = 0
    for (i in 1..n) {
        val ones = i % 10
        val tens = (i / 10) % 10
        val hundreds = (i / 100) % 10
        val thousands = (i / 1000) % 10
        val tenThousands = (i / 10000) % 10
        val sum = ones + tens + hundreds + thousands + tenThousands
        if (sum >= a && sum <= b) {
            result += i
        }
    }

    println(result)
}