fun main() {
    var (n, k) = readLine()!!.split(" ").map { it.toInt() }
    for (i in 1..k) {
        n = if (n % 10 != 0) n - 1 else n / 10
    }
    println(n)
}