package lms_130

fun task1(items: List<Int>): Int {
    var result = 0
    if (items.isNotEmpty()) {
        val randomIndex = (0..items.lastIndex).random()
        result = items[randomIndex]
    }
    return result
}
fun main() {
    println(task1(listOf(50, 70, 80)))
}
