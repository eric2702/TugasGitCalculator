fun multiply(a: Int, b: Int): Int {
    return a * b
}

fun main() {
    println("Welcome to Calculator Apps!")
    var operation = -1
    while (operation != 5) {
        println("Please select the number of menu to use this calculator Apps!")
        println("1. Multiply Operation")
        println("2. Division Operation")
        println("3. Plus Operation")
        println("4. Minus Operation")
        println("5. Close Application")
        while (true) {
            try {
                print("menu: ")
                operation = readLine()!!.toInt()
                break
            } catch (e:Exception) {
                println("tolong kasi integer")
            }
        }
        var first:Int
        if (operation >= 1 && operation <= 4) {
            while (true) {
                try {
                    print("Input first number : ")
                    first = readLine()!!.toInt()
                    break
                } catch (e:Exception) {
                    println("tolong kasi integer")
                }
            }

            var second:Int
            while (true) {
                try {
                    print("Input second number : ")
                    second = readLine()!!.toInt()
                    break
                } catch (e:Exception) {
                    println("tolong kasi integer")
                }
            }
            when (operation) {
                1 -> {
                    println(multiply(first, second))
                }
                2 -> {
                    // print first and second number and call the function
                }
                3 -> {
                    // print first and second number and call the function
                }

                else -> {
                    // print first and second number and call the function
                }
            }
        }

    }
    println("Thank you for using this calculator Apps")
}