package euler.problem16

import java.math.BigInteger

/**
 * https://projecteuler.net/problem=16
 *
 * 2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
 *
 * What is the sum of the digits of the number 2^1000?
 */
class PowerDigitSum {
    fun sumOfDigitsOf2Power(power: Int): Int {
        return twoPower(power).toString()
                .map { "$it".toInt() }
                .reduce { acc, i -> acc + i }
    }

    fun twoPower(power: Int): BigInteger {
        if (power == 0) return BigInteger.ONE
        return (0 until power)
                .map { BigInteger("2") }
                .reduce { acc, i -> acc * i }
    }
}