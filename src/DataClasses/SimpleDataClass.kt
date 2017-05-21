package DataClasses

/**
 * Created by sriramk on 5/21/2017.
 */
enum class Gender {
    male,
    female
}
class Person(var firstName: String, var lastName: String, var ssn: String, var gender: Gender) {
    init {

    }
}

data class PersonData(var firstName: String, var lastName: String, var ssn: String, var gender: Gender) {

}

fun main(args: Array<String>) {
    var p1 = PersonData("Krishnan", "Sriram", "343-43-3423", Gender.male)
    var p2 = p1.copy(firstName = "Jayanthi", ssn = "343-43-3424", gender = Gender.female)
    println(p1)
    println(p2)
}