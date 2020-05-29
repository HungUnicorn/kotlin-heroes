fun main() {
    val n = readLine()!!.toInt()
    val list = readLine()!!.split(" ").map { it.toInt() }
    val mutableListOf = mutableListOf<Int>()

    val associateBy = list.withIndex().associateBy({ it.value }, { it.index }).toSortedMap()

    val firstMin = associateBy.minBy { it.key }

    if (firstMin != null) {
        associateBy.remove(firstMin.key)
    }

    val secondMin = associateBy.minBy { it.key }
    if (secondMin != null) {
        associateBy.remove(secondMin.key)
    }

    val thirdMin = associateBy.minBy { it.key }
    if (thirdMin != null) {
        associateBy.remove(thirdMin.key)
    }

    if (firstMin == null || secondMin == null || thirdMin == null) {
        println("-1 -1 -1")
    } else if (firstMin.key >= secondMin.key || secondMin.key >= thirdMin.key) {
        println("-1 -1 -1")
    } else {
        println("${firstMin.value + 1} ${secondMin.value + 1} ${thirdMin.value + 1}")
    }
}
