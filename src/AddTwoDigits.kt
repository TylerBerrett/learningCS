import kotlin.math.abs

fun main() {
    val test = 29
    println(addTwoDigits(test))
}

fun addTwoDigits(n: Int): Int {
    val one = n / 10
    val two = n % 10
    println(one)
    println(two)
    return one + two
}