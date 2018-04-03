package euler.problem5

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test


internal class SmallestMultipleTest {

    @Test
    fun smallest_number_divisble_by_all_numbers_below_20() {
        Assertions.assertThat(SmallestMultiple().evenlyDivisibleBelow(20)).isEqualTo(232792560L)
        Assertions.assertThat(SmallestMultiple().evenlyDivisibleBelow(20)).isEqualTo((2 * 3 * 2 * 5 * 7 * 2 * 3 * 11 * 13 * 2 * 17 * 19).toLong())
    }

    @Test
    fun smallest_number_divisble_by_all_numbers_below_10() {
        Assertions.assertThat(SmallestMultiple().evenlyDivisibleBelow(10)).isEqualTo(2520L)
    }

    @Test
    fun smallest_number_divisble_by_all_numbers_below_2() {
        Assertions.assertThat(SmallestMultiple().evenlyDivisibleBelow(2)).isEqualTo(2L)
    }

    @Test
    fun smallest_number_divisble_by_all_numbers_below_3() {
        Assertions.assertThat(SmallestMultiple().evenlyDivisibleBelow(3)).isEqualTo(6L)
    }

    @Test
    fun smallest_number_divisble_by_all_numbers_below_4() {
        Assertions.assertThat(SmallestMultiple().evenlyDivisibleBelow(4)).isEqualTo(12L)
    }

    @Test
    fun smallest_number_divisble_by_all_numbers_below_5() {
        Assertions.assertThat(SmallestMultiple().evenlyDivisibleBelow(5)).isEqualTo((2 * 3 * 2 * 5).toLong())
    }

    @Test
    fun smallest_number_divisble_by_all_numbers_below_6() {
        Assertions.assertThat(SmallestMultiple().evenlyDivisibleBelow(6)).isEqualTo((2 * 3 * 2 * 5).toLong())
    }

    @Test
    fun smallest_number_divisble_by_all_numbers_below_7() {
        Assertions.assertThat(SmallestMultiple().evenlyDivisibleBelow(7)).isEqualTo((2 * 3 * 2 * 5 * 7).toLong())
    }

    @Test
    fun smallest_number_divisble_by_all_numbers_below_8() {
        Assertions.assertThat(SmallestMultiple().evenlyDivisibleBelow(8)).isEqualTo((2 * 3 * 2 * 5 * 7 * 2).toLong())
    }

    @Test
    fun smallest_number_divisble_by_all_numbers_below_9() {
        Assertions.assertThat(SmallestMultiple().evenlyDivisibleBelow(9)).isEqualTo((2 * 3 * 2 * 5 * 7 * 2 * 3).toLong())
    }

    @Test
    fun merge_collections_only_adds_new_elements_of_collection_2() {
        val c1 = listOf(2L, 2L, 3L)
        val c2 = listOf(2L, 3L, 3L)
        val expectedCollection = listOf(2L, 2L, 3L, 3L)
        Assertions.assertThat(SmallestMultiple().mergeCollections(c1, c2)).containsExactlyInAnyOrderElementsOf(expectedCollection)

    }
}