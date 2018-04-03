package euler.problem6

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

internal class SumSquareDifferenceTest {

    @Test
    fun difference_for_numbers_below_10_is_2640() {
        Assertions.assertThat(SumSquareDifference().difference(10)).isEqualTo(2640)
    }

    @Test
    fun difference_for_numbers_below_1000_is_2640() {
        Assertions.assertThat(SumSquareDifference().difference(1000)).isEqualTo(250166416500L)
    }
}