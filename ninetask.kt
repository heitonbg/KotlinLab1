open class Vehicle {
    open val speed: Int = 0
    open val name: String = "Транспортное средство"

    open fun start() {
        println("$name начал движение со скоростью $speed км/ч")
    }

    open fun stop() {
        println("$name остановился")
    }
}

class Boat : Vehicle() {
    override val speed: Int = 30
    override val name: String = "Лодка"

    override fun start() {
        println("$name отчалила от берега со скоростью $speed км/ч")
    }

    override fun stop() {
        println("$name причалила к берегу")
    }
}

class Airplane : Vehicle() {
    override val speed: Int = 800
    override val name: String = "Самолет"

    override fun start() {
        println("$name взлетел со скоростью $speed км/ч")
    }

    override fun stop() {
        println("$name приземлился")
    }
}

class Tank : Vehicle() {
    override val speed: Int = 60
    override val name: String = "Танк"

    override fun start() {
        println("$name начал движение по местности со скоростью $speed км/ч")
    }

    override fun stop() {
        println("$name остановился")
    }
}

fun main() {
    val vehicles = listOf(Boat(), Airplane(), Tank())

    vehicles.forEach { vehicle ->
        vehicle.start()
        vehicle.stop()
        println()
    }
}