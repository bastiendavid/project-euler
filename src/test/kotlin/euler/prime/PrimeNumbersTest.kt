package euler.prime

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test
import java.util.*

internal class PrimeNumbersTest {

    @Test
    fun prime_factors_of_2_are_2() {
        Assertions.assertThat(PrimeNumbers().decompose(2)).isEqualTo(Arrays.asList(2L))
    }

    @Test
    fun prime_factors_of_3_are_3() {
        Assertions.assertThat(PrimeNumbers().decompose(3)).isEqualTo(Arrays.asList(3L))
    }

    @Test
    fun prime_factors_of_4_are_2_and_2() {
        Assertions.assertThat(PrimeNumbers().decompose(4)).isEqualTo(Arrays.asList(2L, 2L))
    }

    @Test
    fun prime_factors_of_8_are_2_and_2_and_2() {
        Assertions.assertThat(PrimeNumbers().decompose(8)).isEqualTo(Arrays.asList(2L, 2L, 2L))
    }

    @Test
    fun prime_factors_of_9_are_3_and_3() {
        Assertions.assertThat(PrimeNumbers().decompose(9)).isEqualTo(Arrays.asList(3L, 3L))
    }

    @Test
    fun prime_factors_of_13_are_13() {
        Assertions.assertThat(PrimeNumbers().decompose(13)).isEqualTo(Arrays.asList(13L))
    }

    @Test
    fun prime_factors_of_20_are_2_and_2_and_5() {
        Assertions.assertThat(PrimeNumbers().decompose(20)).isEqualTo(Arrays.asList(2L, 2L, 5L))
    }

    @Test
    fun prime_factors_of_26_are_2_and_13() {
        Assertions.assertThat(PrimeNumbers().decompose(26)).isEqualTo(Arrays.asList(2L, 13L))
    }

    @Test
    fun list_first_three_prime_numbers() {
        Assertions.assertThat(PrimeNumbers().listPrimeNumbers(3)).containsExactlyInAnyOrderElementsOf(Arrays.asList(2, 3, 5))
    }

    @Test
    fun list_first_ten_prime_numbers() {
        Assertions.assertThat(PrimeNumbers().listPrimeNumbers(10)).containsExactlyInAnyOrderElementsOf(Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29))
    }
}