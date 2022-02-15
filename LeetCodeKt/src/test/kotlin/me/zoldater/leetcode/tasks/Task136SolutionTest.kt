package me.zoldater.leetcode.tasks

import org.junit.Test
import kotlin.test.assertEquals

internal class Task136SolutionTest {
    @Test
    fun testExample1() {
        assertEquals(1, singleNumber(intArrayOf(2, 2, 1)))
    }

    @Test
    fun testExample2() {
        assertEquals(4, singleNumber(intArrayOf(4, 1, 2, 1, 2)))
    }

    @Test
    fun testExample3() {
        assertEquals(1, singleNumber(intArrayOf(1)))
    }
}