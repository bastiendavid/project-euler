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
    fun find_divisors_of_10() {
        assertThat(HighlyDivisibleTriangularNumber().divisorsOf(10)).containsExactlyInAnyOrderElementsOf(listOf(1, 2, 5, 10))
    }

    @Test
    fun find_divisors_of_28() {
        assertThat(HighlyDivisibleTriangularNumber().divisorsOf(28)).containsExactlyInAnyOrderElementsOf(listOf(1, 2, 4, 7, 14, 28))
    }

    @Test
    fun compute_all_products_of_list_of_1_element() {
        assertThat(HighlyDivisibleTriangularNumber().productsOf(listOf(2))).containsExactlyInAnyOrderElementsOf(listOf(2))
    }

    @Test
    fun compute_all_products_of_list_of_2_elements() {
        assertThat(HighlyDivisibleTriangularNumber().productsOf(listOf(2, 3))).containsExactlyInAnyOrderElementsOf(listOf(2, 3, 6))
    }

    @Test
    fun compute_all_products_of_list_of_3_elements() {
        assertThat(HighlyDivisibleTriangularNumber().productsOf(listOf(2, 3, 5))).containsExactlyInAnyOrderElementsOf(listOf(2, 3, 5, 6, 10, 15, 30))
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