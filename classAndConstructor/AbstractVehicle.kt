package classAndConstructor

//추상 클래스, 주 생성자에는 비추상 프로퍼티 선언의 매개변서 3개 있음
abstract class Vehicle(val name: String, val color: String, val weight: Double) {

    //추상 프로퍼티(반드시 하위 클래스에서 재정의 하여 초기화 해야함
    abstract var maxSpeed: Double

    //일반 프로퍼티(초기 값인 상태를 저장할 수 있음)
    var year = "2018"

    //추상메서드(반드시 하위 클래스에서 구현해야 함)
    abstract fun start()
    abstract fun stop()

    //일반 메서드
    fun displaySpecs() {
        println("Name: $name, Color: $color, Weight: $weight, Year: $year, MaxSpeed: $maxSpeed")
    }
}

class Car2(name: String, color: String, weight: Double, override var maxSpeed: Double)
    : Vehicle(name, color, weight) {
    override fun start() {
        //코드 구현
        println("Car Started")
    }

    override fun stop() {
        //코드 구현
        println("Car Stopped")
    }
}

class Motorcycle(name: String, color: String, weight: Double, override var maxSpeed: Double)
    : Vehicle(name, color, weight) {
    override fun start() {
        //코드 구현
        println("Bike Stopped")
    }
    override  fun stop() {
        //코드 구현
        println("Bike Stopeed")
    }
}

fun main() {
    val car = Car2("SuperMatiz", "yellow", 1110.0, 270.0)
    val motor = Motorcycle("DreamBike", "red", 173.0, 100.0)

    car.year= "2022"

    car.displaySpecs()
    car.start()
    motor.displaySpecs()
    motor.start()
}
