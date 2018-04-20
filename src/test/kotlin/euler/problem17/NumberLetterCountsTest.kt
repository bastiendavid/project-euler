package euler.problem17

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

internal class NumberLetterCountsTest {

    @Test
    fun write_19_first_numbers_in_letters() {
        Assertions.assertThat(NumberLetterCounts().inLetters(1)).isEqualTo("one")
        Assertions.assertThat(NumberLetterCounts().inLetters(2)).isEqualTo("two")
        Assertions.assertThat(NumberLetterCounts().inLetters(3)).isEqualTo("three")
        Assertions.assertThat(NumberLetterCounts().inLetters(4)).isEqualTo("four")
        Assertions.assertThat(NumberLetterCounts().inLetters(5)).isEqualTo("five")
        Assertions.assertThat(NumberLetterCounts().inLetters(6)).isEqualTo("six")
        Assertions.assertThat(NumberLetterCounts().inLetters(7)).isEqualTo("seven")
        Assertions.assertThat(NumberLetterCounts().inLetters(8)).isEqualTo("eight")
        Assertions.assertThat(NumberLetterCounts().inLetters(9)).isEqualTo("nine")
        Assertions.assertThat(NumberLetterCounts().inLetters(10)).isEqualTo("ten")
        Assertions.assertThat(NumberLetterCounts().inLetters(11)).isEqualTo("eleven")
        Assertions.assertThat(NumberLetterCounts().inLetters(12)).isEqualTo("twelve")
        Assertions.assertThat(NumberLetterCounts().inLetters(13)).isEqualTo("thirteen")
        Assertions.assertThat(NumberLetterCounts().inLetters(14)).isEqualTo("fourteen")
        Assertions.assertThat(NumberLetterCounts().inLetters(15)).isEqualTo("fifteen")
        Assertions.assertThat(NumberLetterCounts().inLetters(16)).isEqualTo("sixteen")
        Assertions.assertThat(NumberLetterCounts().inLetters(17)).isEqualTo("seventeen")
        Assertions.assertThat(NumberLetterCounts().inLetters(18)).isEqualTo("eighteen")
        Assertions.assertThat(NumberLetterCounts().inLetters(19)).isEqualTo("nineteen")
    }

    @Test
    fun write_numbers_between_20_and_99() {
        Assertions.assertThat(NumberLetterCounts().inLetters(23)).isEqualTo("twenty-three")
        Assertions.assertThat(NumberLetterCounts().inLetters(25)).isEqualTo("twenty-five")
        Assertions.assertThat(NumberLetterCounts().inLetters(34)).isEqualTo("thirty-four")
        Assertions.assertThat(NumberLetterCounts().inLetters(42)).isEqualTo("forty-two")
        Assertions.assertThat(NumberLetterCounts().inLetters(50)).isEqualTo("fifty")
        Assertions.assertThat(NumberLetterCounts().inLetters(67)).isEqualTo("sixty-seven")
        Assertions.assertThat(NumberLetterCounts().inLetters(79)).isEqualTo("seventy-nine")
        Assertions.assertThat(NumberLetterCounts().inLetters(81)).isEqualTo("eighty-one")
        Assertions.assertThat(NumberLetterCounts().inLetters(98)).isEqualTo("ninety-eight")
    }

    @Test
    fun write_numbers_between_100_and_999() {
        Assertions.assertThat(NumberLetterCounts().inLetters(123)).isEqualTo("one hundred and twenty-three")
        Assertions.assertThat(NumberLetterCounts().inLetters(284)).isEqualTo("two hundred and eighty-four")
        Assertions.assertThat(NumberLetterCounts().inLetters(348)).isEqualTo("three hundred and forty-eight")
        Assertions.assertThat(NumberLetterCounts().inLetters(412)).isEqualTo("four hundred and twelve")
        Assertions.assertThat(NumberLetterCounts().inLetters(571)).isEqualTo("five hundred and seventy-one")
        Assertions.assertThat(NumberLetterCounts().inLetters(614)).isEqualTo("six hundred and fourteen")
        Assertions.assertThat(NumberLetterCounts().inLetters(725)).isEqualTo("seven hundred and twenty-five")
        Assertions.assertThat(NumberLetterCounts().inLetters(800)).isEqualTo("eight hundred")
        Assertions.assertThat(NumberLetterCounts().inLetters(915)).isEqualTo("nine hundred and fifteen")
    }

    @Test
    fun write_number_1000() {
        Assertions.assertThat(NumberLetterCounts().inLetters(1000)).isEqualTo("one thousand")
    }

    @Test
    fun count_letters_of_number() {
        Assertions.assertThat(NumberLetterCounts().countLetters(1000)).isEqualTo(11)
        Assertions.assertThat(NumberLetterCounts().countLetters(725)).isEqualTo(25)
    }

    @Test
    fun count_letters_from_1_to_number() {
        Assertions.assertThat(NumberLetterCounts().countLettersFrom1To(3)).isEqualTo(11)
        Assertions.assertThat(NumberLetterCounts().countLettersFrom1To(5)).isEqualTo(19)
    }

    @Test
    fun count_letters_from_1_to_1000() {
        Assertions.assertThat(NumberLetterCounts().countLettersFrom1To(1000)).isEqualTo(21124)
    }
}