import java.time.LocalDate

fun main() {
    var currentDate = LocalDate.now()
    var month = currentDate.getMonthValue()
    var daysInMonth = when (month) {
        1, 3, 5, 7, 8, 10, 12 -> 31
        4, 6, 9, 11 -> 30
        else -> if (currentDate.isLeapYear()) 29 else 28
    }
    println("There are $daysInMonth days in current month")
}