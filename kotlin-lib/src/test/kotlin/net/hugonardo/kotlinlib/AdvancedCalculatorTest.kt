package net.hugonardo.kotlinlib

import org.hamcrest.CoreMatchers.`is`
import org.junit.Assert.assertThat
import org.junit.Test

class AdvancedCalculatorTest {

    // given an AdvancedCalculator
    private val calculator = AdvancedCalculator()

    @Test
    fun `when 2 pow 2, then the result should be 4`() {
        // when 2 pow 2
        val result = calculator.pow(2, 2)

        // then the result should be 4
        assertThat(result, `is`(4))
    }

    @Test
    fun `when 2 pow 3, then the result should be 8`() {
        // when 2 pow 2
        val result = calculator.pow(2, 3)

        // then the result should be 4
        assertThat(result, `is`(8))
    }

    @Test
    fun `when 3 pow 2, then the result should be 9`() {
        // when 2 pow 2
        val result = calculator.pow(3, 2)

        // then the result should be 4
        assertThat(result, `is`(9))
    }
}