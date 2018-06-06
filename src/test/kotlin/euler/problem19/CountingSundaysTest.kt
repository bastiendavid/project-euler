package euler.problem19

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

internal class CountingSundaysTest {

    @Test
    fun only_years_divisible_by_4_are_leap_years() {
        Assertions.assertThat(CountingSundays().isLeapYear(1901)).isFalse()
        Assertions.assertThat(CountingSundays().isLeapYear(1902)).isFalse()
        Assertions.assertThat(CountingSundays().isLeapYear(1903)).isFalse()
        Assertions.assertThat(CountingSundays().isLeapYear(1904)).isTrue()
        Assertions.assertThat(CountingSundays().isLeapYear(1905)).isFalse()
    }

    @Test
    fun first_years_of_century_are_not_leap_years_if_not_divisible_by_400() {
        Assertions.assertThat(CountingSundays().isLeapYear(1900)).isFalse()
        Assertions.assertThat(CountingSundays().isLeapYear(1800)).isFalse()
    }

    @Test
    fun first_years_of_century_are_leap_years_if_divisible_by_400() {
        Assertions.assertThat(CountingSundays().isLeapYear(2000)).isTrue()
    }

    @Test
    fun days_in_month_for_year_1900() {
        Assertions.assertThat(CountingSundays().daysInMonth(1900, 1)).isEqualTo(31)
        Assertions.assertThat(CountingSundays().daysInMonth(1900, 2)).isEqualTo(28)
        Assertions.assertThat(CountingSundays().daysInMonth(1900, 3)).isEqualTo(31)
        Assertions.assertThat(CountingSundays().daysInMonth(1900, 4)).isEqualTo(30)
        Assertions.assertThat(CountingSundays().daysInMonth(1900, 5)).isEqualTo(31)
        Assertions.assertThat(CountingSundays().daysInMonth(1900, 6)).isEqualTo(30)
        Assertions.assertThat(CountingSundays().daysInMonth(1900, 7)).isEqualTo(31)
        Assertions.assertThat(CountingSundays().daysInMonth(1900, 8)).isEqualTo(31)
        Assertions.assertThat(CountingSundays().daysInMonth(1900, 9)).isEqualTo(30)
        Assertions.assertThat(CountingSundays().daysInMonth(1900, 10)).isEqualTo(31)
        Assertions.assertThat(CountingSundays().daysInMonth(1900, 11)).isEqualTo(30)
        Assertions.assertThat(CountingSundays().daysInMonth(1900, 12)).isEqualTo(31)
    }

    @Test
    fun days_in_month_for_year_1904() {
        Assertions.assertThat(CountingSundays().daysInMonth(1904, 1)).isEqualTo(31)
        Assertions.assertThat(CountingSundays().daysInMonth(1904, 2)).isEqualTo(29)
        Assertions.assertThat(CountingSundays().daysInMonth(1904, 3)).isEqualTo(31)
        Assertions.assertThat(CountingSundays().daysInMonth(1904, 4)).isEqualTo(30)
        Assertions.assertThat(CountingSundays().daysInMonth(1904, 5)).isEqualTo(31)
        Assertions.assertThat(CountingSundays().daysInMonth(1904, 6)).isEqualTo(30)
        Assertions.assertThat(CountingSundays().daysInMonth(1904, 7)).isEqualTo(31)
        Assertions.assertThat(CountingSundays().daysInMonth(1904, 8)).isEqualTo(31)
        Assertions.assertThat(CountingSundays().daysInMonth(1904, 9)).isEqualTo(30)
        Assertions.assertThat(CountingSundays().daysInMonth(1904, 10)).isEqualTo(31)
        Assertions.assertThat(CountingSundays().daysInMonth(1904, 11)).isEqualTo(30)
        Assertions.assertThat(CountingSundays().daysInMonth(1904, 12)).isEqualTo(31)
    }

    @Test
    fun list_sundays_the_first_for_first_years_of_century() {
        Assertions.assertThat(CountingSundays().sundaysTheFirst(1900)).isEqualTo(2)
        Assertions.assertThat(CountingSundays().sundaysTheFirst(1901)).isEqualTo(2 + 2)
        Assertions.assertThat(CountingSundays().sundaysTheFirst(1902)).isEqualTo(2 + 2 + 1)
        Assertions.assertThat(CountingSundays().sundaysTheFirst(1903)).isEqualTo(2 + 2 + 1 + 3)
        Assertions.assertThat(CountingSundays().sundaysTheFirst(1904)).isEqualTo(2 + 2 + 1 + 3 + 1)
    }

    @Test
    fun list_sundays_the_first_from_1900_to_2000() {
        Assertions.assertThat(CountingSundays().sundaysTheFirst(2000)).isEqualTo(173)
    }
}