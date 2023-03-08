fun main() {
var car= Car("Subaru","Legacy","White",30)
    car.carry(20)

    car.identity()
    val parkingFees = car.calculateParkingFees(4)
    println("Parking fees: $parkingFees")
    var bus = Bus("Nissan", "typec456","red",80)
    bus.maxTripFare(arrayOf(400.0,350.50,600.40,500.0,750.0))
   println(bus.maxTripFare(arrayOf(400.0,350.50,600.40,500.0,750.0)))
    println(bus.calculateParkingFees(2))

}
open class Car(var make:String, var model:String, var color:String, var capacity:Int){
    fun carry(people: Int){
        if(people <= capacity) {
            println("Carrying $people passengers ")
        } else{
            var OverCapacity=people-capacity
            println("over capacity by $people")
        }
        }
    fun identity() {
        println("I am a $color $make $model")
    }
    open fun calculateParkingFees(hours: Int): Int {
        return hours * 20
    }

}
class Bus(make:String, model:String, color:String, capacity:Int):Car(make, model, color, capacity) {
    fun maxTripFare(fare: Array<Double>): Double {
        return fare.max()
    }

    override fun calculateParkingFees(hours: Int): Int {
        var parkingFees = hours * capacity
        return parkingFees
    }
}








