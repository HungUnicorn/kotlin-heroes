import kotlin.math.max
import kotlin.math.min

private fun readLn() = readLine()!! // string line
private fun readInt() = readLn().toInt() // single int
private fun readStrings() = readLn().split(" ") // list of strings
private fun readInts() = readStrings().map { it.toInt() } // list of ints

fun main() {
    val t = readInt()

    for (i in 1..t) {
        val n = readInt()

        var (begin,end) = readInts()
        if (n == 1) {
            println(end)
            continue
        }

        for (j in 2..n) {
            val (a, b) = readInts()
            if

            if (begin < a) {
                begin = a
            }
            if (end > b)

            intervals.add(Pair(a,b))
        }
    }
}

fun is_overlapping(x: Pair<Int,Int>, y: Pair<Int,Int>): Boolean {
    return max(x.first, y.first) <= min(x.second, y.second)
}