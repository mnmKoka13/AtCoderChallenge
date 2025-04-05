fun main() {
    val a = readln().toInt() // 500円の枚数
    val b = readln().toInt() // 100円の枚数
    val c = readln().toInt() // 50円の枚数
    val x = readln().toInt() // 目標金額

    var count = 0

    for (i in 0..Math.min(a, x / 500)) {
        for (j in 0..Math.min(b, x / 100)) {
            for (k in 0..Math.min(c, x / 50)) {
                if (i * 500 + j * 100 + k * 50 == x) {
                    count++
                }
            }
        }
    }
    println(count)
}