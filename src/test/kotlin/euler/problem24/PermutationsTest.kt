package euler.problem24

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

internal class PermutationsTest {
    @Test
    fun compute_permutations() {
        Assertions.assertThat(Permutations().of("ab")).containsExactly("ab", "ba")
        Assertions.assertThat(Permutations().of("abc")).containsExactly("abc", "acb", "bac", "bca", "cab", "cba")
    }
}