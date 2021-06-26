package com.example.dependencyinversion

import java.io.IOException

class LogContext() {

    lateinit var logger: Logger

    constructor(logger: Logger) : this() {
        this.logger = logger
    }

    fun addInformation(info: String) {
        logger.logInformation(info)
    }

    fun addException(exception: IOException) {
        logger.logException(exception)
    }

    fun addMessage(message: String) {
        logger.logMessage(message)
    }
}