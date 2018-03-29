package euler.problem3

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

internal class LargestPrimeFactorTest {

    @Test
    fun largestPrimeFactorOf4is2() {
        Assertions.assertThat(LargestPrimeFactor().of(4)).isEqualTo(2)
    }

    @Test
    fun largestPrimeFactorOf10is5() {
        Assertions.assertThat(LargestPrimeFactor().of(10)).isEqualTo(5)
    }

    @Test
    fun largestPrimeFactorOf13is13() {
        Assertions.assertThat(LargestPrimeFactor().of(13)).isEqualTo(13)
    }

    @Test
    fun largestPrimeFactorOf20is5() {
        Assertions.assertThat(LargestPrimeFactor().of(20)).isEqualTo(5)
    }

    @Test
    fun largestPrimeFactorOf26is13() {
        Assertions.assertThat(LargestPrimeFactor().of(26)).isEqualTo(13)
    }

    @Test
    fun largestPrimeFactorOf600851475143is6857() {
        Assertions.assertThat(LargestPrimeFactor().of(600851475143)).isEqualTo(6857)
    }
}