package euler.problem12

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class HighlyDivisibleTriangularNumberTest {

    @Test
    fun the_4th_triangle_number_is_10() {
        assertThat(HighlyDivisibleTriangularNumber().triangleNumber(4)).isEqualTo(10)
    }

    @Test
    fun the_7th_triangle_number_is_28() {
        assertThat(HighlyDivisibleTriangularNumber().triangleNumber(7)).isEqualTo(28)
    }

    @Test
    fun first_triangle_number_with_at_least_4_divisors_is_6() {
        assertThat(HighlyDivisibleTriangularNumber().firstTriangleNumberWithAtLeastNDivisors(4)).isEqualTo(6)
    }

    @Test
    fun first_triangle_number_with_at_least_500_divisors_is_76576500() {
        assertThat(HighlyDivisibleTriangularNumber().firstTriangleNumberWithAtLeastNDivisors(500)).isEqualTo(76576500)
    }
}