package euler.problem24

import euler.factorial.Factorial

/**
 *
 * https://projecteuler.net/problem=24
 *
 * A permutation is an ordered arrangement of objects. For example, 3124 is one possible permutation of the digits 1, 2, 3 and 4. If all of the permutations are listed numerically or alphabetically, we call it lexicographic order. The lexicographic permutations of 0, 1 and 2 are:
 *
 * 012   021   102   120   201   210
 *
 * What is the millionth lexicographic permutation of the digits 0, 1, 2, 3, 4, 5, 6, 7, 8 and 9?
 */
class LexicographicPermutations {
    fun sortedPermutationsOf(number: String): List<String> {
        val sortedNumber = number.toList().sorted().map { "$it" }.reduce { acc, s -> "$acc$s" }
        return Permutations().of(sortedNumber)
    }

    /**
     * The brute force implementation
     */
    fun permutationNumberNByBruteForce(number: String, nth: Int): String {
        return sortedPermutationsOf(number)[nth]
    }

    /**
     * The clever implementation - will only work on an input that has not the same character twice
     * Using the fact that the number of permutation of N elements is N! to select each path of the sorted combination tree
     */
    fun permutationNumberN(number: String, nth: Int): String {
        val sortedNumber = number.toList().sorted().map { "$it" }.reduce { acc, s -> "$acc$s" }
        return iterate(sortedNumber, "", 0, nth)
    }

    private fun iterate(string: String, computedPermutation: String, position: Int, nth: Int): String {
        // Compute how many combination per tree branch
        val combinationRanges = (1..string.length).map { it * Factorial().of(string.length - 1).toInt() }
        var previousRange = 0
        // search for the next branch for with the nth position is in
        for ((index, range) in combinationRanges.withIndex()) {
            if (previousRange + position <= nth && range + position > nth) {
                return iterate(string.replace("${string[index]}", ""), computedPermutation.plus("${string[index]}"), position + previousRange, nth)
            }
            previousRange = range
        }
        return computedPermutation
    }


    fun numberOfPermutationsOf(number: String): Int {
        return Factorial().of(number.length).toInt()
    }
}