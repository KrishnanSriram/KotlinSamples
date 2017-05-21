package Inheritence

import java.text.SimpleDateFormat
import java.util.*

/**
 * Created by sriramk on 5/20/2017.
 */

fun main(args: Array<String>) {
    var strDOB: String = "1979/03/28"
//    var dob: Date = SimpleDateFormat("YYYY/mm/dd").parse(strDOB);

//    var person: Person = Person("Krishnan", "Sriram", dob);
//    person.print();

    var student: Student = Student(firstName = "Krishnan", lastName = "Sriram", dob = strDOB, studentId = "3443")
    student.age = 30
    student.print()
}
