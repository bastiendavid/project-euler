package euler.problem4

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

internal class LargestPalindromeProductTest {

    @Test
    fun largest_palindrome_with_product_of_2_numbers_with_3_digits() {
        Assertions.assertThat(LargestPalindromeProduct().palindromeProductOfNumberOf3Digits()).isEqualTo(906609)
    }

    @Test
    fun is_9009_palindrome_is_true() {
        Assertions.assertThat(LargestPalindromeProduct().isPalindrome(9009)).isTrue()
    }

    @Test
    fun is_9008_palindrome_is_false() {
        Assertions.assertThat(LargestPalindromeProduct().isPalindrome(9008)).isFalse()
    }

    @Test
    fun is_1331_palindrome_is_true() {
        Assertions.assertThat(LargestPalindromeProduct().isPalindrome(1331)).isTrue()
    }

    @Test
    fun number_999_has_3_digits() {
        Assertions.assertThat(LargestPalindromeProduct().numberOfDigits(999)).isEqualTo(3)
    }

    @Test
    fun number_86_has_2_digits() {
        Assertions.assertThat(LargestPalindromeProduct().numberOfDigits(86)).isEqualTo(2)
    }

    @Test
    fun number_321492_has_2_factors_with_3_digits() {
        Assertions.assertThat(LargestPalindromeProduct().has2FactorsWith3Digits(367 * 876)).isTrue()
    }

    @Test
    fun number_10001_has_not_2_factors_with_3_digits() {
        Assertions.assertThat(LargestPalindromeProduct().has2FactorsWith3Digits(10001)).isFalse()
    }
}