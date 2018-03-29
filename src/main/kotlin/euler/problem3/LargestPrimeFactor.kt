package euler.problem3

import euler.prime.PrimeFactors

/**
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 */
class LargestPrimeFactor {
    fun of(number: Long): Long {
        return PrimeFactors().decompose(number).last()
    }
}