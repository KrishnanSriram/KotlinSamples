package Interfaces

/**
 * Created by sriramk on 5/21/2017.
 */
interface IDriveable {
    var wheels: Int
    var engineType: String
    var maxSpeed: Int
    var numberOfGears: Int
    var fuelTankCapacity:String
    var canDrive: Boolean

    fun start()
    fun drive()
    fun stop()

    fun information();
}