package euler.problem9

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

internal class SpecialPythagoreanTripletTest {

    @Test
    fun triplet_3_4_5_is_pythagorean() {
        Assertions.assertThat(SpecialPythagoreanTriplet().isPythagoreanTriplet(3, 4, 5)).isTrue()
    }

    @Test
    fun triplet_3_4_6_is_not_pythagorean() {
        Assertions.assertThat(SpecialPythagoreanTriplet().isPythagoreanTriplet(3, 4, 6)).isFalse()
    }

    @Test
    fun triplet_1_1_1_is_not_pythagorean() {
        Assertions.assertThat(SpecialPythagoreanTriplet().isPythagoreanTriplet(1, 1, 1)).isFalse()
    }

    @Test
    fun triplet_1_2_3_has_not_sum_of_1000() {
        Assertions.assertThat(SpecialPythagoreanTriplet().hasSumOf1000(1, 2, 3)).isFalse()
    }

    @Test
    fun triplet_400_200_400_has_sum_of_1000() {
        Assertions.assertThat(SpecialPythagoreanTriplet().hasSumOf1000(400, 200, 400)).isTrue()
    }

    @Test
    fun can_find_a_triplet_with_sum_of_1000() {
        Assertions.assertThat(SpecialPythagoreanTriplet().findTriplet()).isEqualToComparingFieldByField(Triplet(200, 375, 425))
    }
}