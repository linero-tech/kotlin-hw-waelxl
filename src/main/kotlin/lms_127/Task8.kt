@file:Suppress("UNREACHABLE_CODE")
package lms_127
fun task8(sentence: String, character: Char): Int {

    val result = sentence.filter { it == character }. count()

    println("result is $result")

    return result

}
fun main (){
    task8(sentence = "I like THE SEA", character = 'E')
}