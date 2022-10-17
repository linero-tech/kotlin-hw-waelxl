package lms_130

fun task13_1(customers: List<String>): List<String> {

    val result = customers.toSet()

    return result.toList()
}

fun task13_2(customers: List<String>): List<String> {
    val result = mutableSetOf<String>()
    val uniqueItems = mutableListOf<String>()

    customers.forEach {
        if (it in uniqueItems){
            result.add(it)
        }else {
            uniqueItems.add(it)
        }
    }

    return result.toList()
}

fun task13_3(customers: List<String>): List<String> {

    val customerSet = customers.toSet()
    val result = mutableListOf<String>()

    customerSet. forEach{
        val (name, rest) = it.split("@")
        val (company, extension) = rest.split(".")
        result.add(company)
    }


    return result
}

fun main() {
    val listOfCustomer = listOf(
        "tgundrey1l@prlog.org",
        "bgrix1u@apache.org",
        "mbreakspear1v@wordpress.com",
        "cdalli1w@ft.com",
        "rclayborn1x@mtv.com",
        "rclayborn1x@mtv.com",
        "jchidlow1y@nasa.gov",
        "jchidlow1y@nasa.gov",
        "kovell1z@washingtonpost.com",
        "kovell1z@washingtonpost.com",
        "kovell1z@washingtonpost.com"
    )

    println("The customers who purchased from your product: ${task13_1(listOfCustomer)}")
    println("The customers that purchased multiple times include: ${task13_2(listOfCustomer)}")
    println("The companies that purchased from you include: ${task13_3(listOfCustomer)}")
}
