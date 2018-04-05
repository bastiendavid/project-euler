package euler.problem10

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

internal class SummationOfPrimesTest {

    @Test
    fun sum_of_primes_below_10_is_17() {
        Assertions.assertThat((SummationOfPrimes().sumBelow(10))).isEqualTo(17L)
    }

    @Test
    fun sum_of_primes_below_2_millions_is_142913828922() {
        Assertions.assertThat((SummationOfPrimes().sumBelow(2000000))).isEqualTo(142913828922L)
    }
}