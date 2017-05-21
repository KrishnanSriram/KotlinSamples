package Classes

import java.time.Year
import java.util.*

/**
 * Created by sriramk on 5/20/2017.
 */
class Person(name: String, age: Int) {
    var name: String
    var age: Int

    init {
        this.name = name;
        this.age = age;
    }
    constructor(name: String, birthYear: Year) : this(name, Calendar.getInstance().get(Calendar.YEAR) -  birthYear.value) {

    }
    //constructor(firstName: String, lastName: String, doby: Int)
    fun yearBorn(): Int = Calendar.getInstance().get(Calendar.YEAR) - age
}