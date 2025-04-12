fun main () {
    val n = readln().toInt()
    val cards = readln().split(" ").map { it.toInt() }.toMutableList()

    cards.sortDescending()

    var aliceScore = 0
    var bobScore = 0

    for (i in 1..n) {
        if (i % 2 == 1) {
            aliceScore += cards[i - 1]
        } else {
            bobScore += cards[i - 1]
        }
    }

    println(aliceScore - bobScore)
}
