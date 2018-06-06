package euler.divisors

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

internal class DivisorsTest {

    @Test
    fun compute_all_products_of_list_of_1_element() {
        Assertions.assertThat(Divisors().productsOf(listOf(2))).containsExactlyInAnyOrderElementsOf(listOf(2))
    }

    @Test
    fun compute_all_products_of_list_of_2_elements() {
        Assertions.assertThat(Divisors().productsOf(listOf(2, 3))).containsExactlyInAnyOrderElementsOf(listOf(2, 3, 6))
    }

    @Test
    fun compute_all_products_of_list_of_3_elements() {
        Assertions.assertThat(Divisors().productsOf(listOf(2, 3, 5))).containsExactlyInAnyOrderElementsOf(listOf(2, 3, 5, 6, 10, 15, 30))
    }

    @Test
    fun find_divisors_of_10() {
        Assertions.assertThat(Divisors().divisorsOf(10)).containsExactlyInAnyOrderElementsOf(listOf(1, 2, 5, 10))
    }

    @Test
    fun find_divisors_of_28() {
        Assertions.assertThat(Divisors().divisorsOf(28)).containsExactlyInAnyOrderElementsOf(listOf(1, 2, 4, 7, 14, 28))
    }
}