package subtask3

class TelephoneFinder {

    fun findAllNumbersFromGivenNumber(number: String): Array<String>? {

        var resultArray = emptyArray<String>()

        if (number.isNotEmpty() && number.all { it.isDigit() }) {
            for (i in number.indices) {
                var count = 0
                val setOfNumbers = getSetOfNumbers(number[i])
                while (count != setOfNumbers.length) {
                    val result = number.replace(number[i], setOfNumbers[count])
                    resultArray += result
                    count++
                }
            }
        } else {
            return null
        }
        return resultArray
    }

    private fun getSetOfNumbers(numb: Char): String = when (numb) {
        '1' -> "24"
        '2' -> "153"
        '3' -> "26"
        '4' -> "157"
        '5' -> "2468"
        '6' -> "359"
        '7' -> "48"
        '8' -> "5790"
        '9' -> "68"
        else -> "8"
    }
}
