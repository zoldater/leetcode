package me.zoldater.leetcode.tasks

fun singleNumber(nums: IntArray): Int {
    val visitedSet = hashSetOf<Int>()
    nums.forEach {
        if (it in visitedSet) visitedSet.remove(it)
        else visitedSet.add(it)
    }
    return visitedSet.single()
}