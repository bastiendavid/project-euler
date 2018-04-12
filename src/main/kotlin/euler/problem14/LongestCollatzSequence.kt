package euler.problem14

/**
 * https://projecteuler.net/problem=14
 *
 * The following iterative sequence is defined for the set of positive integers:
 *
 * n → n/2 (n is even)
 * n → 3n + 1 (n is odd)
 *
 * Using the rule above and starting with 13, we generate the following sequence:
 *
 * 13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
 * It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.
 *
 * Which starting number, under one million, produces the longest chain?
 *
 * NOTE: Once the chain starts the terms are allowed to go above one million.
 */
class LongestCollatzSequence {
    fun sequence(startingNumber: Long): List<Long> {
        val sequence = ArrayList<Long>()
        sequence.add(startingNumber)
        while (sequence.last() != 1L) {
            sequence.add(next(sequence.last()))
        }
        return sequence
    }

    fun next(number: Long): Long {
        return if (number % 2 == 0L) number / 2 else 3 * number + 1
    }

    fun startingNumberForLongestChainBelow(below: Int): Int {
        var chain = emptyList<Long>()
        var max = 1
        for (i in below downTo 1) {
            val newChain = sequence(i.toLong())
            if (newChain.size > chain.size) {
                max = i
                chain = newChain
            }
        }
        return max
    }
}