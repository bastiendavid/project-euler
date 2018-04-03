package euler.problem6

class SumSquareDifference {
    fun difference(below: Long): Long {
        return squareOfSum(below) - sumOfSquares(below)
    }

    private fun squareOfSum(below: Long): Long {
        val sum = (0..below).reduce { acc, l -> acc + l }
        return sum * sum
    }

    private fun sumOfSquares(below: Long): Long {
        return (0..below).reduce { acc, l -> acc + l * l }
    }
}
