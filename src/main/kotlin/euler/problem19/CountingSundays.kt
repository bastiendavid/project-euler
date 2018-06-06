package euler.problem19

/**
 * https://projecteuler.net/problem=19
 *
 * You are given the following information, but you may prefer to do some research for yourself.
 *
 * -  1 Jan 1900 was a Monday.
 * - Thirty days has September,
 *   April, June and November.
 *   All the rest have thirty-one,
 *   Saving February alone,
 *   Which has twenty-eight, rain or shine.
 *   And on leap years, twenty-nine.
 * - A leap year occurs on any year evenly divisible by 4, but not on a century unless it is divisible by 400.
 *
 * How many Sundays fell on the first of the month during the twentieth century (1 Jan 1901 to 31 Dec 2000)?
 */
class CountingSundays {

    val WEEK = listOf(DayOfWeek.MONDAY, DayOfWeek.TUESDAY, DayOfWeek.WEDNESDAY, DayOfWeek.THURSDAY, DayOfWeek.FRIDAY, DayOfWeek.SATURDAY, DayOfWeek.SUNDAY)

    fun isLeapYear(year: Int): Boolean {
        if (year % 100 == 0 && year % 400 != 0) return false
        return (year % 4 == 0)
    }

    fun sundaysTheFirst(untilYear: Int): Int {
        var year = 1900
        var month = 1
        var firstDayOfTheMonth = DayOfWeek.MONDAY
        var sundaysThFirstCount = 0

        while (year <= untilYear) {
            val daysInMonth = daysInMonth(year, month)
            firstDayOfTheMonth = WEEK[(WEEK.indexOf(firstDayOfTheMonth) + daysInMonth) % WEEK.size]
            month = if (month == 12) 1 else month + 1
            if (month == 1) {
                year++
            }
            if (year > untilYear) {
                break
            }
            if (firstDayOfTheMonth == DayOfWeek.SUNDAY) {
                sundaysThFirstCount++
            }
        }

        return sundaysThFirstCount
    }

    fun daysInMonth(year: Int, month: Int): Int {
        return when (month) {
            1, 3, 5, 7, 8, 10, 12 -> 31
            2 -> if (isLeapYear(year)) 29 else 28
            else -> 30
        }
    }
}