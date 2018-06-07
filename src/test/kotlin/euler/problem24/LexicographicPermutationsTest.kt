package euler.problem24

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

internal class LexicographicPermutationsTest {

    @Test
    fun compute_sorted_lexicographic_permutations() {
        Assertions.assertThat(LexicographicPermutations().sortedPermutationsOf("012")).containsExactly("012", "021", "102", "120", "201", "210")
        Assertions.assertThat(LexicographicPermutations().sortedPermutationsOf("120")).containsExactly("012", "021", "102", "120", "201", "210")
    }

    @Test
    fun compute_the_millionth_permutation_by_brute_force_of_0123456789() {
        Assertions.assertThat(LexicographicPermutations().permutationNumberNByBruteForce("0123456789", 1000000)).isEqualTo("2783915604")
    }

    @Test
    fun number_of_permutations_of_0123_is_24() {
        Assertions.assertThat(LexicographicPermutations().numberOfPermutationsOf("0123")).isEqualTo(24)
    }

    @Test
    fun permutation_number_10_of_0123_is_1230() {
        Assertions.assertThat(LexicographicPermutations().permutationNumberN("0123", 10)).isEqualTo("1302")
    }

    @Test
    fun compute_the_millionth_permutation_of_0123456789() {
        Assertions.assertThat(LexicographicPermutations().permutationNumberN("0123456789", 1000000)).isEqualTo("2783915604")
    }
}