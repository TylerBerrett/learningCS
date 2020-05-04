import kotlin.math.abs

fun main() {
    val test = arrayListOf(1, 1, 3, 4)
    println(absoluteValuesSumMinimization(test))
}

fun absoluteValuesSumMinimization(a: MutableList<Int>): Int {
    val list = a.toMutableSet()
    val map = mutableMapOf<Int, Int>()
    list.forEach { num ->
        a.forEach { num2 ->
            val math = Math.abs(num2 - num)
            if (map.containsKey(num)) {
                map[num] = map[num]!!.plus(math)
            } else {
                map[num] = math
            }
        }
    }
    println(map)
    var min = Int.MAX_VALUE
    var finalMin = 0
    a.forEach {
        if (map[it]!! < min) {
            min = map[it]!!
            finalMin = it
        }
    }
    return finalMin
}