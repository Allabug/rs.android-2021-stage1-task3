package subtask1

import java.math.BigInteger

class Combinator {

    fun checkChooseFromArray(array: Array<Int>): Int? {
        val posters: Int
        val colors: Int
        var result: Int? = null

        if (array.isNotEmpty() && array.size == 2) {
            posters = array[0]
            colors = array[array.lastIndex]

            for (i in 1 until (colors)) {
                val numberOfCombinations = getNumberOfCombinations(i, colors)?.toInt()
                if (numberOfCombinations == posters) {
                    result = i
                    break
                }
            }
        }

        return result
    }

    private fun getFactorial(f: Int): BigInteger? {
        var result = BigInteger.ONE
        for (i in 1..f) result = result.multiply(BigInteger.valueOf(i.toLong()))
        return result
    }

    private fun getNumberOfCombinations(i: Int, colors: Int): BigInteger? {
        return getFactorial(colors)?.divide(getFactorial(colors - i)?.multiply(getFactorial(i)))
    }
}
