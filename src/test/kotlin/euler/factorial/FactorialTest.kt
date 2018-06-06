package euler.factorial

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

internal class FactorialTest {

    @Test
    fun factorial_0_is_1() {
        Assertions.assertThat(Factorial() of 0).isEqualTo(1)
    }

    @Test
    fun factorial_1_is_1() {
        Assertions.assertThat(Factorial() of 1).isEqualTo(1)
    }

    @Test
    fun factorial_4_is_24() {
        Assertions.assertThat(Factorial() of 4).isEqualTo(24)
    }
}