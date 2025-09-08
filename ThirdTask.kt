fun main() {
    val secretNumber = (0..10).random()
    var attempts = 0

    println("Угадай число от 0 до 10")

    while (true) {
        print("Твой вариант: ")
        val userGuess = readln().toInt()
        attempts++

        when {
            userGuess > secretNumber -> println("Много")
            userGuess < secretNumber -> println("Мало")
            else -> {
                println("Угадал! Количество попыток: $attempts")
                break
            }
        }
    }
}