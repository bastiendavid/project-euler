package euler.problem21

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

internal class AmicableNumbersTest {

    @Test
    fun sum_of_proper_divisors() {
        Assertions.assertThat(AmicableNumbers().sumOfProperDivisors(1)).isEqualTo(0)
        Assertions.assertThat(AmicableNumbers().sumOfProperDivisors(220)).isEqualTo(284)
        Assertions.assertThat(AmicableNumbers().sumOfProperDivisors(284)).isEqualTo(220)
    }

    @Test
    fun two_numbers_are_amicable() {
        Assertions.assertThat(AmicableNumbers().areAmicable(220, 285)).isFalse()
        Assertions.assertThat(AmicableNumbers().areAmicable(220, 284)).isTrue()
    }

    @Test
    fun two_numbers_are_not_amicable_if_not_different() {
        Assertions.assertThat(AmicableNumbers().areAmicable(6, 6)).isFalse()
    }

    @Test
    fun sum_of_amicable_numbers_under_10000() {
        Assertions.assertThat(AmicableNumbers().sumOfAmicableNumbersUnder(10000)).isEqualTo(31626)
    }
}