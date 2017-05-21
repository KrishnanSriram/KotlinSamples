package Interfaces

/**
 * Created by sriramk on 5/21/2017.
 */
class Bike(override var wheels: Int, override var engineType: String, override var maxSpeed: Int,
           override var numberOfGears: Int, override var fuelTankCapacity: String): IDriveable {

    override var canDrive: Boolean = false

    init {
        this.canDrive = false
        println("Bike instantiated")
    }

    override fun start() {
        println("Bike started, proceed to drive")
        this.canDrive = true
    }
    override fun drive() {
        if (this.canDrive) {
            println("Driving a bike and this is fun!!!")
        } else {
            println("You need to start the bike to drive it!")
        }

    }

    override fun stop() {
        println("Bike stopped, to drive, start the bike again");
        this.canDrive = false
    }

    override fun information() {
        println("Bike has ${wheels} wheels, with a ${engineType} engine. " +
                "You can drive at a max speed of ${maxSpeed}mph " +
                "with ${numberOfGears} gears. You have fuel tank capacity of: ${fuelTankCapacity} gallons.")
    }
}