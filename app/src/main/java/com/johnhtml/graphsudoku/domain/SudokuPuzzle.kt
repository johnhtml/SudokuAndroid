package com.johnhtml.graphsudoku.domain

import java.io.Serializable
import java.util.*
import kotlin.collections.LinkedHashMap

/*
: Serializable, means we are implementing this interface in this class
 */
data class SudokuPuzzle(
    val boundary: Int,
    val difficulty: Difficulty,
    val graph: LinkedHashMap<Int, LinkedList<SudokuNode>> = buildNewSudoku(
        boundary,
        difficulty
    ).graph,
    var elapsedTime: Long = 0L
) : Serializable {
    fun getValue(): LinkedHashMap<Int, LinkedList<SudokuNode>> = graph
}
