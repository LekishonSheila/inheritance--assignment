fun main() {
var car= Car("Subaru","Legacy","White",30)
    car.carry(20)

    car.identity()
    val parkingFees = car.calculateParkingFees(4)
    println("Parking fees: $parkingFees")




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
    fun calculateParkingFees(hours: Int): Int {
        return hours * 20
    }

}
class bus(make:String, model:String, color:String, capacity:Int):Car(make, model, color, capacity) {
    fun maxTripFare(fare: Array<Double>): Double {
        return fare.max()
    }

}






