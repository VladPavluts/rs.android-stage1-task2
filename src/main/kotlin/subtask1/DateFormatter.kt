package subtask1

import java.util.Calendar.*

class DateFormatter {

    fun toTextDay(day: String, month: String, year: String): String {
        val calendar = getInstance()
        calendar.set(YEAR, year.toInt())
        calendar.set(DAY_OF_MONTH, day.toInt())
        calendar.set(MONTH, month.toInt()-1)

        if(day.toInt()==29 && month.toInt()==2 && year.toInt()% 4!=0)
            return "Такого дня не существует"
        val dayOfWeek = calendar.get(DAY_OF_WEEK)
        val listOfMonths = listOf(
            "января", "февраля", "марта", "апреля", "мая",
            "июня", "июля", "августа", "сентября", "октября", "ноября", "декабря"
        )
        return try {

            when (dayOfWeek) {
                MONDAY -> "$day ${listOfMonths[month.toInt() - 1]}, понедельник"
                TUESDAY -> "$day ${listOfMonths[month.toInt() - 1]}, вторник"
                WEDNESDAY -> "$day ${listOfMonths[month.toInt() - 1]}, среда"
                THURSDAY -> "$day ${listOfMonths[month.toInt() - 1]}, четверг"
                FRIDAY -> "$day ${listOfMonths[month.toInt() - 1]}, пятница"
                SATURDAY -> "$day ${listOfMonths[month.toInt() - 1]}, суббота"
                SUNDAY -> "$day ${listOfMonths[month.toInt() - 1]}, воскресенье"
                else -> "Такого дня не существует"
            }


        }catch (e: Exception){
            "Такого дня не существует"
        }
    }
}
