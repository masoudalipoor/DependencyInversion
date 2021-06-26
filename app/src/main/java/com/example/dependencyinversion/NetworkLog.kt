package com.example.dependencyinversion

import java.io.IOException

/**
 *
 *  you can connect to server and push data log to server side
 */

class NetworkLog: Logger {

    override fun logInformation(information: String) {
    }

    override fun logException(ex: IOException) {
    }

    override fun logMessage(message: String) {
    }
}