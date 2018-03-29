package euler.problem4

/**
 * A palindromic number reads the same both ways.
 * The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */
class LargestPalindromeProduct {
    fun palindromeProductOfNumberOf3Digits(): Int {
        var max = 999 * 999
        while (max > 0) {
            if (isPalindrome(max) && has2FactorsWith3Digits(max)) {
                return max
            }
            max--
        }
        return -1
    }

    fun has2FactorsWith3Digits(number: Int): Boolean {
        for (i in 999.downTo(100)) {
            if (number % i == 0) {
                return numberOfDigits(number / i) == 3
            }
        }
        return false
    }

    fun isPalindrome(number: Int): Boolean {
        return number.toString().reversed() == number.toString()
    }

    fun numberOfDigits(number: Int): Int {
        return number.toString().length
    }

}