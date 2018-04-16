package euler.problem15

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

internal class LatticePathsTest {

    @Test
    fun number_of_unique_paths_for_grid_of_2() {
        Assertions.assertThat(LatticePaths().numberOfUniquePaths(2)).isEqualTo(6)
    }

    @Test
    fun number_of_unique_paths_for_grid_of_3() {
        Assertions.assertThat(LatticePaths().numberOfUniquePaths(3)).isEqualTo(20)
    }

    @Test
    fun number_of_unique_paths_for_grid_of_4() {
        Assertions.assertThat(LatticePaths().numberOfUniquePaths(4)).isEqualTo(70)
    }

    @Test
    fun number_of_unique_paths_for_grid_of_5() {
        Assertions.assertThat(LatticePaths().numberOfUniquePaths(5)).isEqualTo(252)
    }

    @Test
    fun number_of_unique_paths_for_grid_of_20() {
        Assertions.assertThat(LatticePaths().numberOfUniquePaths(20)).isEqualTo(137846528820)
    }
}