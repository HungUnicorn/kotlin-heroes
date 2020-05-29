import java.math.BigInteger

fun main() {
    val n = readLine()!!.toBigInteger()
    val cities = readLine()!!.split(" ").map { it.toBigInteger() }

    var temp = BigInteger.ZERO
    var index = -1
    for (c in cities.withIndex()) {
        if (c.value >= temp) {
            temp = c.value
            index = c.index
        }
    }

    println((n * temp).minus(n.minus(index.toBigInteger()).minus(BigInteger.ONE)))
}