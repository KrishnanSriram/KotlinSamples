package Classes

import java.time.Year

/**
 * Created by sriramk on 5/20/2017.
 */

fun main(args: Array<String>) {
    var person = Person("Krishnan", 38)
    println("Name: ${person.name}, Age: ${person.age}, Born in the year: ${person.yearBorn()}")

    var person2 = Person("Indhu", Year.of(1980))
    println("Name: ${person2.name}, Age: ${person2.age}, Born in the year: ${person2.yearBorn()}")
}