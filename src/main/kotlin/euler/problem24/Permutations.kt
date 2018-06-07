package euler.problem24

class Permutations {
    fun of(string: String): List<String> {

        var permutations = listOf(ComputedPermutation(string))

        while (permutations[0].hasMoreToCompute()) {
            permutations = permutations.flatMap { it.compute() }
        }
        return permutations.map { it.current }
    }
}