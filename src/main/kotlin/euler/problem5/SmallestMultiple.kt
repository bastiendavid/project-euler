package euler.problem5

import euler.prime.PrimeFactors

/**
 * https://projecteuler.net/problem=5
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */
class SmallestMultiple {

    fun evenlyDivisibleBelow(below: Long): Any {
        var factors = ArrayList<Long>()
        for (number in 2..below) {
            val primeFactors = PrimeFactors().decompose(number)
            factors = mergeCollections(factors, primeFactors)
        }
        return factors.reduce { acc, l -> l * acc }
    }

    fun mergeCollections(c1: Iterable<Long>, c2: Iterable<Long>): ArrayList<Long> {
        val numbersToAddToc1 = ArrayList<Long>()
        numbersToAddToc1.addAll(c2)
        val copyOfc1 = ArrayList<Long>()
        copyOfc1.addAll(c1)

        c2.forEach { number ->
            if (copyOfc1.contains(number)) {
                numbersToAddToc1.remove(number)
                copyOfc1.remove(number)
            }
        }
        val result = ArrayList<Long>()
        result.addAll(c1)
        result.addAll(numbersToAddToc1)
        result.sort()
        return result
    }

}