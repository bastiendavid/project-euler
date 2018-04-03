package euler.problem7

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

internal class PrimeNumber10001stTest {

    @Test
    fun prime_number_in_position_10_is_13() {
        Assertions.assertThat(PrimeNumber10001st().numberInPosition(6)).isEqualTo(13)
    }

    @Test
    fun prime_number_in_position_10001_is_104743() {
        Assertions.assertThat(PrimeNumber10001st().numberInPosition(10001)).isEqualTo(104743)
    }
}