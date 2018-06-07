package euler.problem24

data class ComputedPermutation(private val remainder: String, val current: String = "") {
    fun compute(): List<ComputedPermutation> {
        if (!hasMoreToCompute()) {
            return listOf(ComputedPermutation(remainder, current))
        }

        return remainder.mapIndexed { index, c -> ComputedPermutation(remainder.removeRange(index, index + 1), "$current$c") }
    }

    fun hasMoreToCompute(): Boolean {
        return !remainder.isEmpty()
    }

}