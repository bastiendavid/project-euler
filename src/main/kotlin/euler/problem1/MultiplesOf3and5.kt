package euler.problem1

/**
 * https://projecteuler.net/problem=1
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */
class MultiplesOf3and5 {
    fun sum(below: Int): Int {
        return (0 until below)
                .filter { value -> value % 3 == 0 || value % 5 == 0 }
                .reduce { acc, value -> acc + value }
    }

}