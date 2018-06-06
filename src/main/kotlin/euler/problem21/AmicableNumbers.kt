package euler.problem21

import euler.divisors.Divisors

/**
 * https://projecteuler.net/problem=21
 *
 * Let d(n) be defined as the sum of proper divisors of n (numbers less than n which divide evenly into n).
 * If d(a) = b and d(b) = a, where a ≠ b, then a and b are an amicable pair and each of a and b are called amicable numbers.
 *
 * For example, the proper divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 and 110; therefore d(220) = 284. The proper divisors of 284 are 1, 2, 4, 71 and 142; so d(284) = 220.
 *
 * Evaluate the sum of all the amicable numbers under 10000.
 */
class AmicableNumbers {
    fun sumOfProperDivisors(number: Long): Long {
        return if (number == 1L) 0 else Divisors().properDivisorsOf(number).reduce { acc, l -> acc + l }
    }

    fun areAmicable(number1: Long, number2: Long): Boolean {
        return number1 != number2 && sumOfProperDivisors(number1) == number2 && sumOfProperDivisors(number2) == number1
    }

    private fun toAmicable(number1: Long, number2: Long): List<Long> {
        return if (areAmicable(number1, number2)) listOf(number1, number2) else emptyList()
    }

    // not optimized since we do a calculation  of proper divisors twice but more readable
    fun sumOfAmicableNumbersUnder(under: Long): Long {
        return (2..under).flatMap { n -> toAmicable(n, sumOfProperDivisors(n)) }.distinct().reduce { acc, l -> acc + l }
    }
}