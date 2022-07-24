package com.johnhtml.graphsudoku.common

import kotlinx.coroutines.Job


/*
EVENT is a generic type
 */
abstract class BaseLogic<EVENT> {

    protected lateinit var jobTraker: Job
    abstract fun onEvent(event: EVENT)

}