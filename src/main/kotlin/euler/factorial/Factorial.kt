package euler.factorial

import java.math.BigInteger

class Factorial {
    infix fun of(number: Int): BigInteger {
        return if (number == 0) BigInteger.ONE else (1..number).map { BigInteger(it.toString()) }.reduce { acc, i -> i * acc }
    }
}