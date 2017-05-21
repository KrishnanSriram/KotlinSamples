package Inheritence

import java.util.*

/**
 * Created by sriramk on 5/20/2017.
 */
class Student(override var firstName: String, override var lastName: String,
              override var dob: String, studentId: String) : Person(firstName, lastName, dob) {
    var studentId: String
    init {
        this.studentId = studentId
    }

    override fun print() {
//        super.print()
        println("Name: ${this.firstName} ${this.lastName}, Age: ${this.age}")
        println("StudentId: ${this.studentId}")
    }
}