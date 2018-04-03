package euler.prime

import kotlin.math.sqrt

class PrimeNumbers {

    fun decompose(number: Long): ArrayList<Long> {

        var remainder = number
        val factors = ArrayList<Long>()

        val verifyIsPrimeAndUpdate: (Long) -> Boolean = { value: Long ->
            var added = false
            if (remainder % value == 0L) {
                factors.add(value)
                remainder /= value
                added = true
            }
            added
        }

        var current = 2L
        var isPrimeFactor = true
        while (isPrimeFactor) {
            isPrimeFactor = verifyIsPrimeAndUpdate(current)
        }
        current++
        while (current <= sqrt(remainder.toDouble()).toLong()) {
            isPrimeFactor = verifyIsPrimeAndUpdate(current)
            if (!isPrimeFactor) {
                current += 2
            }
        }

        if (remainder != 1L) {
            factors.add(remainder)
        }

        return factors
    }

    fun listPrimeNumbers(howMany: Long): ArrayList<Long> {
        val factors = ArrayList<Long>()
        var currentNumber: Long = 2

        val isPrime: (Long) -> Boolean = { number ->
            var prime = true
            for (i in factors) {
                if (i > sqrt(number.toDouble())) {
                    break
                }
                if (number % i == 0L) {
                    prime = false
                    break
                }
            }
            prime
        }

        while (factors.size < howMany) {
            if (isPrime(currentNumber)) {
                factors.add(currentNumber)
            }
            ++currentNumber
        }

        return factors
    }
}