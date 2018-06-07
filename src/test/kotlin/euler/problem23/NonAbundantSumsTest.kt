package euler.problem23

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

internal class NonAbundantSumsTest {

    @Test
    fun _12_is_abundant() {
        Assertions.assertThat(NonAbundantSums().isAbundant(12)).isTrue()
    }

    @Test
    fun list_all_abundant_numbers_under_given_number() {
        Assertions.assertThat(NonAbundantSums().abundantNumbersUnder(20)).containsExactlyInAnyOrder(12, 18, 20)
    }

    @Test
    fun list_all_numbers_that_are_sum_of_two_abundant_numbers_under_given_number() {
        Assertions.assertThat(NonAbundantSums().sumOfTwoAbundantNumbersUnder(20)).containsExactlyInAnyOrder(12 + 12, 12 + 18, 12 + 20, 18 + 18, 18 + 20, 20 + 20)
    }

    @Test
    fun list_all_numbers_that_are_not_the_sum_of_two_abundant_numbers_under_given_number() {
        Assertions.assertThat(NonAbundantSums().notSumOfTwoAbundantNumbersUnder(20)).containsExactlyInAnyOrder(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20)
    }

    @Test
    fun sum_of_numbers_that_cannot_be_summeds_as_two_abundant_numbers() {
        Assertions.assertThat(NonAbundantSums().notSumOfTwoAbundantNumbersUnder(28123).sum()).isEqualTo(4179871L)
    }
}