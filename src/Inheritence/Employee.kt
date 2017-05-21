package Inheritence

import java.util.*

/**
 * Created by sriramk on 5/20/2017.
 */
class Employee(override var firstName: String, override var lastName: String, override var dob: String,
               var empId: String) : Person(firstName, lastName, dob) {

    init {
        println("Employee init");
        this.empId = empId
    }
    override fun print() {
        println("Employee Infomration");
//        super.print();
        println("Employee Id: ${this.empId}");
    }
}