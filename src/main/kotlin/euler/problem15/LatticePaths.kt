package euler.problem15

import euler.factorial.Factorial
import java.math.BigInteger

/**
 * https://projecteuler.net/problem=15
 *
 * Starting in the top left corner of a 2×2 grid, and only being able to move to the right and down, there are exactly 6 routes to the bottom right corner.
 * How many such routes are there through a 20×20 grid?
 */
class LatticePaths {

    fun numberOfUniquePaths(size: Int): BigInteger {
        // Number of unique permutations if n! / (n/2! * n/2!) with n = 2*size
        // More here: https://brilliant.org/wiki/permutations-with-repetition/
        val factorial = Factorial()
        return factorial.of(size * 2) / (factorial.of(size) * factorial.of(size))
    }
}