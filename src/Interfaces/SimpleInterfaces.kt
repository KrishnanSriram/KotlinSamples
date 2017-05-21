package Interfaces

/**
 * Created by sriramk on 5/21/2017.
 */

fun main(args: Array<String>) {
    var hDavidson: IDriveable = Bike(2, "1000cc", 200, 5, "10")
    hDavidson.information()

    var cooper: IDriveable = Car(4, "1500cc", 300, 6, "16")
    cooper.information()
    cooper.drive()
    cooper.start()
    cooper.drive()
    cooper.stop()
}