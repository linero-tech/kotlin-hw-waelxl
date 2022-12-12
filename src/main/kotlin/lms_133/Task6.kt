package lms_133

fun counter(word: String): Boolean {
    val alphabet = ('a'..'z')
    var indexSum = 0

    word.lowercase().forEach { letter ->
        if (letter in alphabet){
            val index = alphabet.indexOf(letter) + 1
            indexSum += index
        }
    }
    return indexSum % 2 == 0
}

fun main(){
    println(counter("alexa"))
    println(counter("aa"))
    println(counter("ab"))
    println(counter("aa aa"))
}