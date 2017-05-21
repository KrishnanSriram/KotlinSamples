/**
 * Created by sriramk on 5/19/2017.
 */

class HelloWorld(val firstName: String?) {

    init {
        println("Init method fired");
    }
    fun sayhello() {
        if(firstName != null) {
            println("Hello ${firstName}");
        } else {
            println("Hello, welcome to KOTLIN world");
        }
    }
}

fun main(args : Array<String>) {
    var hWorld = HelloWorld(null);
    hWorld.sayhello();
}