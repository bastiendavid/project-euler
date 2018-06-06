package euler.problem22

/**
 * https://projecteuler.net/problem=22
 *
 * Using names.txt (right click and 'Save Link/Target As...'), a 46K text file containing over five-thousand first names, begin by sorting it into alphabetical order. Then working out the alphabetical value for each name, multiply this value by its alphabetical position in the list to obtain a name score.
 *
 * For example, when the list is sorted into alphabetical order, COLIN, which is worth 3 + 15 + 12 + 9 + 14 = 53, is the 938th name in the list. So, COLIN would obtain a score of 938 × 53 = 49714.
 *
 * What is the total of all the name scores in the file?
 */
class NamesScores {

    val names: List<String> = NamesScores::class.java.getResource("/problem22/names.txt").readText().split(",").map { it.replace("\"", "") }

    object Constants {
        const val ALPHABET_OFFSET = 64
    }

    fun alphabeticalValue(name: String): Int {
        return name.map { it.toInt() - Constants.ALPHABET_OFFSET }.reduce { acc, i -> acc + i }
    }

    fun scoreOfList(listOf: List<String>): Int {
        return listOf.sorted().mapIndexed { index, s -> (index + 1) * alphabeticalValue(s) }.reduce { acc, i -> acc + i }
    }

    fun scoreOfNames(): Int {
        return scoreOfList(names)
    }
}