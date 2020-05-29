import kotlin.math.roundToInt
import kotlin.test.assertTrue

private fun readLn() = readLine()!! // string line
private fun readInt() = readLn().toInt() // single int
private fun readStrings() = readLn().split(" ") // list of strings
private fun readInts() = readStrings().map { it.toInt() } // list of ints


fun display(n: Long): String {
    var ans = "2000M"

    if (n < 1000) ans = n.toString()
    else if (n in 1000 until 1_000_000) {
        ans = (n / 1000.0).roundToInt().toString() + "K"
        if (ans == "1000K") {
            ans = "1M"
    }
    } else if (n in 1_000_000..2_000_000_000) {
        ans = (n / 1_000_000.0).roundToInt().toString() + "M"
    }
    return ans
}

fun main() {
    val t = readInt()
    for (i in 1..t) {
        var n = readLn().toLong()
        println(display(n))
    }
    assert()
}


fun assert() {
    println(display(999_999))

    assertTrue { display(999) == "999" }
    assertTrue { display(0) == "0" }

    assertTrue { display(1785L) == "2K" }
    println(display(35499710L))
    assertTrue { display(35499710L) == "35M" }

    assertTrue { display(2_000_000_000) == "2000M" }
    assertTrue { display(5_000_000) == "5M" }

    assertTrue { display(499_999) == "500K" }
    assertTrue { display(4500000) == "5M" }

    println(display(999_998))
    assertTrue { display(998_998) == "999K" }
    assertTrue { display(999_998) == "1M" }
    println(display(999999))

    assertTrue { display(999999) == "1M" }

    assertTrue { display(1_000_998) == "1M" }
    assertTrue { display(1_900_998) == "2M" }
    assertTrue { display(4_1234_000_000) == "2000M" }
}
