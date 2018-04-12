package euler.problem14

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

internal class LongestCollatzSequenceTest {

    @Test
    fun next_element_in_sequence_for_13_is_40() {
        Assertions.assertThat(LongestCollatzSequence().next(13)).isEqualTo(40)
    }

    @Test
    fun next_element_in_sequence_for_5_is_16() {
        Assertions.assertThat(LongestCollatzSequence().next(5)).isEqualTo(16)
    }

    @Test
    fun next_element_in_sequence_for_4_is_2() {
        Assertions.assertThat(LongestCollatzSequence().next(4)).isEqualTo(2)
    }

    @Test
    fun next_element_in_sequence_for_6_is_6() {
        Assertions.assertThat(LongestCollatzSequence().next(6)).isEqualTo(3)
    }

    @Test
    fun compute_collatz_sequence_for_1() {
        Assertions.assertThat(LongestCollatzSequence().sequence(1)).containsExactly(1)
    }

    @Test
    fun compute_collatz_sequence_for_2() {
        Assertions.assertThat(LongestCollatzSequence().sequence(2)).containsExactly(2, 1)
    }

    @Test
    fun compute_collatz_sequence_for_13() {
        Assertions.assertThat(LongestCollatzSequence().sequence(13)).containsExactly(13, 40, 20, 10, 5, 16, 8, 4, 2, 1)
    }

    @Test
    fun longest_chain_starting_below_4_is_for_3() {
        Assertions.assertThat(LongestCollatzSequence().startingNumberForLongestChainBelow(4)).isEqualTo(3)
    }

    @Test
    fun longest_chain_starting_below_10_is_for_9() {
        Assertions.assertThat(LongestCollatzSequence().startingNumberForLongestChainBelow(10)).isEqualTo(9)
    }

    @Test
    fun longest_chain_starting_below_1_million_is_for_9() {
        Assertions.assertThat(LongestCollatzSequence().startingNumberForLongestChainBelow(1000000)).isEqualTo(837799)
    }
}