class ArrayProcessor(private val array: IntArray) {

    fun sumPositive(): Int {
        return array.filter { it > 0 }.sum()
    }

    fun product(): Long {
        return array.fold(1L) { acc, value -> acc * value }
    }

    fun average(): Double {
        return if (array.isNotEmpty()) array.average() else 0.0
    }
}

fun main() {
    val processor = ArrayProcessor(intArrayOf(1, -2, 3, -4, 5))

    println("Сумма положительных элементов: ${processor.sumPositive()}")
    println("Произведение элементов: ${processor.product()}")
    println("Среднее арифметическое: ${processor.average()}")
}