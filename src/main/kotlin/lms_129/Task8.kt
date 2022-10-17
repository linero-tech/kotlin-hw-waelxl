package lms_129

fun task8(number: Int): Int {
        var result = 0
        var counter = number
        while ( counter > 0){
            var digit = counter % 10
            result += digit
            counter /= 10
        }
        return result
    }
    fun main (){
        println(task8(number = 123))
    }