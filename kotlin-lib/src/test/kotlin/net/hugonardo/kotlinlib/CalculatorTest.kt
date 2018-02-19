package net.hugonardo.kotlinlib

import org.hamcrest.CoreMatchers.`is`
import org.junit.Assert.assertThat
import org.junit.Test

class CalculatorTest {

    // given a Calculator
    private val calculator = Calculator()

    @Test
    fun `when add 1 + 1, then the result should be 2`() {

        // when add 1 + 1
        val result = calculator.add(1, 1)

        // then the result should be 2
        assertThat(result, `is`(2))
    }

    @Test
    fun `when subtract 1 - 1, then the result should be 0`() {
        // when subtract 1 - 1
        val result = calculator.subtract(1, 1)

        // then the result should be 0
        assertThat(result, `is`(0))
    }

    @Test
    fun `when divide 4 per 2, then the result should be 2`() {
        // when divide 4 / 2
        val result = calculator.divide(4, 2)

        // then the result should be 2
        assertThat(result, `is`(2))
    }

    @Test(expected = IllegalArgumentException::class)
    fun `when divide 4 per 0, then a IllegalArgumentException should be thrown`() {
        // when divide 4 / 2
        calculator.divide(4, 0)
        // then a IllegalArgumentException should be thrown
    }
}