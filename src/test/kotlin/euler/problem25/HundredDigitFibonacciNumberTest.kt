package euler.problem25

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

internal class HundredDigitFibonacciNumberTest {

    @Test
    fun first_fibonacci_number_with_2_digits_has_index_7() {
        Assertions.assertThat(HundredDigitFibonacciNumber().firstNumberWithDigits(2)).isEqualTo(7)
    }

    @Test
    fun first_fibonacci_number_with_3_digits_is_12() {
        Assertions.assertThat(HundredDigitFibonacciNumber().firstNumberWithDigits(3)).isEqualTo(12)
    }

    @Test
    fun first_fibonacci_number_with_1000_digits_is_4782() {
        Assertions.assertThat(HundredDigitFibonacciNumber().firstNumberWithDigits(1000)).isEqualTo(4782)
    }
}