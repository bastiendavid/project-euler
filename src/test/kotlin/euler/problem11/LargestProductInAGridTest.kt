package euler.problem11

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

internal class LargestProductInAGridTest {

    @Test
    fun largest_product_of_four_in_a_grid_is_811502() {
        Assertions.assertThat(LargestProductInAGrid().findLargestProductOfFourInDefaultGrid()).isEqualTo(811502)
    }

    @Test
    fun can_build_a_grid() {
        // Given
        val gridAsString = "08 02 22 97 38\n" +
                "49 49 99 40 17\n" +
                "81 49 31 73 55\n" +
                "52 70 95 23 04\n" +
                "22 31 16 71 51"

        val expectedGrid = Grid(listOf(listOf(8, 2, 22, 97, 38),
                listOf(49, 49, 99, 40, 17),
                listOf(81, 49, 31, 73, 55),
                listOf(52, 70, 95, 23, 4),
                listOf(22, 31, 16, 71, 51)))

        // When
        val grid = LargestProductInAGrid().buildGridFrom(gridAsString)

        // Then
        Assertions.assertThat(grid).isEqualToComparingFieldByField(expectedGrid)
    }

    @Test
    fun find_largest_horizontal_product_of_3_in_grid() {
        // Given
        val gridAsString = "01 02 03 04 05\n" +
                "02 03 04 05 06\n" +
                "03 04 05 06 07\n" +
                "04 05 06 07 08\n" +
                "05 06 07 08 09"

        // When
        val largestProduct = LargestProductInAGrid().findLargestProductInGrid(gridAsString, 3)

        // Then
        Assertions.assertThat(largestProduct).isEqualTo(7 * 8 * 9)
    }

    @Test
    fun find_largest_vertical_product_of_3_in_grid() {
        // Given
        val gridAsString = "01 02 03 04 05\n" +
                "02 03 04 05 06\n" +
                "03 04 05 06 07\n" +
                "04 05 06 07 08\n" +
                "05 06 07 05 09"

        // When
        val largestProduct = LargestProductInAGrid().findLargestProductInGrid(gridAsString, 3)

        // Then
        Assertions.assertThat(largestProduct).isEqualTo(7 * 8 * 9)
    }

    @Test
    fun find_largest_diagonal_down_right_product_of_3_in_grid() {
        // Given
        val gridAsString = "01 02 03 04 05\n" +
                "02 03 04 05 06\n" +
                "03 04 10 06 07\n" +
                "04 05 06 10 08\n" +
                "05 06 07 05 09"

        // When
        val largestProduct = LargestProductInAGrid().findLargestProductInGrid(gridAsString, 3)

        // Then
        Assertions.assertThat(largestProduct).isEqualTo(10 * 10 * 9)
    }

    @Test
    fun find_largest_diagonal_down_left_product_of_3_in_grid() {
        // Given
        val gridAsString = "01 02 03 04 05\n" +
                "02 03 04 05 06\n" +
                "03 04 10 06 07\n" +
                "04 10 06 10 08\n" +
                "10 06 07 05 09"

        // When
        val largestProduct = LargestProductInAGrid().findLargestProductInGrid(gridAsString, 3)

        // Then
        Assertions.assertThat(largestProduct).isEqualTo(10 * 10 * 10)
    }
}