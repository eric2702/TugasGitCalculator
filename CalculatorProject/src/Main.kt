import kotlin.math.pow

fun multiply(a: Int, b: Int): Int {
    return a * b
}

fun grades(number: Int, grade: Int): Int {
    return number.toDouble().pow(grade.toDouble()).toInt()
}

fun readInput(msg: String): Int {
    var masukan = 0
    try {
        print(msg)
        masukan = readLine()!!.toInt()
    } catch (e:Exception) {
        println("tolong kasi integer")
    }
    return masukan
}

fun main() {
    println("Welcome to Calculator Apps!")
    var operation = -1
    while (operation != 6) {
        println()
        println()
        println("=============================================================")
        println("Please select the number of menu to use this calculator Apps!")
        println("1. Multiply Operation")
        println("2. Division Operation")
        println("3. Plus Operation")
        println("4. Grade Operation (Bilangan Pangkat)")
        println("5. Minus Operation")
        println("6. Close Application")
        println("=============================================================")
        println()
        println()

        operation = readInput("Choose menu : ")

        var first:Int
        var second:Int
        if (operation in 1..5) {
            first = readInput("Input first number : ")
            second = readInput("Input second number : ")

            when (operation) {
                1 -> {
                    println("Result of multiply $first with $second is ${multiply(first, second)}")
                }
                2 -> {
                    // print first and second number and call the function
                }
                3 -> {
                    // print first and second number and call the function
                }
                4 -> {
                    println("Result of grade value $first of $second is ${grades(first, second)}")
                }
                else -> {
                    // print first and second number and call the function
                }
            }
        }
    }

    println("Thank you for using this calculator Apps")
}