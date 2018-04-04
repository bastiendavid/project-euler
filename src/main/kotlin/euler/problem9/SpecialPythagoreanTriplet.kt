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
                    val triplet = Triplet(a, b, c)
                    if (triplet.isPythagoreanTriplet() && triplet.hasSumOf1000()) {
                        return triplet
                    }
                }
            }
        }
        return null
    }
}

class Triplet(val a: Int, val b: Int, val c: Int) {
    fun isPythagoreanTriplet(): Boolean {
        return a < b && b < c && a * a + b * b == c * c
    }

    fun hasSumOf1000(): Boolean {
        return a + b + c == 1000
    }
}