package me.zoldater.leetcode.core

data class TreeNode(
    var value: Int,
    var left: TreeNode? = null,
    var right: TreeNode? = null
)

fun TreeNode.isLeaf(): Boolean = left == null && right == null