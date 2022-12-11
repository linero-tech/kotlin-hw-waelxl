package lms_133

fun vowels(sentence: String): Int{
    var result = 0
    val letterOfVowels = mapOf('a' to 5, 'e' to 4, 'i' to 3, 'o' to 2, 'u' to 1)

    sentence.lowercase().forEach{Char ->
        if(letterOfVowels.contains(Char)) {
            val temp = letterOfVowels.getOrDefault(Char, 0)

            result += temp
        }
    }
    return result
}

fun main(){
    println(vowels("I love kotlin"))
}