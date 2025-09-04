//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val inputNumber = readln()
    val firstChar = inputNumber.first()
    val lastChar = inputNumber.last()
    val answer = firstChar.toString().toInt()+lastChar.toString().toInt()
    println(answer)
    }