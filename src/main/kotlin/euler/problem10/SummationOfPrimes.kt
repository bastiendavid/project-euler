package euler.problem10

import euler.prime.PrimeNumbers

/**
 * https://projecteuler.net/problem=10
 *
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * Find the sum of all the primes below two million.
 */
class SummationOfPrimes {
    fun sumBelow(below: Long): Any {
        return PrimeNumbers().listPrimeNumbersBelow(below).reduce { acc, l -> l + acc }
    }

}