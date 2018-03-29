package euler.problem2

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test
import java.util.*

internal class FibonacciNumbersTest {

    @Test
    fun fibonacci_numbers_below_1_is_empty() {
        Assertions.assertThat(FibonacciNumbers().numbers(1)).isEmpty()
    }

    @Test
    fun fibonacci_numbers_below_2_only_contains_1() {
        Assertions.assertThat(FibonacciNumbers().numbers(2)).isEqualTo(Arrays.asList(1))
    }

    @Test
    fun fibonacci_numbers_below_20() {
        Assertions.assertThat(FibonacciNumbers().numbers(20)).isEqualTo(Arrays.asList(1, 2, 3, 5, 8, 13))
    }
}