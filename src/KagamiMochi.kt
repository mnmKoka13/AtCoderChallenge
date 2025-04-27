fun main() {
    val n = readln().toInt()
    val mochiList: MutableList<Int> = MutableList<Int>(n) { 0 }
    for (i in 1..n) {
        mochiList[i - 1] = readln().toInt()
    }
    mochiList.sortDescending()

    var count = 0
    var beforeMochi = 0
    for (mochi in mochiList) {
        if (mochi == beforeMochi) {
            continue
        }
        count++
        beforeMochi = mochi
    }

    println(count)
}