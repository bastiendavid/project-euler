package euler.problem1

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class MultiplesOf3and5Test {

    // 3 5 6 9 -> 23
    @Test
    fun sum_of_multiples_of_3_and_5_below_10_is_23() {
        // Given
        val multiples = MultiplesOf3and5()

        // When
        val sum = multiples.sum(10)

        // Then
        Assertions.assertThat(sum).isEqualTo(23)
    }

    // 3 5 6 9 10 12 15 18 -> 78
    @Test
    fun sum_of_multiples_of_3_and_5_below_20_is_78() {
        // Given
        val multiples = MultiplesOf3and5()

        // When
        val sum = multiples.sum(20)

        // Then
        Assertions.assertThat(sum).isEqualTo(78)
    }

    @Test
    fun sum_of_multiples_of_3_and_5_below_1000_is_233168() {
        // Given
        val multiples = MultiplesOf3and5()

        // When
        val sum = multiples.sum(1000)

        // Then
        Assertions.assertThat(sum).isEqualTo(233168)
    }
}
