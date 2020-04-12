package subtask2

class TimeConverter {

    fun toTextFormat(hour: String, minute: String): String {
        val h=hour.toInt()
        val m=minute.toInt()

        val textTimeList= listOf("one","two","three","four","five","six","seven","eight","nine","ten","eleven",
            "twelve","thirteen","thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen",
            "twenty", "twenty one", "twenty two", "twenty three", "twenty four","twenty five", "twenty six",
            "twenty seven", "twenty eight", "twenty nine")

        return when(m){
            0 -> "${textTimeList[h-1]} o' clock"
            1 -> "${textTimeList[m-1]} minute past ${textTimeList[h-1]}"
            15-> "quarter past ${textTimeList[h-1]}"
            30-> "half past ${textTimeList[h-1]}"
            45-> "quarter to ${textTimeList[h]}"
            in 2..29 ->"${textTimeList[m-1]} minutes past ${textTimeList[h-1]}"
            in 31..44->"${textTimeList[60-m]} minutes to ${textTimeList[h]}"
            in 46..59->"${textTimeList[60-m-1]} minutes to ${textTimeList[h]}"
            else -> ""
        }
    }
}
