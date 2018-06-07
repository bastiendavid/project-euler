package euler.problem23

import euler.divisors.Divisors

/**
 * https://projecteuler.net/problem=23
 *
 * A perfect number is a number for which the sum of its proper divisors is exactly equal to the number. For example, the sum of the proper divisors of 28 would be 1 + 2 + 4 + 7 + 14 = 28, which means that 28 is a perfect number.
 *
 * A number n is called deficient if the sum of its proper divisors is less than n and it is called abundant if this sum exceeds n.
 *
 * As 12 is the smallest abundant number, 1 + 2 + 3 + 4 + 6 = 16, the smallest number that can be written as the sum of two abundant numbers is 24. By mathematical analysis, it can be shown that all integers greater than 28123 can be written as the sum of two abundant numbers. However, this upper limit cannot be reduced any further by analysis even though it is known that the greatest number that cannot be expressed as the sum of two abundant numbers is less than this limit.
 *
 * Find the sum of all the positive integers which cannot be written as the sum of two abundant numbers.
 */
class NonAbundantSums {

    fun notSumOfTwoAbundantNumbersUnder(under: Long): List<Long> {
        return (1..under).subtract(sumOfTwoAbundantNumbersUnder(under)).toList()
    }

    fun sumOfTwoAbundantNumbersUnder(under: Long): List<Long> {
        val abundantNumbers = abundantNumbersUnder(under)
        return abundantNumbers.mapIndexed { index, l -> abundantNumbers.subList(index, abundantNumbers.size - 1).map { it + l }.filter { it <= 28123 } }.flatten()
    }

    fun abundantNumbersUnder(under: Long): List<Long> {
        return (1..under).filter { isAbundant(it) }
    }

    fun isAbundant(number: Long): Boolean {
        return Divisors().properDivisorsOf(number).sum() > number
    }
}