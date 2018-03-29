package euler.problem2

class FibonacciNumbers {

    fun numbers(below: Int): List<Int> {
        val numbers = ArrayList<Int>()
        if (below <= 1) {
            return numbers
        }
        numbers.add(1)
        if (below <= 2) {
            return numbers
        }
        numbers.add(2)
        var next = 3
        while (next < below) {
            numbers.add(next)
            next = numbers.last() + numbers[numbers.size - 2]
        }

        return numbers
    }
}