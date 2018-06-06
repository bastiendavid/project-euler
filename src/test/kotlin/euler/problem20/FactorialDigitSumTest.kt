package euler.problem20

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

internal class FactorialDigitSumTest {

    @Test
    fun sum_of_digits_of_factorial_1_is_1() {
        Assertions.assertThat(FactorialDigitSum().sumOfDigitsOfFactorial(1)).isEqualTo(1)
    }

    @Test
    fun sum_of_digits_of_factorial_10_is_27() {
        Assertions.assertThat(FactorialDigitSum().sumOfDigitsOfFactorial(10)).isEqualTo(27)
    }

    @Test
    fun sum_of_digits_of_factorial_100_is_648() {
        Assertions.assertThat(FactorialDigitSum().sumOfDigitsOfFactorial(100)).isEqualTo(648)
    }
}