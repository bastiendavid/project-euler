package euler.problem22

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

internal class NamesScoresTest {

    @Test
    fun read_file_and_convert_to_list() {
        Assertions.assertThat(NamesScores().names).hasSize(5163)
    }

    @Test
    fun compute_alphabetical_value() {
        Assertions.assertThat(NamesScores().alphabeticalValue("COLIN")).isEqualTo(53)
        Assertions.assertThat(NamesScores().alphabeticalValue("JOHN")).isEqualTo(47)
        Assertions.assertThat(NamesScores().alphabeticalValue("ALBERT")).isEqualTo(58)
        Assertions.assertThat(NamesScores().alphabeticalValue("JACK")).isEqualTo(25)
    }

    @Test
    fun compute_score_of_list() {
        Assertions.assertThat(NamesScores().scoreOfList(listOf("JOHN", "ALBERT", "JACK"))).isEqualTo(58 * 1 + 25 * 2 + 47 * 3)
    }

    @Test
    fun compute_score_of_names() {
        Assertions.assertThat(NamesScores().scoreOfNames()).isEqualTo(871198282)
    }
}