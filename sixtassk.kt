fun main() {
    println("Решение квадратного уравнения ax² + bx + c = 0")
    print("Введите a: ")
    val a = readln().toDouble()
    print("Введите b: ")
    val b = readln().toDouble()
    print("Введите c: ")
    val c = readln().toDouble()

    quadraticRoot(a, b, c)
}

fun sqr(n: Double): Double = n * n

fun discriminant(a: Double, b: Double, c: Double): Double = sqr(b) - 4 * a * c

fun rootsNumber(a: Double, b: Double, c: Double): Int {
    val d = discriminant(a, b, c)
    return when {
        d > 0 -> 2
        d == 0.0 -> 1
        else -> 0
    }
}

fun quadraticRoot(a: Double, b: Double, c: Double) {
    val d = discriminant(a, b, c)

    when (rootsNumber(a, b, c)) {
        2 -> {
            val x1 = (-b + Math.sqrt(d)) / (2 * a)
            val x2 = (-b - Math.sqrt(d)) / (2 * a)
            println("Два корня: x1 = $x1, x2 = $x2")
        }
        1 -> {
            val x = -b / (2 * a)
            println("Один корень: x = $x")
        }
        else -> println("Действительных корней нет")
    }
}