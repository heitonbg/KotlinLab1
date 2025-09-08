fun main() {
    print("Введите количество простых чисел: ")
    val n = readln().toInt()

    var count = 0
    var number = 2

    while (count < n) {
        if (isPrime(number)) {
            count++
            println("$count-ое число: $number")
        }
        number++
    }
}

fun isPrime(num: Int): Boolean {
    if (num < 2) return false
    for (i in 2 until num) {
        if (num % i == 0) return false
    }
    return true
}