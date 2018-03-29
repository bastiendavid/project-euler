package euler.problem3

import kotlin.math.sqrt

/**
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 */
class LargestPrimeFactor {
    fun of(number: Long): Long {
        var remainder = number
        var largestPrimeFactor = number

        val verifyIsPrimeAndUpdate = { value: Long ->
            if (remainder % value == 0L) {
                largestPrimeFactor = value
                remainder /= value
            }
        }

        verifyIsPrimeAndUpdate(2)
        for (i in 3 until sqrt(number.toDouble()).toLong() step 2) {
            verifyIsPrimeAndUpdate(i)
        }
        return largestPrimeFactor
    }
}