package lms_130

fun task9(temperature: String): String {
    val magnitude = temperature.substring(0, temperature.length-1).toDouble()
    val isCelsius = temperature.contains("C", ignoreCase = true)
    val result = if (isCelsius){
        val conversion = (9.0 * magnitude / 5.0) + 32.0
        "${conversion.toInt()}F"
    }else {
        val conversion = (5.0 * (magnitude - 32.0)) / 9.0
        "${conversion.toInt()}C"
    }



    return result
}
