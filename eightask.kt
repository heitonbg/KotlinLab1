class Vector(val x: Double, val y: Double, val z: Double) {

    fun length(): Double = Math.sqrt(x * x + y * y + z * z)

    fun dotProduct(other: Vector): Double = x * other.x + y * other.y + z * other.z

    infix fun dot(other: Vector): Double = this.dotProduct(other)

    operator fun times(other: Vector): Double = this.dotProduct(other)
}

fun dotProduct(v1: Vector, v2: Vector): Double = v1.x * v2.x + v1.y * v2.y + v1.z * v2.z

fun main() {
    val v1 = Vector(1.0, 2.0, 3.0)
    val v2 = Vector(3.0, 2.0, 1.0)

    println("Длина вектора v1: ${v1.length()}")
    println("Скалярное произведение (метод): ${v1.dotProduct(v2)}")
    println("Скалярное произведение (infix): ${v1 dot v2}")
    println("Скалярное произведение (operator): ${v1 * v2}")
    println("Скалярное произведение (функция): ${dotProduct(v1, v2)}")
}