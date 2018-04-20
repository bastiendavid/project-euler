package euler.problem16

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

internal class PowerDigitSumTest {

    @Test
    fun sum_of_digits_of_2_power_1000_is_1366() {
        Assertions.assertThat(PowerDigitSum().sumOfDigitsOf2Power(1000)).isEqualTo(1366)
    }

    @Test
    fun sum_of_digits_of_2_power_15_is_26() {
        Assertions.assertThat(PowerDigitSum().sumOfDigitsOf2Power(15)).isEqualTo(26)
    }

    @Test
    fun sum_of_digits_of_2_power_2_is_2() {
        Assertions.assertThat(PowerDigitSum().sumOfDigitsOf2Power(2)).isEqualTo(4)
    }

    @Test
    fun two_power_1_is_2() {
        Assertions.assertThat(PowerDigitSum().twoPower(1)).isEqualTo(2)
    }

    @Test
    fun two_power_2_is_4() {
        Assertions.assertThat(PowerDigitSum().twoPower(2)).isEqualTo(4)
    }

    @Test
    fun two_power_0_is_1() {
        Assertions.assertThat(PowerDigitSum().twoPower(0)).isEqualTo(1)
    }
}