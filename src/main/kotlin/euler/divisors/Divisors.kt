package euler.divisors

import euler.prime.PrimeNumbers

class Divisors {

    infix fun divisorsOf(number: Long): List<Long> {
        return productsOf(PrimeNumbers().decompose(number)).plus(1)
    }

    infix fun productsOf(numbers: List<Long>): List<Long> {
        if (numbers.size <= 1) {
            return numbers
        }
        val list = ArrayList<Long>()
        val subproducts = productsOf(numbers.subList(1, numbers.size))
        list.add(numbers[0])
        list.addAll(subproducts)
        list.addAll(subproducts.map { l -> l * numbers[0] })
        return list.distinct().sorted()
    }

    infix fun properDivisorsOf(number: Long): List<Long> {
        return divisorsOf(number).minus(number)
    }
}