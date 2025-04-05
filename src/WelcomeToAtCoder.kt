fun main() {
    val a = readln().toInt()
    val (b, c) = readln().split(" ").map { it.toInt() }
    val str = readln()

    println("${a + b + c} $str")
}