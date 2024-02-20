import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*

fun main() {
    var year: Int = Calendar.getInstance().get(Calendar.YEAR)
    val formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy")
    var today = LocalDate.now()
    val formattedToday = today.format(formatter)

    println("Today is $formattedToday")

    var firstMoonMonth = 1
    var firstMoonDay = 25

    var firstMoonDate: LocalDate = LocalDate.of(year, firstMoonMonth, firstMoonDay)
    var firstMoonFormatted = firstMoonDate.format(formatter)
    var nextMoonDate = firstMoonDate

    do{
        nextMoonDate = nextMoonDate.plusDays(30)
    } while (nextMoonDate.isBefore(today))

    var nextMoonFormatted = nextMoonDate.format(formatter)
    println("The next full moon is on $nextMoonFormatted")
}