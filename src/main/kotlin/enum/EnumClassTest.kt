package enum

enum class Person(val familyName: String, val firstName: String) {
    A(familyName = "김", firstName = "동환"),
    B(familyName = "커리", firstName = "스테픈"),
    C(familyName = "조던", firstName = "마이클"),
    D(familyName = "오닐", firstName = "샤킬");


    companion object {
        fun printValues() {
            println()
            println("Printing Values")
            values().forEach {
                println(it)
            }
        }

        fun getInformationByFamilyName(familyName: String): Person {
            println()
            println("Printing getInformationByFamilyName")
            return values().firstOrNull {
                println("${it.familyName} ${it.firstName}")
                it.familyName == familyName
            } ?: throw Exception("매칭되는 인물이 없습니다.")
        }

        fun getInformationByFirstName(firstName: String): Person {
            println()
            println("Printing getInformationByFirstName")
            return values().firstOrNull {
                println("${it.familyName} ${it.firstName}")
                it.firstName == firstName
            } ?: throw Exception("매칭되는 인물이 없습니다.")
        }
    }
}

fun main() {

    Person.printValues()
    Person.getInformationByFamilyName("커리")
    Person.getInformationByFirstName("마이클")

}