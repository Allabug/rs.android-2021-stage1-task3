package subtask2

class SquareDecomposer {

    fun decomposeNumber(number: Int): Array<Int>? {

        return if (number >= 5) {
            decompose(number * number, number - 1)
        } else {
            null
        }
    }

    private fun decompose(numberSqr: Int, nextNumber: Int): Array<Int>? {
        for (i in nextNumber downTo 1) {
            val remainder = numberSqr - i * i

            if (remainder == 0) return arrayOf(i)

            val nextNum = kotlin.math.sqrt(remainder.toDouble()).toInt()
            val resultNum = if (nextNum >= i) decompose(remainder, i - 1)
            else decompose(remainder, nextNum)
            if (resultNum != null) return resultNum + arrayOf(i)
        }
        return null
    }
}


