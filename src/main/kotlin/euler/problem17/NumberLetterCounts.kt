package euler.problem17

/**
 * https://projecteuler.net/problem=17
 * If the numbers 1 to 5 are written out in words: one, two, three, four, five, then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.
 *
 * If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, how many letters would be used?
 *
 *
 * NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and forty-two) contains 23 letters and 115 (one hundred and fifteen) contains 20 letters. The use of "and" when writing out numbers is in compliance with British usage.
 */
class NumberLetterCounts {

    fun inLetters(number: Int): String {
        return when (number) {
            in 1..19 -> inLettersBetween1and19(number)
            in 20..99 -> inLettersBetween20and99(number)
            in 100..999 -> inLettersBetween100and999(number)
            else -> "one thousand"
        }
    }

    private fun inLettersBetween1and19(number: Int): String {
        return when (number) {
            1 -> "one"
            2 -> "two"
            3 -> "three"
            4 -> "four"
            5 -> "five"
            6 -> "six"
            7 -> "seven"
            8 -> "eight"
            9 -> "nine"
            10 -> "ten"
            11 -> "eleven"
            12 -> "twelve"
            13 -> "thirteen"
            14 -> "fourteen"
            15 -> "fifteen"
            16 -> "sixteen"
            17 -> "seventeen"
            18 -> "eighteen"
            19 -> "nineteen"
            else -> {
                ""
            }
        }
    }

    private fun inLettersBetween20and99(number: Int): String {
        var inLetters = when (number) {
            in (20..29) -> "twenty"
            in (30..39) -> "thirty"
            in (40..49) -> "forty"
            in (50..59) -> "fifty"
            in (60..69) -> "sixty"
            in (70..79) -> "seventy"
            in (80..89) -> "eighty"
            in (90..99) -> "ninety"
            else -> {
                ""
            }
        }
        val units: Int = number - (number / 10) * 10
        if (units > 0) {
            inLetters = "$inLetters-${inLetters(units)}"
        }
        return inLetters
    }

    private fun inLettersBetween100and999(number: Int): String {
        val hundred = number / 100
        var inLetters = "${inLetters(hundred)} hundred"
        val remainder: Int = number - (hundred) * 100
        if (remainder > 0) {
            inLetters = "$inLetters and ${inLetters(remainder)}"
        }
        return inLetters
    }

    fun countLetters(number: Int): Int {
        return inLetters(number).replace(" ", "").replace("-", "").length
    }

    fun countLettersFrom1To(number: Int): Int {
        return (1..number).map { countLetters(it) }.reduce { acc, i -> acc + i }
    }

}