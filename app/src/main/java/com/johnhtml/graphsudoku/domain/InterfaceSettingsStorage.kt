package com.johnhtml.graphsudoku.domain

interface InterfaceSettingsStorage {
    suspend fun  getSettings(): SettingsStorageResult
    suspend fun updateSettings(settings: Settings): SettingsStorageResult
}

/*
sealed class to represent the state of the app
 */
sealed class SettingsStorageResult{
    data class onSuccess(val settings: Settings): SettingsStorageResult()
    data class onError(val exception: Exception): SettingsStorageResult()
}