package com.johnhtml.graphsudoku.domain

interface InterfaceGameDataStorage {

    suspend fun updateGame(game: SudokuPuzzle): GameStorageResult
    suspend fun updateNode(x: Int, y: Int, elapsedTime: Long): GameStorageResult
    suspend fun getCurrentGame(): GameStorageResult

}

/*
sealed class to represent the state of the app
 */
sealed class GameStorageResult{
    data class onSuccess(val currentGame: SudokuPuzzle): GameStorageResult()
    data class onError(val exception: Exception): GameStorageResult()
}


