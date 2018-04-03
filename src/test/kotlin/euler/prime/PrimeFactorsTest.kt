package euler.prime

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test
import java.util.*

internal class PrimeFactorsTest {

    @Test
    fun prime_factors_of_2_are_2() {
        Assertions.assertThat(PrimeFactors().decompose(2)).isEqualTo(Arrays.asList(2L))
    }

    @Test
    fun prime_factors_of_3_are_3() {
        Assertions.assertThat(PrimeFactors().decompose(3)).isEqualTo(Arrays.asList(3L))
    }

    @Test
    fun prime_factors_of_4_are_2_and_2() {
        Assertions.assertThat(PrimeFactors().decompose(4)).isEqualTo(Arrays.asList(2L, 2L))
    }

    @Test
    fun prime_factors_of_8_are_2_and_2_and_2() {
        Assertions.assertThat(PrimeFactors().decompose(8)).isEqualTo(Arrays.asList(2L, 2L, 2L))
    }

    @Test
    fun prime_factors_of_9_are_3_and_3() {
        Assertions.assertThat(PrimeFactors().decompose(9)).isEqualTo(Arrays.asList(3L, 3L))
    }

    @Test
    fun prime_factors_of_13_are_13() {
        Assertions.assertThat(PrimeFactors().decompose(13)).isEqualTo(Arrays.asList(13L))
    }

    @Test
    fun prime_factors_of_20_are_2_and_2_and_5() {
        Assertions.assertThat(PrimeFactors().decompose(20)).isEqualTo(Arrays.asList(2L, 2L, 5L))
    }

    @Test
    fun prime_factors_of_26_are_2_and_13() {
        Assertions.assertThat(PrimeFactors().decompose(26)).isEqualTo(Arrays.asList(2L, 13L))
    }
}