package lms_133

fun groceries(list: List<Map<String, Any>>): Double {
    var result = 0.0
    list.forEach { map ->
        result += map.getValue("quantity").toString().toInt() * map.getValue("price").toString().toDouble()
    }

    return result
}