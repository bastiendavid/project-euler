package euler.problem7

import euler.prime.PrimeFactors

/**
 * https://projecteuler.net/problem=7
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 * What is the 10 001st prime number?
 */
class PrimeNumber10001st {
    fun numberInPosition(position: Long): Long {
        return PrimeFactors().listPrimeNumbers(position).last()
    }
}