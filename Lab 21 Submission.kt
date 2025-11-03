----------------------------------------------------------------------------------------------
fun getDayOfWeek(dayNumber: Int): String {
    return when (dayNumber) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Invalid day number"
    }
}

fun main() {
    print("Enter a number (1-7): ")
    val input = readLine()?.toIntOrNull()
    if (input != null) {
        println("Day of week: ${getDayOfWeek(input)}")
    } else {
        println("Invalid input. Please enter an integer.")
    }
}
----------------------------------------------------------------------------------------------
class Person(val name: String, val age: Int) {
    fun introduce() {
        println("Hello, my name is $name and I am $age years old.")
    }
}

fun main() {
    val person = Person("Alice", 25)
    person.introduce()
}
----------------------------------------------------------------------------------------------
class Calculator {

    fun add(a: Int, b: Int): Int {
        return a + b
    }

    fun subtract(a: Int, b: Int): Int {
        return a - b
    }

    fun multiply(a: Int, b: Int): Int {
        return a * b
    }

    fun divide(a: Int, b: Int): Double {
        return if (b != 0) a.toDouble() / b else {
            println("Error: Division by zero")
            Double.NaN
        }
    }
}

fun main() {
    val calc = Calculator()

    println("Add: ${calc.add(5, 3)}")
    println("Subtract: ${calc.subtract(5, 3)}")
    println("Multiply: ${calc.multiply(5, 3)}")
    println("Divide: ${calc.divide(5, 0)}")
}
-------------------------------------------------------------------------------------------
