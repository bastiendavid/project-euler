package euler.problem13

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

internal class LargeSumTest {

    @Test
    fun can_compute_sum_from_string() {
        val digits = "456\n" + "123"
        Assertions.assertThat(LargeSum().compute(digits)).isEqualTo(579.toBigInteger())
    }

    @Test
    fun can_find_ten_first_digits_of_sum() {
        val digits = "200000000000\n" + "123456789100"
        Assertions.assertThat(LargeSum().ten_first_digits_of_sum(digits)).isEqualTo("3234567891")
    }

    @Test
    fun can_find_ten_first_digits_of_large_sum() {
        Assertions.assertThat(LargeSum().ten_first_digits_of_large_sum()).isEqualTo("5537376230")
    }
}