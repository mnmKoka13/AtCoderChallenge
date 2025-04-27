fun main() {
    val s = readln()
    val DREAM = "dream"
    val DREAMER = "dreamer"
    val ERASE = "erase"
    val ERASER = "eraser"

    var t = s

    while (t.isNotEmpty()) {
        if (t.endsWith(DREAMER)) {
            t = t.substring(0, t.length - DREAMER.length)
        } else if (t.endsWith(ERASER)) {
            t = t.substring(0, t.length - ERASER.length)
        } else if (t.endsWith(DREAM)) {
            t = t.substring(0, t.length - DREAM.length)
        } else if (t.endsWith(ERASE)) {
            t = t.substring(0, t.length - ERASE.length)
        } else {
            break
        }
    }
    if (t.isEmpty()) {
        println("YES")
        return
    }
    println("NO")
    return
}