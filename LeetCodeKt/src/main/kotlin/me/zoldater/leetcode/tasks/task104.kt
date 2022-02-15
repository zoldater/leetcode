package me.zoldater.leetcode.tasks

import me.zoldater.leetcode.core.TreeNode

fun maxDepth(root: TreeNode?): Int = root?.let { doFindDepth(it, 1) } ?: 0

private fun doFindDepth(node: TreeNode?, currentDepth: Int): Int =
    if (node == null) -1
    else arrayOf(
        currentDepth,
        doFindDepth(node.left, currentDepth + 1),
        doFindDepth(node.right, currentDepth + 1)
    ).max() ?: -1