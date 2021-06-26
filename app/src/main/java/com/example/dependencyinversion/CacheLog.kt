package com.example.dependencyinversion

import java.io.IOException

/**
 *
 *  save data in database
 */

class CacheLog: Logger {

    override fun logInformation(information: String) {
    }

    override fun logException(ex: IOException) {
    }

    override fun logMessage(message: String) {
    }
}