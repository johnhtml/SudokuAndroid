package com.johnhtml.graphsudoku.domain

import java.lang.Exception

interface InterfaceStatisticsRepository {
    suspend fun  getStatistics(
        onSuccess: (UserStatistics) -> Unit,
        onError: (Exception) -> Unit
    )

    suspend fun updateStatistic(
        time: Long,
        diff: Difficulty,
        boundary: Int,
        onSuccess: (isRecord: Boolean) -> Unit,
        onError: (Exception) -> Unit
    )
}