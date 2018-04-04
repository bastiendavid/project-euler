package euler.problem8

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

internal class LargestProductInASeriesTest {

    @Test
    fun largest_product_of_four_adjacent_numbers_in_series_is_5832() {
        Assertions.assertThat(LargestProductInASeries().product(4)).isEqualTo(5832)
    }

    @Test
    fun largest_product_of_thirteen_adjacent_numbers_in_series_is_23514624000() {
        Assertions.assertThat(LargestProductInASeries().product(13)).isEqualTo(23514624000)
    }

    @Test
    fun largest_product_of_four_adjacent_numbers_in__some_short_series() {
        Assertions.assertThat(LargestProductInASeries().product(4, "101114023054068052015055")).isEqualTo(4)
        Assertions.assertThat(LargestProductInASeries().product(4, "1114")).isEqualTo(4)
    }

    @Test
    fun can_find_all_substrings_without_zero_of_length() {
        Assertions.assertThat(LargestProductInASeries().substringsWithoutZeroOfLength("1234506", 4)).containsExactlyInAnyOrderElementsOf(listOf("1234", "2345"))
    }

    @Test
    fun can_find_all_substrings_of_length() {
        Assertions.assertThat(LargestProductInASeries().substringsOfLength("123456", 3)).containsExactlyInAnyOrderElementsOf(listOf("123", "234", "345", "456"))
    }

    @Test
    fun string_1234_multiplied_is_24() {
        Assertions.assertThat(LargestProductInASeries().stringToMultipliedLong("1234")).isEqualTo(24)
    }
}