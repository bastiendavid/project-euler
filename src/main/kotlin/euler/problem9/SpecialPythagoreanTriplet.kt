package euler.problem9

/**
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
 * <p>
 * a2 + b2 = c2
 * For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
 * <p>
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 */
class SpecialPythagoreanTriplet {

    fun findTriplet(): Triplet? {
        for (a in 0..1000) {
            for (b in 0..1000) {
                for (c in 0..1000) {
                    if (isPythagoreanTriplet(a, b, c) && hasSumOf1000(a, b, c)) {
                        return Triplet(a, b, c)
                    }
                }
            }
        }
        return null
    }

    fun hasSumOf1000(a: Int, b: Int, c: Int) = a + b + c == 1000

    fun isPythagoreanTriplet(a: Int, b: Int, c: Int) = a < b && b < c && a * a + b * b == c * c
}


data class Triplet(val a: Int, val b: Int, val c: Int)