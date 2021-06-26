package com.example.dependencyinversion

import java.io.IOException

interface Logger {

    fun logInformation(information: String)
    fun logException(ex: IOException)
    fun logMessage(message: String)

}