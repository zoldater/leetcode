package me.zoldater.leetcode.tasks

import me.zoldater.leetcode.core.TreeNode
import org.junit.Test
import kotlin.test.assertEquals

internal class Task104SolutionTest {
    @Test
    fun testExample1() {
        val root = TreeNode(
            value = 3,
            left = TreeNode(value = 9),
            right = TreeNode(
                value = 20,
                left = TreeNode(value = 15),
                right = TreeNode(value = 7)
            )
        )
        assertEquals(3, maxDepth(root))
    }

    @Test
    fun testExample2() {
        val root = TreeNode(
            value = 1,
            right = TreeNode(value = 2)
        )
        assertEquals(2, maxDepth(root))
    }
}