package Conditions

import java.util.*

/**
 * Created by sriramk on 5/20/2017.
 */
fun main(args: Array<String>) {
    val today:String = "Sunday";
    var whatToDo = when(today) {
        "Monday" -> "Go to Office"
        "Tuesday" -> "Day of meetings"
        "Wednesday" -> "Field work"
        "Thursday" -> "Day for accomplishment"
        "Friday" -> "Day to report updates"
        else -> "day to take rest"
    }

    println("${today} is a ${whatToDo}");

    var age:Int = Random().nextInt(100)
    println("Age is: ${age}");
    when(age) {
        0 -> println("Are you in?")
        in 1..10 -> println("Too young for this application")
        in 11..30 -> println("Best time of your life. Have fun")
        in 30..60 -> println("Start to feel the pressure")
        else -> println("Done for life")
    }

}