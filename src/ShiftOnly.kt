fun main() {
    val n = readln().toInt()
    val inputNums = readln().split(" ").map { it.toInt() }

    var oddCount = inputNums.count{ it % 2 == 1}
    if (oddCount > 0) {
        println(0)
        return
    }

    var newNums = inputNums
    var count = 0
    while (oddCount == 0) {
        newNums = newNums.map { it / 2 }.toMutableList()
        count++
        oddCount = newNums.count { it % 2 == 1 }
    }
    println(count)
}
