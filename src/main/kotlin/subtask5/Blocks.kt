package subtask5

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import kotlin.reflect.KClass

class Blocks {

    fun getData(blockA: Array<Any>, blockB: KClass<*>): Any {
        val listOfKClass=blockA.filter { it::class==blockB }

        return when(blockB){
            String::class -> listOfKClass.joinToString("")
            Int::class ->listOfKClass.sumBy { it.toString().toInt() }
            LocalDate::class ->(listOfKClass as List<LocalDate>)
                .max()?.format(DateTimeFormatter.ofPattern("dd.MM.yyyy")) ?: ""
            else -> ""
        }
    }
}
