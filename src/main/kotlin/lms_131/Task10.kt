package lms_131

fun task10(mapa: Map<Int, String>): Map<String, Int> {

    val result = mutableMapOf<String, Int>()
    mapa.forEach {entity -> result[entity.value] = entity.key}

    return result
}
