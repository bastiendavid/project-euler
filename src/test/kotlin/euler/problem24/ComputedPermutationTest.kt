package euler.problem24

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

internal class ComputedPermutationTest {
    @Test
    fun no_longer_compute_when_remainder_is_empty() {
        Assertions.assertThat(ComputedPermutation("", "abc").compute()).containsExactly(ComputedPermutation("", "abc"))
    }

    @Test
    fun can_request_if_has_more_to_compute() {
        Assertions.assertThat(ComputedPermutation("", "abc").hasMoreToCompute()).isFalse()
        Assertions.assertThat(ComputedPermutation("abc").hasMoreToCompute()).isTrue()
    }

    @Test
    fun compute_generate_combinations_to_compute() {
        Assertions.assertThat(ComputedPermutation("abc").compute()).containsExactly(
                ComputedPermutation("bc", "a"),
                ComputedPermutation("ac", "b"),
                ComputedPermutation("ab", "c"))
    }
}