fun main() {
    val array = intArrayOf(1, 3, 2, 5, 4, 6, 3, 1)

    println("Элементы больше соседних (for):")
    for (i in 1 until array.size - 1) {
        if (array[i] > array[i - 1] && array[i] > array[i + 1]) {
            print("${array[i]} ")
        }
    }
    println()

    println("Элементы больше соседних (while):")
    var i = 1
    while (i < array.size - 1) {
        if (array[i] > array[i - 1] && array[i] > array[i + 1]) {
            print("${array[i]} ")
        }
        i++
    }
    println()

    println("Элементы больше соседних (forEach):")
    array.forEachIndexed { index, value ->
        if (index > 0 && index < array.size - 1 &&
            value > array[index - 1] && value > array[index + 1]) {
            print("$value ")
        }
    }
    println()
    
    println("Произведение элементов: ${array.reduce { acc, value -> acc * value }}")
    println("Минимальный элемент: ${array.min()}")
    println("Максимальный элемент: ${array.max()}")
}