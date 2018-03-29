package euler.problem2

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class EvenFibonacciNumbersTest {

    // 1 2 3 5 8 -> 10
    @Test
    fun sum_of_even_terms_below_10_is_10() {
        // Given
        val numbers = EvenFibonacciNumbers()

        // When
        val sum = numbers.evenSum(10)

        // Then
        Assertions.assertThat(sum).isEqualTo(10)
    }

    // 1 2 3 5 8 13 -> 10
    @Test
    fun sum_of_even_terms_below_20_is_10() {
        // Given
        val numbers = EvenFibonacciNumbers()

        // When
        val sum = numbers.evenSum(20)

        // Then
        Assertions.assertThat(sum).isEqualTo(10)
    }

    // 1 2 3 5 8 13 21 34 -> 44
    @Test
    fun sum_of_even_terms_below_40_is_44() {
        // Given
        val numbers = EvenFibonacciNumbers()

        // When
        val sum = numbers.evenSum(40)

        // Then
        Assertions.assertThat(sum).isEqualTo(44)
    }

    @Test
    fun sum_of_even_terms_below_4_millions_is_44() {
        // Given
        val numbers = EvenFibonacciNumbers()

        // When
        val sum = numbers.evenSum(4000000)

        // Then
        Assertions.assertThat(sum).isEqualTo(4613732)
    }
}