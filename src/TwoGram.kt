fun main() {
    val n = readLine()!!.toInt()
    val s = readLine()!!

    val twoGrams = mutableMapOf<String, Int>()

    s.windowed(2).forEach { subStr ->
        twoGrams[subStr] = twoGrams.getOrDefault(subStr, 0) + 1
    }
    println(twoGrams.maxBy { it.value }!!.key)
}