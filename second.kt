fun main(){
    var count = -1.0
    var sum = 0.0
    var average = 0.0
    var number: Double
    println("Вводите числа(0 - остановка)")
    do {
        number = readln().toDouble()
        count+=1
        sum+=number
    } while (number != 0.0)
    average=sum/count
    println("Введено чисел: $count")
    println("Сумма чисел: $sum")
    println("Среднее арифметическое: $average")
}