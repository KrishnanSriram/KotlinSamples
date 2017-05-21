package Inheritence

import java.text.SimpleDateFormat
import java.util.*

/**
 * Created by sriramk on 5/20/2017.
 */
abstract class Person(open var firstName: String, open var lastName: String, open var dob: String) {
    open var age: Int = 0
    init {
        println("Person init");
//        this.firstName = firstName;
//        this.lastName = lastName;
        if(dob != null) {
            var dateDOB: Date = SimpleDateFormat("YYYY/mm/dd").parse(dob);
            var cal1: Calendar = Calendar.getInstance();
            cal1.setTime(dateDOB);
            var cal2: Calendar = Calendar.getInstance();
            cal2.setTime(Date());
            this.age = cal2.get(Calendar.YEAR) - cal1.get(Calendar.YEAR)
        } else {
            println("Person: DOB is: ${this.dob}")
        }
    }

    abstract fun print();
//    {
//        println("Person Information")
//        println("Name: ${this.firstName} ${this.lastName}, Age: ${this.age}")
//    }
}